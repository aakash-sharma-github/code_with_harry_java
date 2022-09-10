public class ch_06_pset_06 {
    public static void main(String[] args) {
        // finding the largest value of an array.
        int [] max = {10, 20, 30, 100};
        int arr = max[0];
        for (int i = 0; i < max.length; i++){
            if (arr < max[i]){
                arr = max[i];
                System.out.println(arr);
            }
        }
    }
}
