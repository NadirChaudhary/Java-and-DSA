import java.util.Arrays;
public class QuestionC{
    public static void insertionSort(int[] array){
        for(int i=1;i<array.length;i++){
            int curr = array[i];
            int prev = i-1;
            while(prev >= 0 && array[prev] < curr){
                array[prev+1] = array[prev];
                prev--;
            }
            array[prev+1] = curr;
        }
    }
    public static void main(String[] args){
        int[] array = {3,6,2,1,8,7,4,5,3,1};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }
}