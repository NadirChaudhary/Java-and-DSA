public class BlockScope{
    public static void main(String args[]){
        {
            int a = 10;
            System.out.println(a);
        }

        System.out.println(a); // we cannot use (a) because it is not axis out of braces
    }
}