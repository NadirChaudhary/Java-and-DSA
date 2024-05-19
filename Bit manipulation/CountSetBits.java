public class CountSetBits{
    public static int method(int n){
        int count = 0;
        while(n > 0){
            if((n & 1) != 0){
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static void main(String[] args){
        int number = 10;
        System.out.println(method(number));
    }
}