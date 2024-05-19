import java.util.*;
public class Input{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int[] marks = new int[100];
        System.out.print("Enter phy mark : ");
        marks[0] = in.nextInt();
        System.out.print("Enter Che mark : ");
        marks[1] = in.nextInt();
        System.out.print("Enter math mark : ");
        marks[2] = in.nextInt();
        System.out.println("Physics mark : "+marks[0]);
        System.out.println("Chemistry mark : "+marks[1]);
        System.out.println("Math mark : "+marks[2]);
    }
}