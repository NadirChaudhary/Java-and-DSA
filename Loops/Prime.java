import java.util.*;
public class Prime{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = in.nextInt();

        if(number==2){
            System.out.println("number is prime");
        } else{
            boolean isPrime = true;
            //for(int i=2;i<=number-1;i++){
              for(int i=2;i<=Math.sqrt(number);i++){
                if(number%i==0){
                    isPrime = false;
                }
            }
            if(isPrime == true){
                System.out.println("number is prime");
            }
            else {
                System.out.println("number is not prime");
            }
        }
    }
}