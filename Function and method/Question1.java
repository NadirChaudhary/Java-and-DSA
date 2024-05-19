import java.util.*;
public class Question1{
    public static int average(int x,int y,int z){
        return (x+y+z)/3;
    }

    public static void main(String args[]){
        Scanner in  = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = in.nextInt();
        System.out.print("Enter the second number : ");
        int b = in.nextInt();
        System.out.print("Enter the third number : ");
        int c = in.nextInt();
        
        System.out.println(average(a,b,c));
    }
}