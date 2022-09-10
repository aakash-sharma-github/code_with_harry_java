import java.util.Scanner;

public class ch_05_pset_11 {
    public static void main(String[] args) {
        // sum of n number using for loop.
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = num.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++)
        {
            sum = sum + (2*i);
        }
        System.out.println("Sum of the entered number is: "+sum);
    }
}
