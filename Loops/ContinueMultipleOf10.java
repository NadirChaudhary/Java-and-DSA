import java.util.*;
public class ContinueMultipleOf10{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        do{
            System.out.print("Enter the number : ");
            int n = in.nextInt();

            if(n%10==0){
                continue;
            }
            System.out.println("number was : "+ n);
        }
        while(true);
    }
}