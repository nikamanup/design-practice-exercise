package designpattern.stratergy;

public class StratergyPatternTest {
    public static void main(String[] args) {
        ShoppingCart shoppingCart=new ShoppingCart();
        Item item=new Item("1234",56);
        Item item1=new Item("2345",190);
        shoppingCart.addItem(item);
        shoppingCart.addItem(item1);
        shoppingCart.pay(new PaypalStratefy("abc","test"));
        shoppingCart.pay(new CreditCardStratergy("anup","12262656","212","200678"));
    }
}
