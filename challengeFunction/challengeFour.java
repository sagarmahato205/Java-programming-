import java.util.Scanner;

public class challengeFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        while (num > 0) {
            int fact = num %10;
            sum += fact;
            num = num/10;
        }
        System.out.println(sum);
    }
}
