public class NaturalSum{
    public static void printSum(int n,int i,int sum){
         if(i == n){
            sum = sum + i;
            System.out.println(sum);
            return;
        }
        sum = sum+i;
        printSum(n,i+1,sum);
    }
    public static void main(String[] args){
        int n = 5;
        printSum(n,1,0);
    }
}