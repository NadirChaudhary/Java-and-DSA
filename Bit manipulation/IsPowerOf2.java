public class IsPowerOf2{
    public static boolean method(int n){
        return (n&(n-1)) == 0;
    }
    public static void main(String[] args){
        int number = 9;
        System.out.println(method(number));
    }
}