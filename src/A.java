public class A extends  Animal{


    A(String name) {
        super(name);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.sum();
        main.sum(2,5);
        main.sum(5,2);



    }

    @Override
    void sound() {

    }
}
