public class SingleInheritance{
    public static void main(String[] args){
        Fish shark = new Fish();
        shark.eat();
        shark.breathe();
        shark.swim();
    }
}

// Base class
class Animal{
    void eat(){
        System.out.println("eats small fishs");
    }

    void breathe(){
        System.out.println("Breathes under water");
    }
}

// Derived Class
class Fish extends Animal{
    void swim(){
        System.out.println("Swimming under water");
    }
}