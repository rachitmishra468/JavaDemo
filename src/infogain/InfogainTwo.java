package infogain;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class  Employee {
    String department ;

    int Salary;

    String name ;

    public Employee(String alice, String it, int i) {

        this.name = alice;
        this.department = it;
        this.Salary = i;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name +"-"+department+"-"+Salary;
    }
}

public class InfogainTwo {




   // java 8 Streams to group employees by department and get the highest salary in each group.
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "IT", 70000),
                new Employee("Bob", "HR", 50000),
                new Employee("Charlie", "IT", 90000),
                new Employee("David", "Finance", 60000),
                new Employee("Eva", "HR", 80000)
        );

          Optional<Employee> hightestpaid = employees.stream().reduce((e1 , e2)-> e1.Salary>e2.Salary ? e1 : e2);
        
          System.out.println(hightestpaid.get().department);

        String s = "abcabcbb";

         s.chars().mapToObj(c->(char)c).distinct().forEach(System.out::println);


        String result = s.chars()
                .distinct()
                .mapToObj(c -> String.valueOf((char)c))
                .collect(Collectors.joining());



       // Write a query to find customers who placed more than 5 orders in the last 30 days.

//        SELECT c.customerID , c.custumer_name    FROM CustomerTable c JOIN Order o ON c.customeID = o.customer_id
//                WHERE o.order_date >= DATE(i)
//                GROUP BY
//                c.customerid , c.customer_name
//                HAVING
//                 COUNT(o.orderID )> 5;

//@entity( name ={dipartmentTable })
//       // Employee findByIdAndDepartment( Long id, String department);
//        @Quert("SELECT depatment from {dipartmentTable} where d.ID== {id}")
//getDepartment{}
//        {
//            return  departmentdata;
//        }
//
//
//
//       // @RestController
//        @RequestMapping(value = "/api/employee", consumes = APPLICATION_JSON_VALUE)
//        public class EmployeeController {
//
//
//
//            EmployeeController(EmployeeController EmployeeController){}
//
//            @GetMapping("/{id}")
//            public RsponceEntityEmployee getEmployeeByIdAndDepartment(@requestlong id, String department ) {
//
//
//
//                return ;
//
//            }
//
//        }
//
//
//
//    }
}}
