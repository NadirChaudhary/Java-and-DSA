import java.util.Scanner;
public class Question2{
    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String args[]){
        Scanner in  = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = in.nextInt();

        if(isEven(a)){
            System.out.println(a+" is even");
        } else{
            System.out.println(a+" is odd");
        }
    }
}