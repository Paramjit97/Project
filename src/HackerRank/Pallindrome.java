package HackerRank;

import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input");
        int x = scanner.nextInt();
        Pallindrome p = new Pallindrome();
        boolean result= p.isPlaindrome(x);
        System.out.println(result);
    }

    public boolean isPlaindrome(int x) {
        boolean isp=false;
        int output;
        String s = Integer.toString(x);
        String rev = "";
        // to know data type System.out.println(s.getClass().getSimpleName());
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        if (rev.equalsIgnoreCase(s)) {
            isp=true;
        } else {
            isp=false;
        }
        output = Integer.parseInt(rev);
        return isp;
    }


}
