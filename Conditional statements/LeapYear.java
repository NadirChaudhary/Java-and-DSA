import java.util.*;
public class LeapYear{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int year = in.nextInt();

        // FIRST TYPE
        
        // if(year%4==0){
        //     System.out.println("Leap year");
        // } else if(year%100 != 0){
        //     System.out.println("Leap year");
        // } else if(year%400==0){
        //     System.out.println("Leap year");
        // } else{
        //     System.out.println("Not Leap year");
        // }


        // SECOND TYPE

        // if((year%400==0) || (year%4==0 && year%100 !=0)){
        //     System.out.println("Leap year");
        // } else {
        //     System.out.println("Not a leap year");
        // }


        // THIRD TYPE

        // boolean x = (year%4) == 0;
        // boolean y = (year%100) !=0;
        // boolean z = ((year%100==0) && (year % 400 == 0));

        // if(x && (y || z)){
        //     System.out.println(year + " is a leap year");
        // } else{
        //     System.out.println(year + " is not a leap year");
        // }
    }
}