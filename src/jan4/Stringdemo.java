package jan4;

import java.util.Arrays;
import java.util.Locale;

public class Stringdemo {
    public static void main(String[] args) {
        String name="red petals of rose";
        System.out.println(name.toLowerCase());
        System.out.println(name.charAt(6));
        //System.out.println(name.toUpperCase(Locale.ENGLISH));
        System.out.println(name.toLowerCase(new Locale("ur","PK")));
        System.out.println(name.concat(" reminds me of red sky"));
        System.out.println(name.contains("petals"));
        System.out.println(name.indexOf("red",6));
        System.out.println(name.trim());
        String[]splita=name.split("pe",8);
        System.out.println(Arrays.toString(splita));
        System.out.println(name.contentEquals("red petals of rose"));//it is used to check for stringbuffer and
        // stringbuilder
        System.out.println(name.endsWith("rose"));
        System.out.println(name.lastIndexOf("petals",4));
    }
}
