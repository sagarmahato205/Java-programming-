package Arrays;

public class Smallest {
    public static void main(String [] args){
        int arr[] = {5,4,7,2,8,9};
        int Smallest = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length ; i++){
            if(Smallest > arr[i]){
                Smallest = arr[i];
            }
        }
        System.out.println(Smallest + " is the smallest number");
    }
}
