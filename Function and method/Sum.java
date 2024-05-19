import java.util.*;
public class Sum{

    //public static void calculateSum(int num1, int num2){
    public static int calculateSum(int num1, int num2){
        int sum = num1 + num2;
        //System.out.println("The sum of the enter number is : "+ sum);
        return sum;
    }

    public static void main(String args[]){
        Scanner in  = new Scanner(System.in);

        System.out.print("Enter the value of a : ");
        int a = in.nextInt();

         System.out.print("Enter the value of b : ");
        int b = in.nextInt();
        
        int sum = calculateSum(a,b);
        System.out.println("The sum of the enter number is : "+ sum);
    }
}