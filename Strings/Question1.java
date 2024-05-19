import java.util.*;
public class Question1{
    public static void main(String[] args){
        System.out.print("Enter the character : ");
        //Scanner in = new Scanner(System.in);
        //String str = in.nextLine();
        String str = new Scanner(System.in).nextLine();
        int count = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        System.out.println("Count of the vowels is : "+ count);
    }
}