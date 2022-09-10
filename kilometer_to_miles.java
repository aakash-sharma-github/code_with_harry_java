import java.util.Scanner;

public class kilometer_to_miles {
    public static void main(String[] args) {
        Scanner kilo = new Scanner(System.in);
        float mile = 1.609f;
        float result;
        System.out.println("Enter distance in kilometer: ");
        float kilometer = kilo.nextFloat();
        result = kilometer / mile;
        System.out.println(result+" mile.");


    }
}
