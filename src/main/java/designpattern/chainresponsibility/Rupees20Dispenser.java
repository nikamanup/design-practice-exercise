package designpattern.chainresponsibility;

public class Rupees20Dispenser implements DispenseChain {
    DispenseChain dispenseChain;
    @Override
    public void setNextChain(DispenseChain dispenseChain) {
        this.dispenseChain=dispenseChain;
    }

    @Override
    public void dispense(Currency currency) {
        if(currency.getAmount()>=20){
            int num=currency.getAmount()/20;
            int remainder=currency.getAmount()%20;
            System.out.println("Dispensing "+num+" 20RS notes");
            if(remainder!=0)
                this.dispenseChain.dispense(new Currency(remainder));
        }
        else {
            this.dispenseChain.dispense(currency);
        }
    }
}
