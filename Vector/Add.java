import java.util.*;
public class Add{
    public static void main(String[] args){
        Vector<String> vec = new Vector<>();
        vec.add("Tiger");
        vec.add("Lion");
        vec.addElement("Cat");
        vec.addElement("Rat");
        for(String animal:vec){
            System.out.println(animal);
        }
    }
}