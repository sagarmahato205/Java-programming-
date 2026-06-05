package Arrays;

public class Largest {
    public static void main(String[] args) {
        int arr[] = {3,4,2,5,7,1};
        int Largest = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            if(Largest <arr[i]){
                Largest = arr[i];
            }
        }
        System.out.println(Largest + " is largest number");
    }
}
