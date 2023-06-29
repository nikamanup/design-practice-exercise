package designpattern.chainresponsibility;

public interface DispenseChain {
    void setNextChain(DispenseChain dispenseChain);
    void dispense(Currency currency);
}
