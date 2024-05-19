import java.util.Arrays;
import java.util.Collections;
public class InbuiltSort{
public static void main(String[] args){
    Integer[] array = {1,8,2,5,7,3,6,9};
    //Arrays.sort(array);
    //Arrays.sort(array,0,3);
    //Arrays.sort(array, Collections.reverseOrder());
    Arrays.sort(array,0,6, Collections.reverseOrder());
    
    /*
   for(int i=0;i<array.length;i++){
        System.out.print(array[i]);
    } 
    System.out.println();
    */
   System.out.println(Arrays.toString(array));
  }
}