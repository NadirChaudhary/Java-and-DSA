public class Encapsulation{
    public static void main(String[] args){
        Student encapsulation = new Student();
        encapsulation.setName("Nadir");
        System.out.println(encapsulation.getName());

        encapsulation.setAge(18);
        System.out.println(encapsulation.getAge());
    }
}

public class Student{
    private String name;
    private int age;

    public String getName(){
        return name;
    }
    public void setName(String newName){
        name = newName;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int newAge){
        age = newAge;
    }
}