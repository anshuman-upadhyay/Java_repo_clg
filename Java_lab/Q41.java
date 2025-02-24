import java.util.HashMap;
import java.util.Map;

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

    public double getPrice() {
        return price;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductID() {
        return productID;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void displayProduct() {
        System.out.println("Product Name: " + productName);
        System.out.println("Product ID: " + productID);
        System.out.println("Price: Rs." + price);
        System.out.println("Quantity in Stock: " + quantityInStock);
    }
}

class Cart {
    private Map<Product, Integer> cartItems;

    public Cart() {
        this.cartItems = new HashMap<>();
    }

    public void addProduct(Product product, int quantity) {
        if (product.getQuantityInStock() >= quantity) {
            cartItems.put(product, cartItems.getOrDefault(product, 0) + quantity);
        } else {
            System.out.println("Not enough stock for " + product.getProductName());
        }
    }

    public double getTotalPrice() {
        double total = 0;
        for (Map.Entry<Product, Integer> entry : cartItems.entrySet()) {
            total += entry.getKey().getPrice() * entry.getValue();
        }
        return total;
    }

    public double applyDiscount(double discount) {
        double totalPrice = getTotalPrice();
        return totalPrice - (totalPrice * discount);
    }

    public void displayCart() {
        System.out.println("\nCart Items:");
        for (Map.Entry<Product, Integer> entry : cartItems.entrySet()) {
            System.out.println(entry.getKey().getProductName() + " - Quantity: " + entry.getValue() +
                    " - Price: Rs." + entry.getKey().getPrice());
        }
        System.out.println("Total Price (Before Discount): Rs." + getTotalPrice());
    }
}
 class Q41 {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop", 1, 1000, 10);
        Product phone = new Product("Phone", 2, 500, 5);

        Cart myCart = new Cart();
        myCart.addProduct(laptop, 1);
        myCart.addProduct(phone, 2);

        myCart.displayCart();

        double finalPrice = myCart.applyDiscount(0.1); 
        System.out.println("Final Price (After 10% Discount): Rs" + finalPrice);
    }
}
