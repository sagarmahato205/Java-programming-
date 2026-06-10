package challengesLoop;

import java.util.Scanner;

public class ExitOnExit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your command : ");
            String command = sc.next();
            if(command.equals("Exit")){
                break;
            }
        }
        System.out.println("your are successfully Exited");
    }
}
