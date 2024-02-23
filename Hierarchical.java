package Oops.Inheritance;

class Animal3 {
    void eat() {
        System.out.println("eating...");
    }
}

class Dog3 extends Animal3 {
    void bark() {
        System.out.println("barking...");
    }
}

class Cat extends Animal3 {
    void meow() {
        System.out.println("meowing...");
    }
}

public class Hierarchical {
    public static void main(String args[]) {
        Cat c = new Cat();
        c.meow();
        c.eat();
    }
}
