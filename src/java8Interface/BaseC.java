package java8Interface;

public class BaseC implements Ibase{
    @Override
    public void abstactMethod() {
        System.out.println("Abastact method is run ");
    }

    public static void main(String[] args) {
        BaseC baseC =new BaseC();
        baseC.abstactMethod();
        Ibase.StaticMethod();
        baseC.defaultMethod();
    }
}
