package designpattern.stratergy;

public class CreditCardStratergy implements PaymentStrategy {
    private String cardNumber;
    private String cvv;
    private String name;
    private  String dateofExpiry;
    CreditCardStratergy(String name,String cardnumber,String cvv,String dateofExpiry){
        this.cardNumber=cardnumber;
        this.cvv=cvv;
        this.name=name;
        this.dateofExpiry=dateofExpiry;
    }
    @Override
    public void pay(int amount) {
        System.out.println(amount+" Paid with Credit/Debit Card");
    }
}
