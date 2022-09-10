import java.util.Scanner;

public class ch_5_pset_01 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        /*pattern
        * * * *
        * * *
        * *
        *
        */
        System.out.println("Enter your number: ");
        int n = num.nextInt();
        for (int i = n; i > 0; i--)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
