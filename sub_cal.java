import java.util.Scanner;

public class sub_cal {
    public static void main(String[] args) {
        Scanner sub = new Scanner(System.in);
        float per;
        float per2;
        System.out.println("Enter your English marks: ");
        float Eng = sub.nextFloat();
        System.out.println("Enter your Maths marks: ");
        float maths = sub.nextFloat();
        System.out.println("Enter your Physics marks: ");
        float phy = sub.nextFloat();
        System.out.println("Enter your Chemistry marks: ");
        float chem = sub.nextFloat();
        System.out.println("Enter your Nepali marks: ");
        float nepali = sub.nextFloat();
        per = Eng + maths + phy + chem + nepali;
        per2 = per * 100 / 500;
        System.out.println("Your total marks is: "+per);
        System.out.println("Your total percentage is: "+per2+"%");



    }
}
