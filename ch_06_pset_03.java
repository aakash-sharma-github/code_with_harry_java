public class ch_06_pset_03 {
    public static void main(String[] args) {
        //calculate the average from an array.
        int [] marks = {50, 60, 70, 80, 90};
        int sum = 0;
        for (int element:marks) {
            sum = sum + element;
        }
        System.out.println("The average of the marks is: " + sum/ marks.length);
    }
}
