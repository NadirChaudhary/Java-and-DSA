public class HybridInheritance{
    public static void main(String[] args){
        // Fish shark = new Fish();
        // shark.eat();
        // shark.breathe();

        // Mammal eliphant = new Mammal();
        // eliphant.eat();
        // eliphant.breathe();

        // Dog pug = new Dog();
        // pug.walk();
        // pug.run();

        Human nadir = new Human();
        nadir.eat();
        nadir.breathe();
        nadir.walk();
        nadir.smart();
    } 
}

class Animal{
    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breathes");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("swim");
    }
}

class Mammal extends Animal{
    void walk(){
        System.out.println("Walk");
    }
}

class Dog extends Mammal{
    void run(){
         System.out.println("faster than human");
    }
}
class Human extends Dog{
    void smart(){
         System.out.println("Smartest thing");
    }
}
