import java.util.Scanner;

public class ch_5_pset_05 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        // find factorial of given number.
        System.out.println("Enter any number: ");
        int fac = num.nextInt();
        int result = 1;
        for (int i = 1; i<=fac; i++){
            result = result * i;
        }
        System.out.println("Your Factorial is: "+result);
    }
}
