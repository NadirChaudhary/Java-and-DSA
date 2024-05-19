public class Numbers{
    public static void main(String[] args){
        int n = 10;
        printNumber(n);
    }
    public static void printNumber(int n){
        if(n == 0){
            return; 
        }
        System.out.print(n);
        printNumber(n-1);
    }
}