package birlasoft;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Skill {
    private String skill;

    public Skill(String skill) {
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    @Override
    public String toString() {
        return skill;
    }
}

class Employee {
    private List<Skill> skills;

    public Employee(List<Skill> skills) {
        this.skills = skills;
    }

    public List<Skill> getSkills() {
        return skills;
    }
}

class Department {
    private List<Employee> employees;

    public Department(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}


public class InterviewBirlaSoft {



    public static void main(String[] args) {

// Create Skills
        Skill java = new Skill("Java");
        Skill aws = new Skill("AWS");
        Skill kotlin = new Skill("Kotlin");
        Skill python = new Skill("Python");

        Employee employee = new Employee(List.of(java,aws ,kotlin));
        Employee employee1 = new Employee(List.of(java,python ,aws ,kotlin));
        Employee employee2 = new Employee(List.of(java,aws ,kotlin));
        Employee employee3= new Employee(List.of(java,aws,python ,kotlin));

        Department department = new Department(Arrays.asList(employee,employee1,employee3,employee2));

        Set<String> s1 = department.getEmployees().stream().flatMap(emp->emp.getSkills().stream()).
                map(s->s.getSkill().toLowerCase()).filter(s->s.equals("AWS")).collect(Collectors.toSet());

        System.out.println(s1);


        String abc ="abc";

        List<String> al1=Arrays.asList("Rachit","MIshra");
        List<String> al2=Arrays.asList("Sanchit","MIshra");
        List<String> al4=Arrays.asList("suraj","MIshra");
        List<String> al3=Arrays.asList("charu","MIshra");
        List<List<String>> r = Arrays.asList(al1,al2,al3,al4);


        List<String> name = r.stream().flatMap(list-> Stream.of(list.get(0))).collect(Collectors.toList());


        System.out.println("name "+name);






    }
}
