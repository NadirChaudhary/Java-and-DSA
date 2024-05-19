public class BubbleSort{
    public static void bubbleSortMethod(int[] array){
        for(int turn=0;turn<array.length;turn++){
            for(int j=0;j<array.length-turn-1;j++){
                if(array[j] > array[j+1]){
                    // Swap
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
    public static void printArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] array = {5,4,1,3,2};
        bubbleSortMethod(array);
        printArray(array);
    }
}