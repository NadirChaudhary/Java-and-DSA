public class Question2{
    public static void main(String[] wheels){
        final Car car = new ElectricCar();
        System.out.print(car.drive());
    }
}
class Automobile{
    private String drive(){
        return "Driving vrhicle";
    }
}
class Car extends Automobile{
    protected String drive(){
        return "Driving car";
    }
}
public class ElectricCar extends Car{
    public final String drive(){
        return "Driving electric car";
    }
}