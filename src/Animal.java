abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    abstract void sound();  // Abstract method

    void sleep() {          // Concrete method
        System.out.println(name + " is sleeping.");
    }
}