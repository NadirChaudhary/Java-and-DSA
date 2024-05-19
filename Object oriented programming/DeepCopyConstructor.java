import java.util.Arrays;
public class DeepCopyConstructor{
    public static void main(String[] args){
        Student s1 = new Student("nadir","abcd",29);
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;
        System.out.println(s1.name);
        System.out.println(s1.rollNumber);
        System.out.println(s1.password);
        // for(int i=0;i<3;i++){
        //     System.out.println(s1.marks[i]);
        // }
        System.out.println(Arrays.toString(s1.marks));

        Student s2 = new Student(s1);
        s2.password = "xyz";
        System.out.println(s2.name);
        System.out.println(s2.rollNumber);
        System.out.println(s2.password);
        s1.marks[2] = 100;
        // for(int i=0;i<3;i++){
        //     System.out.println(s2.marks[i]);
        // }
        System.out.println(Arrays.toString(s2.marks));

    }
}

class Student{
    String name;
    String password;
    int rollNumber;
    int[] marks;

    Student(String name,String password,int rollNumber){
        System.out.println("Orignal constructor is called...");
        marks = new int[3];
        this.name = name;
        this.password = password;
        this.rollNumber = rollNumber; 
    }

    // Deep copy
    Student(Student s1){
        System.out.println("Deep copy constructor is called...");
        marks = new int[3];
        this.name = s1.name;
        this.rollNumber = s1.rollNumber;

        for(int i=0;i<marks.length;i++){
            this.marks[i] = s1.marks[i];
        }
    }
}