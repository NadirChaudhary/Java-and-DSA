public class Menu{
    public static void search(String[] menu,String key){
        int temp = 0;
        for(int i=0;i<menu.length;i++){
            if(menu[i].equals(key)){
                System.out.println("Key is found at index : "+i);
                temp += 1;
            }
        }
        if(temp == 0){
            System.out.println("Not found");
        }
    }
    public static void main(String args[]){
        String[] menu = {"Dosa","Fry","Samosa","Nihari","Biryani","Kebab"};
        String key = "Nalli";
        search(menu,key);
    }
}