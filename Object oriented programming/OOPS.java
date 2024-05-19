public class OOPS{
    public static void main(String[] args){
        Pen p1 = new Pen();
        p1.setColor("blue");
        System.out.println(p1.color);

        p1.setTip(5);
        System.out.println(p1.tip);

        //p1.setColor("Yellow");
        p1.color = "Yellow";
        System.out.println(p1.color);
    }
}

class Pen{
        String color;
        int tip;

        void setColor(String newColor){
            color = newColor;
        }

        void setTip(int newTip){
            tip = newTip;
        }
}

class Student{
        String name;
        int age;
        int rollNumber;
        float percentage;

        void calPercentage(int math,int computer,int physics){
            percentage = (math+computer+physics)/3;
        }

        void name(String newName){
            name = newName;
        }

        void setAge(int newAge){
            age = newAge;
        }

        void rollNumber(int newrollNumber){
            rollNumber = newrollNumber;
        }
}