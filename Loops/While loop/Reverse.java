public class Reverse{
    public static void main(String args[]){
        int n = 13011996;
        while(n>0){
            int lastdigit = n%10;
            System.out.print(lastdigit);
            n /= 10;
        }
    }
}