import java.util.Arrays;
public class QuestionA{
    public static void main(String[] args){
        int[] array = {3,6,2,1,8,7,4,5,3,1};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void bubbleSort(int[] array){
        for(int turn=0;turn<array.length-1;turn++){
            for(int j=0;j<array.length-1-turn;j++){
                if(array[j] < array[j+1]){
                    // Swap
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}