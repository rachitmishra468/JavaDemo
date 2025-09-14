package java8Interface;

public interface Ibase {

    void abstactMethod();

    default void defaultMethod(){
        System.out.println("Defacult method ");
        privatemethod();
    }

    public static void StaticMethod(){
        System.out.println("Static method is run ");
    }

    private  void privatemethod(){
        System.out.println("Private member or method os rub ");
    }
}
