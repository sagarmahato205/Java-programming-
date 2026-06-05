package Arrays;

public class Menu {
    public static void main(String[] args) {
        String Menu[] = {"burgur","Samosa","Thali","Colddrink"};
        String order = "biryani";
        boolean found = false ;
        for(int i = 0 ; i < Menu.length ; i++){
            if(Menu[i] == order){
                System.out.println(order + " is found at index "+ i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println(order+" Your order id not Available");
        }
    }
}
