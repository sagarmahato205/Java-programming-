package challengesLoop;

import java.util.Scanner;

public class passwordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Password;
        do{
            System.out.print("Please Enter your password : "  );
            Password = sc.next();
        }while(!isRightPassword(Password));
        System.out.println("Thank you for entering the right password");
    }
    public static boolean isRightPassword(String Password){
        return Password.length() > 6;
    }
}
