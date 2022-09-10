import java.util.Scanner;

public class ch_05_pset_04 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        //multiplication table of entered number in reverse order.
        System.out.println("Enter any number: ");
        int tab = num.nextInt();
        for (int i = 10; i>=1; i--)
        {
            System.out.println(tab+"X"+i+"="+(tab*i));
        }
    }
}
