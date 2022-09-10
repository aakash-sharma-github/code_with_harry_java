import java.util.Scanner;

public class ch_5_pset_02 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n = num.nextInt();
        // sum of n number using while loop.
        int i = 0;
        int sum = 0;
        while (i<n){
            sum = sum + (2*i);
            i++;
        }
        System.out.print("Your sum of even number is: ");
        System.out.print(sum);
    }
}
