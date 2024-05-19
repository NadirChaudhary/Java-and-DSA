import java.util.ArrayList;
public class AddElement{
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Cobra");
        cars.add(2,"tesla");
        System.out.println(cars);
    }
}