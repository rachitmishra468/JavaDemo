package DemoSingalton;

public class Singalton {

    private static Singalton singalton;
    private Singalton(){

    }

    public static synchronized Singalton getInstance(){
         if(singalton ==null){
          synchronized (Singalton.class) {
              if(singalton == null){
                  singalton = new Singalton();
              }

          }

        }
        return singalton;
    }


}


class Demo{
    public static void main(String[] args) {
        for(int i =0 ; i<=10 ; i++){
            Singalton s = Singalton.getInstance();
            System.out.println("Chech hashCode "+s.hashCode());
        }
    }
}
