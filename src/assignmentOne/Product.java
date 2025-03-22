package assignmentOne;

public class Product {
    private String name;
    private double price;
    private int stockQuantity;

    public Product() {
    }
   // initialization an object when it is created and also sets initial values
    //for the object's attributes
    public Product(String name, double price, int stockQuantity) {
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }
    // updating the price
    public void updatePrice(double price){
        if(price > 0)
            this.price = price;
        else
            System.out.println("please entered valid price");
    }
    //checking stock and purchasing products

    public void checkStockForPurchasing(int quantity){
        if(quantity > 0 && stockQuantity >= quantity){
            stockQuantity = stockQuantity -quantity;
            System.out.print("Product : "+ name+"\n"+ "Price: $ "+ price +"\n"+ "Stock: "+ quantity + " that you purchased\n" );
            System.out.println(stockQuantity + " stock  remaining ");
        }
        else
            System.out.println("Not enough stock available for purchase");
    }

    public static void main(String[] args) {
        Product appleWatch = new Product("Apple Watch series 3",500.0,40);
        appleWatch.updatePrice(550.0);
        appleWatch.checkStockForPurchasing(10);
        appleWatch.updatePrice(-100);
    }


}
