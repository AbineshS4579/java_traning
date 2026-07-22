abstract class Animal {
    // abstract void sound();
    abstract void wagTail();
    void eat() {
        System.out.println("Animal is eating");
    }

    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
   
    void sound() {
         super.sound();
        System.out.println("Dog barks");
    } // @Override
   

    void wagTail() {
        System.out.println("Dog is wagging its tail");
    }
}
public class override {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();   
        a.eat();
        a.wagTail();
    }
} 