package challengeArray;

public class sumAndAvg {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,8,9};
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum +=arr[i];
        }
        System.out.println("Your sum is: " +sum);
        int avg = sum/arr.length;
        System.out.println("Your Average is :" + avg);
    }
}
