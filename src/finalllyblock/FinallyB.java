package finalllyblock;

public class FinallyB {
    public static void main(String[] args) {
        withSystemexit();
        // no 2 case
        infintyloop();
    }

    private static void withSystemexit(){
        try{ int a=10;

        }catch (Exception e){
            System.out.println("catch block run");
            System.exit(0);
        }finally {
            System.out.println("Finally block run");
        }
    }


    private static void infintyloop(){
        try {
            while (true){
            System.out.println("try block run");}
        }
        finally {
            System.out.println("Finally block run");
        }
    }

}


