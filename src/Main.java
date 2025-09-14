import SetterGetterEx.Emp;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends DemoAbasatact {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        Emp emp = new Emp();
        emp.setFirstName("Rachit");
        emp.setLastName("Mishra");
        System.out.println("Emp First name "+emp.getFirstName());
        System.out.println("Emp First name "+emp.getLastName());

        System.out.println("Emp First name Sanchit"+ new  Emp("Sanchit mishra" , "Mishra").getLastName());
    }

    @Override
    void sum() {
        System.out.println("Abastact method run ");
    }

    @Override
    public void sum(int a, int b) {
        super.sum(a,b);
       System.out.println(a-b);
    }
}


