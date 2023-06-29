package designpattern.stratergy;

public class PaypalStratefy implements PaymentStrategy{

    private String userName;
    private  String passwd;
    public PaypalStratefy(String userName,String passwd){
        this.userName=userName;
        this.passwd=passwd;

    }
    public void pay(int amount){
        System.out.println(amount+" paying using paypal");
    }
}
