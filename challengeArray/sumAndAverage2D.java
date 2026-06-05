package challengeArray;

import java.util.Scanner;

public class sumAndAverage2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int columns = sc.nextInt();
        int[][] numArr = new int[rows][columns];
        int i = 0;
        while(i<numArr.length){
            int j = 0;
            while(j<numArr[i].length){
                System.out.println("Enter the element in row: "+(i+1) +"columns: "+(j+1) +":");
                numArr[i][j] = sc.nextInt();
                j++;
            }
            i++;
        }
        int k = 0;
        while(k<numArr.length){
            int l = 0;
            while(l<numArr[k].length){
                System.out.println("["+ numArr[k][l] +"]");
                l++;
            }
            k++;
        }

        int sum = 0;
        int s = 0;
        while(s<numArr.length){
            int t = 0 ;
            while (t<numArr[s].length) {
                sum += numArr[s][t];
                System.out.println(sum);
                t++;
            }
            s++;
        }
        System.out.println("Final Sum : "+ sum);
        double avg = (double)sum/(rows * columns);
        System.out.println("average : " + avg);
    }
}
