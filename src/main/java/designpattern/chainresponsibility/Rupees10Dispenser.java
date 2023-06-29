package designpattern.chainresponsibility;

public class Rupees10Dispenser implements DispenseChain {
    DispenseChain dispenseChain;
    @Override
    public void setNextChain(DispenseChain dispenseChain) {
        this.dispenseChain=dispenseChain;
    }

    @Override
    public void dispense(Currency currency) {
        if(currency.getAmount()>=10){
            int num=currency.getAmount()/10;
            int remainder=currency.getAmount()%10;
            System.out.println("Dispensing "+num+" 10RS notes");
            if(remainder!=0)
                this.dispenseChain.dispense(new Currency(remainder));
        }
        else {
            this.dispenseChain.dispense(currency);
        }
    }
}
