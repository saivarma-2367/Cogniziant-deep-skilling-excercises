package Excercise1;

public class Main {
  public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        Product p1 = new Product("P001", "Laptop", 10, 999.99);
        Product p2 = new Product("P002", "Keyboard", 25, 19.99);

        manager.addProduct(p1);
        manager.addProduct(p2);

        manager.displayInventory();

        manager.updateProduct("P001", "Gaming Laptop", 8, 1299.99);
        manager.deleteProduct("P002");

        System.out.println("\nAfter update and delete:");
        manager.displayInventory();
    }
}
