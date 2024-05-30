//If you want two different threads to perform different tasks, you can achieve 
//this by creating separate classes that extend Thread or implement Runnable and 
//then starting them as separate threads. Here's how you can modify the code to achieve this:
class Task1 extends Thread {
    @Override
    public void run() {
        System.out.println("Task 1 is running...");
        // Add code for task 1
    }
}

class Task2 extends Thread {
    @Override
    public void run() {
        System.out.println("Task 2 is running...");
        // Add code for task 2
    }
}

public class MultiThreadExample {
    public static void main(String[] args) {
        Task1 t1 = new Task1(); // Create instance for Task1
        Task2 t2 = new Task2(); // Create instance for Task2

        t1.start(); // Start Task1 in a new thread
        t2.start(); // Start Task2 in a new thread

        // Add any additional main thread logic here if needed
    }
}
