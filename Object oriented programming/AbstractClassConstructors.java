public class AbstractClassConstructors{
    public static void main(String[] args){
        Mustang myHorse = new Mustang();
        // Animal -> Horse -> Mustang
        
    }
}

abstract class Animal{
    
    Animal(){
        System.out.println("animal constructor called");
    }

    // Abstract Method (An Idea)
    abstract void walk();
}

class Horse extends Animal{

    Horse(){
        System.out.println("Horse constructor called");
    }
    // it is necessary
    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Mustang extends Horse{

     Mustang(){
        System.out.println("Mustang constructor called");
    }
    // it necessary
    void walk(){
        System.out.println("walks on 4 legs");
    }
}