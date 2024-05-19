public class SingleParameter{
    public static void main(String[] args){
        Speaker s1 = (name) -> {return "Hello, "+name;};
        System.out.println(s1.say("Himanshu"));

        Speaker s2 = (name) -> {return "Hello, "+name;};
        System.out.println(s1.say("yadav"));

        Speaker s3 = (name) -> {return "Hello, "+name;};
        System.out.println(s1.say("Dhindhodia"));
    }
}
interface Speaker{
    public String say(String name);
}