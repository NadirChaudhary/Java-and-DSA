import java.util.*;
public class AddAll{
    public static void main(String[] args){
        Vector<String> mammals = new Vector<>();
        mammals.add("Tiger");
        mammals.add("Lion");

        Vector<String> animals = new Vector<>();
        animals.addElement("Cat");
        animals.addElement("Rat");

        animals.addAll(mammals);
        System.out.println(animals);
        
    }
}