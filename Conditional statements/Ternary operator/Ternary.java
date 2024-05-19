public class Ternary{
    public static void main(String args[]){
        int number1 = 4;
        int number2 = 6;
        //String type = (number1%2==0) ? "even" : "odd";
        int type = (number1>=number2)?number1:number2;
        System.out.println(type);
    }
}