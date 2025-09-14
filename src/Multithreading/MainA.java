package Multithreading;

public class MainA {
    public static void main(String[] args) {
        Process process= new Process();
       Thread t1= new Thread(
               process::read
       );

       Thread t2 = new Thread(
               process::read
       );


        t1.start();
        t2.start();
    }
}
