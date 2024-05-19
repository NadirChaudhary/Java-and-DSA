 public class SelectionSort{
    public static void method(int[] array){
        for(int i=0;i<array.length-1;i++){
            int min = i;
            for(int j=i+1;j<array.length;j++){
                if(array[min] > array[j]){
                    min = j;
                }
            }

            // Swap
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }

     public static void print(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] array = {5,4,1,3,2};
        method(array);
        print(array);
    }
 }