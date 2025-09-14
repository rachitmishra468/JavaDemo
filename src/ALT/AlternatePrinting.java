package ALT;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class AlternatePrinting {
    private ReentrantLock lock = new ReentrantLock();
    private Condition conditionA = lock.newCondition();
    private Condition conditionB = lock.newCondition();
    private boolean aTurn = true; // whose turn to print

    public void printA() throws InterruptedException {
        lock.lock();
        try {
            for (int i = 1; i <= 5; i++) {
                while (!aTurn) conditionA.await();
                System.out.println("A: " + i);
                aTurn = false;
                conditionB.signal(); // wake Thread B
            }
        } finally {
            lock.unlock();
        }
    }

    public void printB() throws InterruptedException {
        lock.lock();
        try {
            for (int i = 1; i <= 5; i++) {
                while (aTurn) conditionB.await();
                System.out.println("B: " + i);
                aTurn = true;
                conditionA.signal(); // wake Thread A
            }
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        AlternatePrinting ap = new AlternatePrinting();
        Thread t1 = new Thread(() -> {
            try { ap.printA(); } catch (InterruptedException e) {}
        });
        Thread t2 = new Thread(() -> {
            try { ap.printB(); } catch (InterruptedException e) {}
        });
        t1.start();
        t2.start();
    }
}
