package javaloop;

public  abstract class Animal {
    abstract void makessound();
    abstract void run();

    public void eat() {
        System.out.println("I can eat");
    }
}

class Dog extends Animal {

void makessound(){
    System.out.println("bark bark");
}
void run() {
    System.out.println("The dog is runninng");
}
}
class Cat extends Animal {
    void makessound() {
        System.out.println("meeew meeew");
    }
    void run() {
        System.out.println("the cat is running");
    }
}
class Hello2 {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.makessound();
        d.run();
        d.eat();
        Cat c=new Cat();
        c.makessound();
        c.run();
        c.eat();
    }
}

