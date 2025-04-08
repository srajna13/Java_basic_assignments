
abstract class Animal {
    protected String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Abstract method
    public abstract void makeSound();

    // Concrete method (non abstract)
    public void sleep() {
        System.out.println(name + " is sleeping...");
    }
}

// Inheritance + Method Overriding (Polymorphism)
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof!");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow!");
    }
}

// Encapsulation (private fields + getters/setters)
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    // Method Overloading (Polymorphism)
    public void greet() {
        System.out.println("Hello!");
    }

    public void greet(String otherName) {
        System.out.println("Hello, " + otherName + "!");
    }
}

// Main class:
public class OOPS {
    public static void main(String[] args){
        // Objects of subclasses
        Animal dog = new Dog("Buddy");
        Animal cat = new Cat("Whiskers");

        dog.makeSound(); // Polymorphism
        cat.makeSound();
        dog.sleep();      // Inherited method

        // Encapsulation demo
        Person person = new Person("Alice", 25);
        System.out.println("Person name: " + person.getName());
        person.setName("Bob");
        System.out.println("Updated name: " + person.getName());

        // Method Overloading
        person.greet();
        person.greet("Charlie");
    }
}
