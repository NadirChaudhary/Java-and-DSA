public class Reverse{
    public static void method(int[] array){
        int first = 0;
        int last = array.length-1;

        while(first < last){

            // Swap
            int temp = array[first];
            array[first] = array[last];
            array[last] = temp;

            first++;
            last--;
        }
    }
    public static void main(String args[]){
        int[] array = {9,8,7,6,5,4,3,2,1,0};
        method(array);
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}