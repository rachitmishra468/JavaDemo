package ALT;

public final class Singalton {

    private static Singalton singalton;

    private Singalton() {
    }

    public static  Singalton getSingalton() {

        if (singalton == null) {
            synchronized (Singalton.class) {
                singalton = new Singalton();
            }
        }

        return singalton;
    }
}


class A {


    public static void main(String[] args) {

        Singalton singalton = Singalton.getSingalton();
        Singalton singalton2 = Singalton.getSingalton();
        System.out.println(singalton == singalton2);
    }

}