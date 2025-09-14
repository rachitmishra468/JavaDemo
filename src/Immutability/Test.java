package Immutability;

// Mutable class
class Address {
    private String city;

    public Address(String city) {
        this.city = city;
    }



    public Address(Address object ){
        this.city = object.city;
    }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    @Override
    public String toString() {
        return city;
    }
}

// Immutable class
final class Employee {
    private final String name;
    private final Address address;

    public Employee(String name, Address address) {
        this.name = name;
        this.address = new Address(address);
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return new Address(address); // defensive copy
    }

    @Override
    public String toString() {
        return name + " -> " + address;
    }
}







public class Test {

    public static void main(String[] args) {
        Address addr = new Address("Delhi");
        Employee emp = new Employee("Rachit", addr);

        System.out.println(emp); // Rachit -> Delhi

        addr.setCity("Mumbai");  // change original Address
        System.out.println(emp); // Rachit -> Delhi (unchanged ✅)


        addr.setCity("rachiy");
        System.out.println(addr);
        emp.getAddress().setCity("Bangalore"); // modify copy
        System.out.println(emp); // Rachit -> Delhi (still unchanged ✅)
    }

}
