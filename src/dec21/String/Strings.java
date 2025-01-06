package dec21.String;

public class Strings {
    public static void main(String[] args) {
        String s1="param";
        String s2="param";
        String s3="param";
        String s4="param";
        String s5="param";
        //it is
        // strings are immutable means it we cant change them..
        // in this example they all are refering to same object.let say we change s3="red" then s3 reference gonna chnage and
        // it will point to new object red,...it check the String changable pool
        //the rrson why they are immutable because lets take an eg that if it is muttable and i change s5 to black then it gonna
        //chnage every refernece yo black
        s5="color";
        String s6=s5;
        s5="yeha";
        System.out.println(s6);
        System.out.println(s5);
    }
}
