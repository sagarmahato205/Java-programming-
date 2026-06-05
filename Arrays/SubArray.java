package Arrays;

public class SubArray {
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        int currSum = 0 ;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0 ; i< numbers.length;i++){
            for (int j = i ; j < numbers.length ; j++){
                currSum = 0 ; 
                for(int k = i ; k <= j ; k++){
                    currSum += numbers[k];
                    System.out.print(numbers[k]+" ");
                }
               System.out.println();
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }

            System.out.println("SubArrays "+currSum);
        }
        System.out.println("MAx SubArray" + maxSum);
    }    
}
