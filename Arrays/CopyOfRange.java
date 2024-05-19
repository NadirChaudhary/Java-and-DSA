import java.util.Arrays;
public class CopyOfRange{
    public static void main(String[] args){
        int[] arr1 = {17, 32, 44, 99, 29, 22}; 
		int[] arr2 = Arrays.copyOfRange(arr1, 3, 10);
        System.out.println(Arrays.toString(arr2));
    }
}