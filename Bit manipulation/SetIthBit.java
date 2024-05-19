public class SetIthBit{
    public static int method(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }
    public static void main(String[] args){
        int number = 10;
        System.out.println(method(number,2));
    }
}