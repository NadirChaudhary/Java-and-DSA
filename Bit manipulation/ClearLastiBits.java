public class ClearLastiBits{
    public static int method(int n, int i){
        int bitmask = (~0)<<i;
        return n & bitmask;
    } 
    public static void main(String[] args){
        int number = 15;
        System.out.println(method(number,2));
    }
}