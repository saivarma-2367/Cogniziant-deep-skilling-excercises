package Excercise5;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        manager.addTask(new Task("T001", "Design UI", "Pending"));
        manager.addTask(new Task("T002", "Implement Backend", "In Progress"));
        manager.addTask(new Task("T003", "Testing", "Not Started"));

        System.out.println("All Tasks:");
        manager.displayTasks();

        System.out.println("\nSearching for T002:");
        Task t = manager.searchTask("T002");
        System.out.println(t != null ? t : "Task not found");

        System.out.println("\nDeleting T002:");
        manager.deleteTask("T002");

        System.out.println("\nTasks after deletion:");
        manager.displayTasks();
    }
}

