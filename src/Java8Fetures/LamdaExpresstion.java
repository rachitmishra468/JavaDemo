package Java8Fetures;

@FunctionalInterface
interface test{

   int test(int a, int b);
   public  static int multiplay(int a, int b ){
       return  a*b;
   }
}

public class LamdaExpresstion {
    public static void main(String[] args) {
        test t =(a,b)->(a+b);
        System.out.println(t.test(5,8));
        System.out.println(test.multiplay(7,7));

    }
}
