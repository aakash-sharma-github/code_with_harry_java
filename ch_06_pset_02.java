import java.util.Scanner;

public class ch_06_pset_02 {
    public static void main(String[] args) {
        // Find out given integer is present in the array or not.
        Scanner n = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = n.nextInt();
        int[] arr = {50, 70, 80, 3, 5, 7, 35};
        boolean val = false;
        for (int element : arr) {
            if (num == element) {
                val = true;
                break;
            }
        }
        if (val) {
            System.out.println("The number " + num + " is present in the array.");
        } else {
            System.out.println("Not present.");
        }
    }
}
