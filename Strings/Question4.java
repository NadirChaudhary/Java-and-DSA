import java.util.Arrays;
public class Question4{
    public static void main(String[] args){
        String word1 = "Keep";
        String word2 = "Peek";

        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        if(word1.length() == word2.length()){

            char[] word1charArray = word1.toCharArray();
            char[] word2charArray = word2.toCharArray();

            Arrays.sort(word1charArray);
            Arrays.sort(word2charArray);

            boolean result = Arrays.equals(word1charArray, word2charArray);
            if(result){
                System.out.println(word1 + " and "+ word2 +" are anagrams of each other");
            } else {
                 System.out.println(word1 + " and"+ word2 +" are not anagrams of each other");
            }
        } else{
             System.out.println(word1 + " and"+ word2 +" are anagrams of each other");
        }
    }
}