public class GettersAndSetters{
    public static void main(String[] args){
        Pen ballPen  = new Pen();

        ballPen.setColor("Blue");
        System.out.println(ballPen.getColor());

        ballPen.setTip(5);
        System.out.println(ballPen.getTip());
    }
}

class Pen{
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }
    void setColor(String color){
        this.color = color;
    }

    int getTip(){
        return this.tip;
    }
    void setTip(int tip){
        this.tip = tip;
    }
}