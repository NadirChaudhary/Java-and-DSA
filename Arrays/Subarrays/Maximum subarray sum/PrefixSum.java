public class PrefixSum{
    public static void method(int[] array){
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        int[] prefix = new int[array.length];
        prefix[0] = array[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i] = prefix[i-1] + array[i];
        }

        for(int i=0;i<array.length;i++){
            //int start = i;
            for(int j=i;j<array.length;j++){
                //int end = j;
                sum = i==0 ?  prefix[j] : prefix[j] - prefix[i-1];
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