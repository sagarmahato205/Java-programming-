package Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int Arr[] = {2,4,5,7,8,6};
        int key = 9;
        boolean found = false;
        for(int i = 0 ; i< Arr.length ; i++){
            if(Arr[i] == key){
                System.out.print(key + "is Matched with " + Arr[i] + " is at Index no. "+ i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Not found");
        }
    }
}
