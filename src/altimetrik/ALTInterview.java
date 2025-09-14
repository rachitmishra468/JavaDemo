package altimetrik;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ALTInterview {

    private static final int MAX = 100;
    private static int number = 1;
    private static final Lock lock = new ReentrantLock();
    private static final Condition condition = lock.newCondition();


    public static void main(String[] args) throws InterruptedException {

//        ExecutorService executor = Executors.newFixedThreadPool(3);
//
//            Runnable task = () -> {
//                while (true) {
//                    lock.lock();
//                    try {
//                        if (number > MAX) {
//                            condition.signalAll(); // wake others to exit
//                            break;
//                        }
//                        System.out.println(Thread.currentThread().getName() + " -> " + number++);
//                        condition.signalAll(); // wake next waiting thread
//                        condition.await();     // wait for turn
//                    } catch (InterruptedException e) {
//                        Thread.currentThread().interrupt();
//                    } finally {
//                        lock.unlock();
//                    }
//                }
//            };
//
//            // Submit 3 threads
//            for (int i = 0; i < 3; i++) {
//                Thread t = new Thread(task);
//                executor.submit(t);
//            }
//
//            executor.shutdown();


        // threadpool of size 3 using executor framework
        //  print integers 1 to 100 in sequential order
        //  using all 3 thread
        //  print thread name along with integers


        ReentrantLock lock = new ReentrantLock();
        ExecutorService ext = Executors.newFixedThreadPool(3);

        Runnable runnable = () -> {
            lock.lock();
            try{
                while (true){

                    while (number>100){
                       break;
                    }
                    System.out.println(number++ + " Thread Name - " + Thread.currentThread().getName());
                }

            }catch (Exception e){}finally {
                lock.unlock();
            }

        };

        Thread t1 = new Thread(runnable);
        ext.execute(t1);

        Thread t2 = new Thread(runnable);
        ext.execute(t2);

        Thread t3 = new Thread(runnable);
        ext.execute(t3);


        ext.shutdown();









        /* List<String> list= new ArrayList<>() ;
        list.add("Ram");
        list.add("Jim");
        list.add("Sita");
        list.add("Elyse") ;
        for(String str: list) {
            if(str.equals("Ram"))
                list.remove("Ram");
        }
        System.out.println(list.toString());*/
    }
}
