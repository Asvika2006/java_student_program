class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks: Woof Woof!");
    }
}
interface Flyable {
    void fly();
}
interface Swimmable {
    void swim();
}
class Duck extends Animal implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("Duck is flying.");
    }
    @Override
    public void swim() {
        System.out.println("Duck is swimming.");
    }
    void quack() {
        System.out.println("Duck says Quack Quack!");
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); 
        dog.bark();

        System.out.println();
        Duck duck = new Duck();
        duck.eat();  
        duck.fly();  
        duck.swim(); 
        duck.quack();
    }
}

