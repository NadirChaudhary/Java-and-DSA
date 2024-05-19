import java.util.*;
public class Question1{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int A = in.nextInt();
        System.out.print("Enter the Second number : ");
        int B = in.nextInt();
        System.out.print("Enter the third number : ");
        int C = in.nextInt();

        int sum = (A+B+C)/3;
        System.out.println(sum);
    }
}