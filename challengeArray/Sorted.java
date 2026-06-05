package challengeArray;
public class Sorted{
    public static void main(String[] args){
        int[] arr = {2,3,4,3,6};
        boolean isDecreasing = isDecreasing(arr);
        boolean isIncreasing = isIncreasing(arr);
        if(isDecreasing == true || isIncreasing == true){
            System.out.println("Your array is Sorted");
        }else{
            System.out.println("Your array is not Sorted");
        }
    }
    public static boolean isDecreasing(int[] arr){
        for(int i = 1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                return false;
            }
        }
        return true;
    }
    public static boolean isIncreasing(int[] arr){
        for(int i = 1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
}