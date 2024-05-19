import java.util.ArrayList;
public class Pairs{
    public static void printPairs(ArrayList<Integer>list){
        for(int i=0;i<list.size();i++){
            int curr = list.get(i);
            for(int j=i+1;j<list.size();j++){
                System.out.print("("+curr+","+list.get(j)+") ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        printPairs(list);
    }
}