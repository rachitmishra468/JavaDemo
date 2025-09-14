package DemoSingalton;

public abstract class Abastractclass {

    public abstract void sum(int a , int b );


    public void runM(){
        System.out.println("Run");
    }
}
class Test1 extends Abastractclass{
    @Override
    public void sum(int a, int b) {

    }
}

class Test extends Abastractclass{
    public static void main(String[] args) {
Test1 test1= new Test1();
test1.runM();

    }

    @Override
    public void sum(int a, int b) {

    }
}