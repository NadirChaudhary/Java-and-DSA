import java.util.ArrayList;
public class Question3{
    public static int mostFrequent(ArrayList<Integer> list,int key){
        int[] result = new int[1000];
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i) == key){
                result[list.get(i+1)-1]++;
            }
        }
        int max = Integer.MIN_VALUE;
        int ans = 0;
        for(int i=0;i<1000;i++){
            if(result[i]>max){
                max = result[i];
                ans = i+1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(100);
        list.add(200);
        list.add(1);
        list.add(100);
        int key = 1;
        System.out.println(mostFrequent(list,key));
    }
}