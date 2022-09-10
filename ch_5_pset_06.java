import java.util.Scanner;

public class ch_5_pset_06 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int fac = num.nextInt();
        // factorial using while loop.
        int result = 1;
        int i = 1;
        while (i <= fac) {
            result = result * i;
            i++;
        }
        System.out.println("Your Factorial is: "+result);
    }
}
