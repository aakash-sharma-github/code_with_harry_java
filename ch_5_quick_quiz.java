import java.util.Scanner;

public class ch_5_quick_quiz {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n = num.nextInt();
        //printing entered time odd number.

        for (int i = 0; i < n; i++){
            System.out.println(2*i+1);
        }
        System.out.println("Odd Number");
    }
}
