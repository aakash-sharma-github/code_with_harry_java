public class ch_2_pset_02 {
    public static void main(String[] args) {
        char grade = 'A';
        //java program to encrypt grade by adding 8.
        grade = (char)(grade + 8);
        //fake grade.
        System.out.println(grade);
        //real grade.
        //Decrypting grade.
        grade = (char)(grade - 8);
        System.out.println(grade);
    }
}
