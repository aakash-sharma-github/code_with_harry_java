import java.util.Scanner;

public class program {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        int result;
        result = days * 24 * 60 * 60;
        System.out.println(result);
    }
}
