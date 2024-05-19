public class Tester{
    public static void main(String args[]){
        int a = 30;
        int b = 45;
        System.out.println("Before swapping, a = " + a + " b = "+ b);

        // Invoke the swap method

        swapFunction(a,b);

        System.out.println("**Now, Before and After swapping values will be same here**");

        System.out.println("After swapping, a = " + a + " and b is " + b);

    }
    public static void swapFunction(int a, int b){
        System.out.println("Before swapping(Inside Method), a = " + a + " b = "+ b);

        // Swap
        
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping(Inside Method), a = "+ a + " b = "+ b);
    }
}