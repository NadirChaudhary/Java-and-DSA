public class NoParameter{
    public static void main(String[] args){
        speaker s = () -> {
            return "Scaler has best content";
        };
        System.out.println(s.say());
    }
}
interface speaker{
    public String say();
}