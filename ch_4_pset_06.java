import java.util.Scanner;

public class ch_4_pset_06 {
    public static void main(String[] args) {
        Scanner web = new Scanner(System.in);
        System.out.println("Enter your Domain: ");
        String dom = web.nextLine();
        //finding type of given website.
        if (dom.endsWith(".com")){
            System.out.println(dom+ " is a 'Commercial website'"); //you can do this also too.. without escape sequence.
        }
        else if (dom.endsWith(".org")) {
            System.out.println(dom+" is a \'Organization website\'");
        }
        else if (dom.endsWith(".in")) {
            System.out.println(dom+" is a \'Indian website\'");
        }
        else {
            System.out.println("Invalid input...");
        }
    }
}
