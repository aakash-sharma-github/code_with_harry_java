import java.util.Scanner;

public class ch_4_pset_05 {
    public static void main(String[] args) {
        Scanner year = new Scanner(System.in);
        System.out.println("Enter your year: ");
        int years = year.nextInt();
        //Entered year is leap year or not.
        if (years % 4 == 0){
            System.out.println(years+" is leap year.");
        }
        else {
            System.out.println(years+" is not a leap year.");
        }
    }
}
