import java.util.*;
public class Smallest{
    public static int method(int[] numbers){
        int lowest = Integer.MAX_VALUE; // +infinity
        for(int i=0;i<numbers.length;i++){
            if(lowest > numbers[i]){
                lowest = numbers[i];
            }
        }
        return lowest;
    }
    public static void main(String args[]){
        int[] numbers = {-4,-3,-2,-1,0,1,2,3,4,5,6,8,9,10,12,13,14};
        int ans = method(numbers);
        System.out.println("the minimum value is :"+ ans);
    }
}