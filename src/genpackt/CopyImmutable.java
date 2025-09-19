package genpackt;

class Address{
    public String city;
    public String state;

    Address(String city , String state){
        this.city =city;
        this.state = state;
    }

    Address(Address other){
        this.city = other.city;
        this.state = other.state;
    }


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}


final class Employee{

private String name;
private  Address address ;

Employee(String name , Address address){
    this.name = name;
    this.address = new Address(address);
}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return new Address(address);
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}







public class CopyImmutable {
}
