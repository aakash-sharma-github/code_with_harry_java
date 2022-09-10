public class ch_06_pset_05 {
    public static void main(String[] args) {
        // Reverse an array.
        int [] arr = {5, 4, 3, 2, 1, 6, 8, 10};
        int n = Math.floorDiv(arr.length, 2);
        int temp;
        for (int i = 0; i < n; i++){
            temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        for (int element : arr) {
            System.out.print(element+" ");
        }
    }
}
