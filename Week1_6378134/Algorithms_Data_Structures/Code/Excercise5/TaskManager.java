package Excercise5;

public class TaskManager {
    private Node head;

    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    public void displayTasks() {
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.task);
            curr = curr.next;
        }
    }

    public Task searchTask(String taskId) {
        Node curr = head;
        while (curr != null) {
            if (curr.task.getTaskId().equals(taskId)) {
                return curr.task;
            }
            curr = curr.next;
        }
        return null;
    }

    public void deleteTask(String taskId) {
        if (head == null) return;

        if (head.task.getTaskId().equals(taskId)) {
            head = head.next;
            return;
        }

        Node curr = head;
        while (curr.next != null && !curr.next.task.getTaskId().equals(taskId)) {
            curr = curr.next;
        }

        if (curr.next != null) {
            curr.next = curr.next.next;
        }
    }
}

