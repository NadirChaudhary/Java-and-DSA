public class Question1{
    public static void main(String[] args){
        Student s = new Student();
        s.name = "nadir";
        System.out.println(s.name);
    }
}

class Student{
    String name;
    int marks;
}