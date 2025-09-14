package Multithreading;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

public class Process {
    Semaphore reentrantLock = new Semaphore(2);

    public void read(){
       try {
           System.out.println("Enter in  process");
           reentrantLock.acquire();
           System.out.println("lock the  process"+Thread.currentThread().getName());
           Thread.sleep(2000);

       }catch (Exception e){

       }finally {
           System.out.println("release the  process");
           reentrantLock.release();
       }




    }
}
