import java.util.*;
public class Question2{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int number,choice,evenSum = 0,oddSum = 0;

        do{
            System.out.print("Enter the number : ");
            number = in.nextInt();

            if(number%2==0){
                evenSum = evenSum + number;
            } else {
                oddSum = oddSum + number;
            }

            System.out.print("Do you want to continue ? Press 1 for yes or 0 for no : ");

            choice = in.nextInt();
        } while(choice==1);
        System.out.println("Sum of even numbers : " + evenSum);
        System.out.println("Sum of odd numbers : " + oddSum);
    }
}