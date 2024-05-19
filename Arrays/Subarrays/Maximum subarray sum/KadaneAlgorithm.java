public class KadaneAlgorithm{
    public static void method(int[] array){
        int cs = 0; // cs = current sum
        int ms = Integer.MIN_VALUE; // ms = maximum sum

        for(int i=0;i<array.length;i++){
            cs = cs + array[i];
            if(cs<0){
                cs = 0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.println("the maximum sum of subarray is : "+ ms);
    }
    public static void main(String[] args){
        int[] array = {-2,-3,4,-1,-2,1,5,-3};
        method(array);
    }
}