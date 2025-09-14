package ThreadExecuter;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

import static java.lang.String.join;

public class SimplethreadExecuter {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
      //  ThreadPoolExecutor executor = Executors.newFixedThreadPool(new ThreadPoolExecutor());
        for(int i=0;i<=10;i++){
            System.out.println("First time ="+Thread.currentThread().getName());
            Runnable worker = new WorkerThread(""+i);
            Thread t = new Thread(worker);
            t.start();
            executorService.execute(worker);
        }

        executorService.shutdown();
        System.out.println("End ");
    }
}
