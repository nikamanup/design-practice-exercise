package designpattern.chainresponsibility;

public class Rupees50Dispenser implements  DispenseChain{
    DispenseChain dispenseChain;
    @Override
    public void setNextChain(DispenseChain dispenseChain) {
        this.dispenseChain=dispenseChain;
    }

    @Override
    public void dispense(Currency currency) {
    if(currency.getAmount()>=50){
        int num=currency.getAmount()/50;
        int remainder=currency.getAmount()%50;
        System.out.println("Dispensing "+num+" 50RS notes");
        if(remainder!=0)
        this.dispenseChain.dispense(new Currency(remainder));
        }
    else {
        this.dispenseChain.dispense(currency);
    }
    }
}
