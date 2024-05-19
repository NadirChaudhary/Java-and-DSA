public class Intern{
    public static void main(String[] args){
        String s1 = "nadir";
        String s2 = new String("nadir");
        String s3 = s2.intern();
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
    }
}