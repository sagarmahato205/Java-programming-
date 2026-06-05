import java.util.Scanner;
public class fiver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("type your temperature");
        double temp = sc.nextDouble();
        if (temp>100) {
            System.out.println(temp+"you have a fiver");
        }else{
            System.out.println(" you are safe");
        }
    }
}
