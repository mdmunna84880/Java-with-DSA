public class Menu {
    public static int menuSearch(String item, String[] menu){
            for(int i = 0; i < menu.length; i++){
                if(item == menu[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String menu[] = {"Chole-Bhatule", "Rasgoola", "Puri-Sabji"};
        String item = "Chole-Bhatule";
        int index = menuSearch(item, menu);
        if(index == -1){
            System.out.println("Not found");
        }else{
            System.out.println("Found at index: "+index);
        }
    }
}
