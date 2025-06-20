package Excercise4;

public class Main {
  public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(5);

        manager.addEmployee(new Employee("E101", "Alice", "Manager", 75000));
        manager.addEmployee(new Employee("E102", "Bob", "Developer", 55000));
        manager.addEmployee(new Employee("E103", "Charlie", "HR", 50000));

        System.out.println("All Employees:");
        manager.displayAll();

        System.out.println("\nSearching for E102:");
        System.out.println(manager.searchEmployee("E102"));

        System.out.println("\nDeleting E102:");
        manager.deleteEmployee("E102");

        System.out.println("\nEmployees after deletion:");
        manager.displayAll();
    }
}
