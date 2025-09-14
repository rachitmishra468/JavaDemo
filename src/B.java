public class B extends A{
    B(String name) {
        super(name);
    }

    public static void main(String[] args) {
        B b= new B("Rachit");
        b.sleep();
    }
}
