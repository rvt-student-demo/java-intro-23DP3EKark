package lv.rvt;

public class Product {
    private String name;
    private double price;
    private int quantity;
    
    public Product(String initialName, double initialPrice, int initialQuantity){
            this.name = initialName;
            this.price = initialPrice;
            this.quantity = initialQuantity;
        }
    
    public void printProduct(String name, double price, int quantity){
        System.out.println(name + ", price " + price + ", " + quantity + "pcs");
    }     
}