public class Product {

    public Product(String itemNumber,String name){
        this.itemNumber=itemNumber;
        this.name = name;
    };
    public Product(String itemNumber, String name, double price,short qty){
        this.itemNumber=itemNumber;
        this.name = name;
        this.qty=qty;
        this.price=price;
    };

    private String itemNumber;
    private String name;
    private double price;
    private short qty;

    public String getItemNumber() {
        return itemNumber;
    }


    public String getName() {
        return name;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public short getQty() {
        return qty;
    }

    public void setQty(short qty) {
        this.qty = qty;
    }
}
