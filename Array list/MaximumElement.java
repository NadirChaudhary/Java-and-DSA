import java.util.ArrayList;
public class MaximumElement{
    public static void main(String[] args){
        ArrayList<Integer> number = new ArrayList<>();
        number.add(3);
        number.add(4);
        number.add(6);
        number.add(2);
        number.add(8);
        number.add(11);
        number.add(0);
        int max = Integer.MIN_VALUE;
        for(int i=0;i<number.size();i++){
        //     if(max < number.get(i)){
        //         max = number.get(i);
        //     }
        max = Math.max(max,number.get(i));
        }
        System.out.println("Maximum element in the ArrayList is "+max);
    }
}