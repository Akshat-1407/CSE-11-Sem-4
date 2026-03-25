// Name = Akshat Rastogi
// Class = CSE 11
// Roll No. = 2400320100133

// Write a Java program to create two threads using the Runnable interface and execute them simultaneously.


class MyTask implements Runnable {
    private String taskName;

    public MyTask(String name) {
        this.taskName = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(taskName + " is running: iteration " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(taskName + " was interrupted.");
            }
        }
        System.out.println(taskName + " has finished.");
    }
}

public class Experiment_15 {
    public static void main(String[] args) {
        Runnable task1 = new MyTask("Thread A");
        Runnable task2 = new MyTask("Thread B");

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        t1.start();
        t2.start();
    }
}

/*
    OUTPUT

    Thread A is running: iteration 1
    Thread B is running: iteration 1
    Thread B is running: iteration 2
    Thread A is running: iteration 2
    Thread B is running: iteration 3
    Thread A is running: iteration 3
    Thread A is running: iteration 4
    Thread B is running: iteration 4
    Thread B is running: iteration 5
    Thread A is running: iteration 5
    Thread A has finished.
    Thread B has finished.
*/
