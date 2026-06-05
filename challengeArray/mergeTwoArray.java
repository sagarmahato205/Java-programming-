// public package challengeArray;

// import java.util.Scanner;

public class mergeTwoArray {

    public static void main(String[] args) {
        int[] arr1 = {2,3,5,7,9};
        int[] arr2 = {1,4,6,8,};
        int i = 0;
        int j = 0;
        int k = 0;
        int[] newArr = new int[arr1.length + arr2.length];
        
        while(i<arr1.length || j<arr2.length){
            if(j == arr2.length || (i < arr1.length && arr1[i] < arr2[j])){
                newArr[k] = arr1[i];
                i++;
                k++;
            }else{
                newArr[k] = arr2[j];
                j++;
                k++;
            }
        }


        for(int l = 0; l<newArr.length;l++){
            System.out.print("{ "+newArr[l] +"}");
        }
    }
}