public class Update{
    public static void main(String args[]){
        int[] marks = new int[100];
        marks[0] = 78;
        marks[1] = 75;
        marks[2] = 77;

        // Update
        // marks[2] = 95;
        // marks[2] = marks[2] + 10;
        marks[2] += 3;

        System.out.println("Physics mark : "+marks[0]);
        System.out.println("Chemistry mark : "+marks[1]);
        System.out.println("Math mark : "+marks[2]);

        int percentile = ((marks[0] + marks[1] + marks[2]) / 3);
        System.out.println("Percentile is "+ percentile + "%");
    }
}