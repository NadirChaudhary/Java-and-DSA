import java.util.Arrays;
public class QuestionB{
    public static void selectionSort(int[] array){
        for(int i=0;i<array.length-1;i++){
            int minPos = i;
            for(int j=i+1;j<array.length-1;j++){
                if(array[minPos] < array[j]){
                    minPos = j;
                }
            }
            // Swap
            int temp = array[minPos];
            array[minPos] = array[i];
            array[i] = temp;
        }
    }
    public static void main(String[] args){
        int[] array = {3,6,2,1,8,7,4,5,3,1};
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }
}