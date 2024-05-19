public class Swap{
    public static void main(String args[]){
        int a = 5;
        int b = 10;

        System.out.println("Using Swap Method");
        swap(a,b);

        System.out.println("After Swap Method");
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);        
    }

    public static void swap(int num1,int num2){

        // Swap
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("a = "+num1);
        System.out.println("b = "+num2);
    }

}