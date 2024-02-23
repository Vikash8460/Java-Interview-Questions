package Oops.Polymorphism;

class Animal{
    void eat(){
        System.out.println("eating...");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("eating bread...");
    }
}
class Cat extends Animal{
    void eat(){
        System.out.println("eating rat...");
    }
}
class Lion extends Animal{
    void eat(){
        System.out.println("eating meat...");
    }
}
public class Runtime {
    public static void main(String[] args) {
        Animal a;
        a = new Dog();
        a.eat();
        a = new Cat();
        a.eat();
        a = new Lion();
        a.eat();
    }
}
