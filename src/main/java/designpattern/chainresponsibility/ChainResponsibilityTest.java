package designpattern.chainresponsibility;

import java.util.Scanner;

public class ChainResponsibilityTest {
    private DispenseChain c1;

    public ChainResponsibilityTest(){
        this.c1=new Rupees50Dispenser();
        DispenseChain c2=new Rupees20Dispenser();
        DispenseChain c3=new Rupees10Dispenser();
        c1.setNextChain(c2);
        c2.setNextChain(c3);
    }
    public static void main(String[] args) {
        ChainResponsibilityTest chain=new ChainResponsibilityTest();
        while(true){
            int amount=0;
            System.out.println("Enter the amount to dispense");
            Scanner input=new Scanner(System.in);
            amount=input.nextInt();
            if (amount%10!=0){
                System.out.println("Amount should be multiple of 10");
                return;
            }
            chain.c1.dispense(new Currency(amount));
        }
    }
}
