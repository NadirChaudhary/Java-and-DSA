import java.util.ArrayList;
public class GetElement{
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Cobra");
        System.out.println(cars.get(2));
    }
}