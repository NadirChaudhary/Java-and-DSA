public class BubbleSortModified{
    public static void bubbleSortMethod(int[] array){
        for(int turn=0;turn<array.length;turn++){
            boolean swapped = false;
            for(int j=0;j<array.length-turn-1;j++){
                if(array[j] > array[j+1]){
                    // Swap
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false){
                break;
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
        int[] array = {1,2,3,4,5,6,7};
        bubbleSortMethod(array);
        printArray(array);
    }
}