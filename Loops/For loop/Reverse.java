public class Reverse{
    public static void main(String args[]){
        int n = 13011996;
        int reverse = 0;
        for(;n != 0;n = n/10){
            int reminder = n%10;
            reverse = reverse*10 + reminder; 
        }
        System.out.println(reverse);
    }
}