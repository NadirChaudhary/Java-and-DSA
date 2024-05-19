public class ClearIthBit{
    public static int method(int n, int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }
    public static void main(String[] args){
        int number = 10;
        System.out.println(method(number,1));
    }
}