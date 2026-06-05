package challengeArray;

public class maxAndMinElement {
    public static void main(String[] args) {
        int[] arr = {2,6,4,7,3,8,1};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0 ; i<arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
