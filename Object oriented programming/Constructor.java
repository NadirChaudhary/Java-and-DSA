public class Constructor{
    public static void main(String[] args){
        Student s1 = new Student("nadir",131);
        System.out.println(s1.name);
          System.out.println(s1.rollNumber);
    }
}

class Student{
    String name;
    int rollNumber;

    Student(String name, int rollNumber){
        System.out.println("This is called from constructor");
        this.name = name;
        this.rollNumber = rollNumber;
    }
}