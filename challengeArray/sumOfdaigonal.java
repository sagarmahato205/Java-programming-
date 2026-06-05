package challengeArray;

import java.util.Scanner;

public class SumOfDiagonal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows : ");
        int rows = sc.nextInt();

        System.out.println("Enter the number of columns : ");
        int col = sc.nextInt();
        if(rows != col){
            System.out.println("Daigonal sum is only possible when matrix is square ");
            return;
        }

        int[][] arr = new int[rows][col];
        for(int i = 0;i<rows;i++){
            for(int j = 0;j<col;j++){
                System.out.print("Enter element ["+ i +"]["+j+"]:");
                arr[i][j] = sc.nextInt();
            }
        }

        //Main Formula
        int sum = 0;
        for(int i = 0 ; i<rows ; i++){
            sum += arr[i][i];
            if(i!=rows - 1 -i){
                sum += arr[i][rows - 1 - i];
            }
        }


        System.out.println("\n matrix");

        for(int i = 0 ; i < rows ; i++){
            for(int j = 0;j<col;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        System.out.println("Total sum : " + sum);
    }
}