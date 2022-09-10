import java.util.Scanner;

public class ch_4_pset_02 {
    public static void main(String[] args) {
        //java code to find out wether a student is pass or fail.
        Scanner sub = new Scanner(System.in);
        int marks;
        System.out.println("Enter sub1 marks: ");
        int sub1 = sub.nextInt();
        System.out.println("Enter sub2 marks: ");
        int sub2 = sub.nextInt();
        System.out.println("Enter sub3 marks: ");
        int sub3 = sub.nextInt();
        // Required mark is 40% and at least 33% to pass the exam.
        marks = (sub1 + sub2 + sub3) * 100 / 300;
        System.out.println("Your total marks is "+marks+" %");
        if (marks >= 40 || marks == 33){
            System.out.println("congrats!!! \n You have passed.!!!");
        }
        else {
            System.out.println("sorry!!! \n You have failed. \n \t Better luck next time...");
        }
    }
}
