class Product {
    private String productName;
    private int productID;
    private double price;
    private int quantityInStock;

    public Product(String productName, int productID, double price, int quantityInStock) {
        this.productName = productName;
        this.productID = productID;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    public void applyDiscount(double discount) {
        this.price = this.price - (this.price * discount);
    }

    public void displayProduct() {
        System.out.println("Product Name: " + this.productName);
        System.out.println("Product ID: " + this.productID);
        System.out.println("Price: " + this.price);
        System.out.println("Quantity in Stock: " + this.quantityInStock);
    }

    public static void main(String[] args) {
        Product product = new Product("Laptop", 1, 1000, 10);
        product.displayProduct();
        product.applyDiscount(0.1);
        product.displayProduct();
    }
}
// map<String,int> <map_name> = new Hashmap<String,int>();
// map.push(string value,int value);
//for(<map_name>.Entry<String ,int>i: map.entrySet()){sout (i.getkey()+","+ i.getvalue());}