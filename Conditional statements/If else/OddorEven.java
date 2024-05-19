import java.util.*;
public class OddorEven{
    public static void main(String args[]){
        Scanner in  = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a=in.nextInt();
        if(a%2==0){
            System.out.println("The number is even");
        } else{
            System.out.println("The number is odd");
        }
    }
}