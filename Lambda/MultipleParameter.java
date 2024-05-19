public class MultipleParameter{
    public static void main(String[]args){
        MyInter add = (a,b) -> (a+b);
        System.out.println(add.cal(100,200));
        MyInter minus = (a,b) -> (a-b);
        System.out.println(minus.cal(100,200));
        MyInter multiply = (a,b) -> (a*b);
        System.out.println(multiply.cal(100,200));
    }
}
interface MyInter{
    int cal(int a, int b);
}