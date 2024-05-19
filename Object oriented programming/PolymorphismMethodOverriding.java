public class PolymorphismMethodOverriding{
    public static void main(String[] args){
        Herbivores deer = new Herbivores();
        deer.eat();
    }
}

class Animal{
    void eat(){
        System.out.println("Eats anything");
    }
}

class Herbivores extends Animal{
     void eat(){
        System.out.println("Eats grass");
    }
}