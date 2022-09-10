import java.util.Scanner;

public class gpa {
    public static void main(String[] args) {
        Scanner gpa = new Scanner(System.in);
        float cgpa;
        System.out.println("Enter your first subject mark: ");
        float first = gpa.nextFloat();
        System.out.println("Enter your second subject mark: ");
        float second = gpa.nextFloat();
        System.out.println("Enter your third subject mark: ");
        float third = gpa.nextFloat();
        cgpa = (first + second + third) / 30;
        System.out.println("Your cgpa is: "+cgpa);
    }
}
