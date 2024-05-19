public class HierarchicalInheritance{
    public static void main(String[] args){
        Fish shark = new Fish();
        shark.eat();
        shark.breathe();

        Bird parrot = new Bird();
        parrot.eat();
        parrot.breathe();

        Mammal eliphant = new Mammal();
        eliphant.eat();
        eliphant.breathe();
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

class Bird extends Animal{
    void fly(){
        System.out.println("Fly");
    }
}
class Mammal extends Animal{
    void walk(){
        System.out.println("Walk");
    }
}