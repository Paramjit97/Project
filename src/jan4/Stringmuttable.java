package jan4;

public class Stringmuttable {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Paramjit");
        sb.insert(sb.length(), "kaur",0,4);
        System.out.println(sb);
        sb.replace(3,5,"hihi");
    }
}
