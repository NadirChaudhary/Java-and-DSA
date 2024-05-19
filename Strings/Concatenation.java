public class Concatenation{
    public static void main(String[] args){
        String firstName = "Nadir";
        String lastName = "Chaudhary";
        //String fullName = firstName +" "+lastName;
        String fullName = firstName.concat(" "+lastName);
        System.out.println(fullName);
    }
}