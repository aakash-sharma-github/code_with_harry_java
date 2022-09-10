public class ch_3_pset_03 {
    public static void main(String[] args) {
        //letter templet using java/
        String great = "Dear <|name|>, thanks a lot.";
        great = great.replace("<|name|>", "Aakash"); //charSequence target & include "".
        System.out.println(great);
    }
}
