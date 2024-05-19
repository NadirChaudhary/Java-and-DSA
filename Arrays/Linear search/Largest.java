import java.util.*;
public class Largest{
    public static int method(int[] number){
        int greater = Integer.MIN_VALUE; // -infinity
        for(int i=0;i<number.length;i++){
            if(greater < number[i]){
                greater = number[i];
            }
        }
        return greater;
    }

    public static void main(String args[]){
        int[] number = {-4,-3,-2,-1,0,1,2,3,4,5,6,8,9,10,12,13,14};
        int ans = method(number);
        System.out.println("Largest value is :"+ ans);
    }
}