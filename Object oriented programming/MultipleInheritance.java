public class MultipleInheritance{
    public static void main(String[] args){
        Bear b = new Bear();
        b.eatGrass();
        b.eatAnimal();
    }
}

interface Herbivorce{
    void eatGrass();
}

interface Carnivorce{
    void eatAnimal();
}

class Bear implements Herbivorce, Carnivorce{
    public void eatGrass(){
        System.out.println("Bear eat grass");
    }

    public void eatAnimal(){
        System.out.println("Bear eat animal");
    }
}