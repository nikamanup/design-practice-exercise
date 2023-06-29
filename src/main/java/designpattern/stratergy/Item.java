package designpattern.stratergy;

public class Item {
    private String upcCode;
    private int price;
    public Item(String upcCode,int cost){
        this.upcCode=upcCode;
        this.price=cost;
    }

    public int getPrice() {
        return price;
    }

    public String getUpcCode() {
        return upcCode;
    }
}
