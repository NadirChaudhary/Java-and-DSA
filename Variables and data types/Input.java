import java.util.*;
public class Variable{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        //next(String)
        //nextLine(String)
        //nextInt
        //nextByte
        //nextFloat
        //nextDouble
        //nextBoolean
        //nextShort
        //nextLong

        System.out.print("Enter the value of a : ");
        int a = in.nextInt();
        System.out.print("Enter the value of b : ");
        int b = in.nextInt();
        int sum = a+b;

        System.out.println("The sum of a+b is "+sum);
    }
}