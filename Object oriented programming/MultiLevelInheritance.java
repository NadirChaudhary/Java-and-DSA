public class MultiLevelInheritance{
    public static void main(String[] args){
        Dog dobby = new Dog();
        dobby.eat();
        dobby.breathe();
        dobby.legs = 4;
        dobby.breed = "pugs";
        System.out.println(dobby.legs);
        System.out.println(dobby.breed);
        
    }
}

// Base class
class Animal{
    void eat(){
        System.out.println("eats dog foods");
    }

    void breathe(){
        System.out.println("not Breathes under water");
    }
}

// Derived Class
class Mammal extends Animal{
    int legs;
}

// Derived clas 
class Dog extends Mammal{
    String breed;
}