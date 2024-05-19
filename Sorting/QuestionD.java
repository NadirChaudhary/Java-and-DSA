import java.util.Arrays;
public class QuestionD{
    public static void countingSort(int[] array){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            largest = Math.max(largest,array[i]);
        }

        int[] count = new int[largest+1];
        for(int i=0;i<array.length;i++){
            count[array[i]]++;
        }

        // Sorting
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i] > 0){
                array[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args){
        int[] array = {3,6,2,1,8,7,4,5,3,1};
        countingSort(array);
        System.out.println(Arrays.toString(array));
    }
}