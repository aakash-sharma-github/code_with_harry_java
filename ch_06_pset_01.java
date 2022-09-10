public class ch_06_pset_01 {
    public static void main(String[] args) {
        // array of 5 float and their sum.
        float [] arr = {2.5f, 5.2f, 3.3f, 1.2f, 2.2f};
        float sum = 0;
        for (float element:arr) {
            sum = sum + element;
        }
        System.out.println("sum of the array is: "+sum);
    }
}
