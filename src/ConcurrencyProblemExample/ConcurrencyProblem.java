package ConcurrencyProblemExample;

public class ConcurrencyProblem {
    private static int counter = 0;
    public static void main(String[] args) {
        test();
    }


    public static  void test(){
        Runnable t =()->{
            for(int i=0; i<1000;i++){
                synchronized (ConcurrencyProblem.class){
                    counter ++;
                }

            }
        };

        Thread tt = new Thread(t);
        Thread tt2 = new Thread(t);
        tt.start();
        tt2.start();
        try {
            tt.join();
            tt2.join();
        }catch (Exception ignored){}

        System.out.println("Final Counter Value: " + counter);

    }


}
