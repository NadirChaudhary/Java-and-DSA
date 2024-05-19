public class InsertionSort{
    public static void method(int[] array){
        for(int i=1;i<array.length;i++){
            int curr = array[i];
            int prev = i-1;

            // Finding out the correct position to insert
            while(prev >= 0 && array[prev] > curr){
                array[prev+1] = array[prev];
                prev--;
            }

            // Insertion
            array[prev+1] = curr;
        }
    }
  public static void print(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] array = {1,4,1,3,5};
        method(array);
        print(array);
    }
}