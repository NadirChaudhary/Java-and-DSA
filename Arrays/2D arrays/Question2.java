public class Question2{
    public static void main(String[] args){
        int[][] nums = {{1,4,9},
                        {11,4,9},
                        {2,2,3}};
        int sum = 0;

        // Sum of 2nd row elements

        // for(int i=1;i==1;i++){
        //     for(int j=0;j<=2;j++){
        //         sum += nums[i][j];
        //     }
        // }

        for(int j=0;j<nums[0].length;j++){
            sum += nums[1][j];
        }
        System.out.println("sum is : "+ sum);
    }
}