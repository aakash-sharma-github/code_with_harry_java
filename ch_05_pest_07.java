import java.util.Scanner;

public class ch_05_pest_07 {
    public static void main(String[] args) {
        /*pattern using while loop.
                * * * *
                * * *
                * *
                *
         */
        Scanner num = new Scanner(System.in);
        System.out.println("Enter num: ");
        int n = num.nextInt();
        int j = 0;
        int i = n;
        while(i>0){
            while(j<i){
                System.out.println("*");
                i--;
            }
            System.out.println("\n");
            j++;
        }
    }
}
