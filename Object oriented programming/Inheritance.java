public class Inheritance{
    public static void main(String[] args){
        Fish shark = new Fish();
        shark.eat();
        shark.breathe();
        shark.swim();
    }
}

// Base class
class Animal{
    String color;

    void eat(){
        System.out.println("eats small fishs");
    }

    void breathe(){
        System.out.println("Breathes under water");
    }
}

// Derived Class
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swimming under water");
    }
}