public class Writing{
    public static void main(String[] args){
        Pen p1 = new Pen();
        //p1.setColor("Blue");
        p1.color = "Blue";
        System.out.println(p1.color);

        //p1.setTip(5);
        p1.tip = 5;
        System.out.println(p1.tip);

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