import java.util.*;
public class Question3{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the value of pencil : ");
        float pencil = in.nextFloat();
        System.out.print("Enter the value of pen : ");
        float pen = in.nextFloat();
        System.out.print("Enter the value of eraser : ");
        float eraser = in.nextFloat();

        float total = pencil + pen + eraser;
        System.out.println("Bill is : "+ total);

        float newtotal = total + (0.18f * total);
        System.out.println("Bill witg 18% tax : "+ newtotal);

    }
}