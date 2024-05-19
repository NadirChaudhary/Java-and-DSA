public class LambdaExpression{
    public static void main(String[] args){
        MyName p2 = () -> {
            System.out.println("Himanshu yadav");
        };
        p2.SayMyName();
    }
}
interface MyName{
    public void SayMyName();
}