public class ClearBitsInRange{
    public static int method(int n, int i, int j){
        int a = ((~0)<<(j+1));
        int b = ((1<<i)-1);
        int bitMask = a | b;
        return n & bitMask;
    }
    public static void main(String[] args){
        int number = 10;
        System.out.println(method(number,2,4));
    }
}