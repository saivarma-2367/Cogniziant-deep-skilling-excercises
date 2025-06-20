package Excercise2;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shoes", "Footwear"),
            new Product(103, "Watch", "Accessories"),
            new Product(104, "Phone", "Electronics"),
            new Product(105, "Bag", "Travel")
        };

        String target = "Watch";

        long startLinear = System.nanoTime();
        Product resultLinear = SearchEngine.linearSearch(products, target);
        long endLinear = System.nanoTime();

        long startBinary = System.nanoTime();
        Product resultBinary = SearchEngine.binarySearch(products, target);
        long endBinary = System.nanoTime();

        System.out.println("Linear Search: " + resultLinear + " | Time: " + (endLinear - startLinear) + " ns");
        System.out.println("Binary Search: " + resultBinary + " | Time: " + (endBinary - startBinary) + " ns");
    }
}

