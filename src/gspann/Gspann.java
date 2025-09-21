package gspann;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Employee{
   int id;
   String name ;
   String department ;

    Employee(String name, String  department , double salrty){
        this.name = name;
        this.department = department;
    this.salety = salrty;};

    public double getSalety() {
        return salety;
    }

    public void setSalety(double salety) {
        this.salety = salety;
    }

    double salety;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
public class Gspann {

    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(new Employee("ABC" ,"it",30000),new Employee("ABC" ,"HR",50000));

        double secHsalary =  list.stream().map(Employee::getSalety).distinct().sorted(Comparator.reverseOrder()).skip(1)
                .findFirst().orElseThrow();


    }
}
