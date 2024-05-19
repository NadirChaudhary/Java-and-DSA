public class Largest{
    public static void main(String args[]){
        int a=1,b=3,c=6;
        String Large;
        if(a>=b && a>= c){
            Large="a";
        } else if(b>=c && b>=a){
            Large="b";
        } else{
            Large="c";
        }
        System.out.println("Largest number amongs them is : "+ Large);
    }
}