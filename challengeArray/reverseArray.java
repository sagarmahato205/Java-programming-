package challengeArray;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {1,5,3,6,4,5,6};
        int left = 0;
        int right = arr.length - 1;
        for(int i = 0;i<arr.length;i++){
            System.out.print("{ " + arr[i] +"}");

        }
        System.out.println();

        //Swapping the values
        while(left <= right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        //Printing the Array
        for(int i = 0; i <arr.length ; i++){
            System.out.print("{ " + arr[i] +"}");

        }
    }
}
