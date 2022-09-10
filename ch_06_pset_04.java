public class ch_06_pset_04 {
    public static void main(String[] args) {
        // Addition of 2X3 matrix nad print in matrix form.
        int [][] mtrx1 = {{1, 2, 3},
                          {4, 5, 6}};
        int [][] mtrx2 = {{5, 6, 7},
                          {7, 8, 9}};
        int [][] result = {{0, 0, 0},
                           {0, 0, 0}};

        for (int i = 0; i< mtrx1.length; i++){
            for (int j = 0; j<mtrx1[i].length;j++){
                result[i][j] = mtrx1[i][j] + mtrx2[i][j];
//                System.out.println(result[i][j] + " ");
            }
        }

        for (int i = 0; i< mtrx1.length; i++){
            for (int j = 0; j<mtrx1[i].length;j++){

                System.out.print(result[i][j] + " ");
                result[i][j] = mtrx1[i][j] + mtrx2[i][j];
            }
            System.out.println("");
        }

    }
}
