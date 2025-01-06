package HackerRank;
import java.util.Scanner;

public class StrinNUm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int j = 0; j < 3; j++) {
            String s = scan.next();
            String spaces = "";
            while(s.length()<15) {
                for (int i = s.length(); i < 15; i++) {
                    spaces += " ";
                }
            }
            int num = scan.nextInt();
            String finalNum = "";
            if (num < 10) {
                finalNum = "0" + num;
            } else if (num < 100) {
                finalNum = "00" + num;
            } else {
                finalNum = Integer.toString(num);
            }
            System.out.println(s + spaces + finalNum);
        }
    }
}
