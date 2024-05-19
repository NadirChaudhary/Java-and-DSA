public class BruteForce{
    public static void method(int[] array){
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0;i<array.length;i++){ // (i<=array.length) = (i<array.length)
            //int start = i
            for(int j=i;j<array.length;j++){ // (j<=array.length) = (j<array.length)
                //int end = j;
                sum = 0;
                for(int k=i;k<=j;k++){
                    sum += array[k];
                }
                System.out.println(sum);
                if(maxSum < sum){
                    maxSum = sum;
                }
            }
        }
        System.out.println("Maximum sum = "+ maxSum);
    }
    public static void main(String[] args){
        int[] array = {1,-2,6,-1,3};
        method(array);
    }
}