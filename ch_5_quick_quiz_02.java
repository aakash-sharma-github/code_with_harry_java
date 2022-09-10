import java.sql.SQLOutput;
import java.util.Scanner;

public class ch_5_quick_quiz_02 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
//        System.out.println("Enter your number: ");
//        int n = num.nextInt();
        // Printing numbers user entered time in reverse order.
        System.out.println("How much you want to print? ");
        int m = num.nextInt();
        for (int i = m; i > 0; i--)
        {
            System.out.println(i);
        }
    }
}
