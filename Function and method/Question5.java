import java.util.*;

public class Question5{
    public static int sumOfDigits(int n){
        int sum = 0;
        while(n>0){
            int reminder = n%10;
            sum = sum + reminder;
            n = n/10;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Input an integer : ");
        int digit = in.nextInt();
        System.out.println("The sum of digits is = "+sumOfDigits(digit));
    }
}