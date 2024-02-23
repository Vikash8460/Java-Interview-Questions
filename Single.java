package Oops.Inheritance;

class Animal{
    void eat(){
        System.out.println("eating...");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("barking...");
    }
}
public class Single {
    public static void main(String args[]){
        Dog d=new Dog();
        d.bark();
        d.eat();
    }
}
