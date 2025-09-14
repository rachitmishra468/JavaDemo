package KPMG;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class kpmgin {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(1, "Rachit", "IT"),
                new Employee(2, "Mishra", "HR"),
                new Employee(3, "Ankit", "IT"),
                new Employee(4, "Neha", "Finance"),
                new Employee(5, "Sahil", "HR")
        );


        List<Employee> filteredEmployees = employees.stream()
                .filter(e -> e.department().equalsIgnoreCase("IT"))
                .collect(Collectors.toList());

        filteredEmployees.forEach(System.out::println);

    }
}
