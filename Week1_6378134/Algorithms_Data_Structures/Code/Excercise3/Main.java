package Excercise3;

public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order("O001", "Alice", 5000),
            new Order("O002", "Bob", 1200),
            new Order("O003", "Charlie", 9500),
            new Order("O004", "Diana", 7000)
        };

        Order[] bubbleSorted = orders.clone();
        BubbleSorter.bubbleSort(bubbleSorted);
        System.out.println("Bubble Sort (Descending):");
        for (Order order : bubbleSorted) System.out.println(order);

        Order[] quickSorted = orders.clone();
        QuickSorter.quickSort(quickSorted, 0, quickSorted.length - 1);
        System.out.println("\nQuick Sort (Descending):");
        for (Order order : quickSorted) System.out.println(order);
    }
}

