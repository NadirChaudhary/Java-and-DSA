public class ParameterizedConstructors{
    public static void main(String[] args){
        Student s1 = new Student("nadir",209);
        System.out.println(s1.name);
        System.out.println(s1.rollNumber);
    }
}

class Student{
    String name;
    int rollNumber;

    Student(String name, int rollNumber){
        this.name = name;
        this.rollNumber = rollNumber;
    }
}