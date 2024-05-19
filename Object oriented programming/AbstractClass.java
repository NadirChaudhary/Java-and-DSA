public class AbstractClass{
    public static void main(String[] args){
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);

        Chicken c = new Chicken();
        c.eat();
        c.walk();
    }
}

abstract class Animal{
    String color;

    Animal(){
        color = "brown";
    }
    void eat(){
        System.out.println("animal eats");
    }

    // Abstract Method (An Idea)
    abstract void walk();
}

class Horse extends Animal{

    // Implementation of an idea
    void changeColor(){
        color = "dark brown";
    }

    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal{

    // Implementation of an idea
    void changeColor(){
        color = "Yellow";
    }

    void walk(){
        System.out.println("walks on 2 legs");
    }
}