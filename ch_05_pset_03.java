import java.util.Scanner;

public class ch_05_pset_03 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int tab = num.nextInt();
        //multiplication table of entered number.
        for (int i = 1; i<=10;i++){
            System.out.println(tab+"X"+i+"="+(tab*i));
        }
    }
}
