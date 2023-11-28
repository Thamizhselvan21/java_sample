package testprograms;

public class MultiplicationTable {

    public static void main(String[] args) {
        // Create and start threads for each multiplication table
        Thread thread1 = new Thread(new MultiplicationTask(1));
        Thread thread2 = new Thread(new MultiplicationTask(2));
        Thread thread3 = new Thread(new MultiplicationTask(3));

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
class MultiplicationTask implements Runnable {
    private int multiplier;

    public MultiplicationTask(int multiplier) {
        this.multiplier = multiplier;
    }

    @Override
    public void run() {
        // Print the multiplication table for the given multiplier
        for (int i = 1; i <= 10; i++) {
            int result = multiplier * i;
            System.out.println(multiplier + " * " + i + " = " + result);
        }
    }
}
