package ThreadExecuter;

public class WorkerThread implements Runnable{

    private String name;

    WorkerThread(String name){
        this.name =name;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" Count ="+name);
        process();
        System.out.println(Thread.currentThread().getName()+" Count ="+name +" End");
    }


    private void process()  {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
