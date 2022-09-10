import java.util.Scanner;

public class ch_4_pset_03 {
    public static void main(String[] args) {
        Scanner salary = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        int amt = salary.nextInt();
        // calculate income tax.
        //Less than 2.5 L no income tax.
        if (amt < 250000){
            System.out.println("You don\'t have to pay any tax.");
        }
        //2.5 - 5.0 L 5% income tax.
        else if (amt == 250000 || amt <= 500000){
            System.out.println("You have to pay 5% tax.");
            System.out.println("Amount you have to pay: " + (amt * 0.05));
        }
        //5.0 - 10.0 L 20% income tax.
        else if (amt == 500000 || amt <= 1000000) {
            System.out.println("You have to pay 20% tax.");
            System.out.println("Amount you have to pay: " + (amt * 0.20));
        }
        //Above 10.0 L 30% income tax.
        else {
            System.out.println("You have to pay 30% tax.");
            System.out.println("Amount you have to pay: " + (amt * 0.30));
        }
    }
}
