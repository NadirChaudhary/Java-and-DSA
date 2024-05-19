import java.util.Scanner;
public class MultiplicationTable{
    public static void printmethod(int n,int r){
        if(r == 0){
            return;
        }
        printmethod(n,r-1);
        System.out.println(n +" X "+ r +" = "+ n*r);
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Print number : ");
        int n = in.nextInt();
        System.out.print("Print range : ");
        int r = in.nextInt();
        printmethod(n,r);
    }
}