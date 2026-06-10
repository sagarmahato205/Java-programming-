package challengesLoop;

public class maxNumber {
    public static void main(String[] args) {
        int arr[] = {4,3,2,6,5};
        int max = Integer.MIN_VALUE;
        for(int num : arr){
            if(max < num){
                max = num;
            }
        }
        System.out.println("the maximum number is :"+max);
    }
}
