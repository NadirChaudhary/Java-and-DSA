public class OddorEven{ 
    public static void method(int n){
        int bitMask = 1;
        if((n & bitMask) == 1){
            System.out.println("odd number");
        } else{
            System.out.println("even number");
        }
    }
    public static void main(String[] args){
        method(3);
        method(11);
        method(14);
    }
}