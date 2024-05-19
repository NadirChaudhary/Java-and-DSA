public class ReverseTheGivenNumber{
    public static void main(String args[]){
        int n = 13011996;
        int rev = 0;
        while(n>0){
            int reminder = n%10;
            rev = (rev*10) + reminder;
            n = n/10;
        }
        System.out.println(rev);
    }
}