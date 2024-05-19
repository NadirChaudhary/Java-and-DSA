import java.lang.Math;
import java.util.*;

public class AreaOfCircle{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radious of circle : ");
        double r = in.nextDouble();
        double area = Math.PI * (r * r);
        //double area = 3.14*r*r;
        System.out.println("Area of a circle is : "+ area);
    }
}