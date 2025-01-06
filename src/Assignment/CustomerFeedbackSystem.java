package Assignment;
import java.util.Scanner;
public class CustomerFeedbackSystem {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[]reviews=new String[5];

        //Enter the reviews
        System.out.println("Enter the review");
        for(int i=0;i< reviews.length;i++){
            reviews[i]=scanner.nextLine();
        }
        System.out.println("Customer reviews");
        for(String review:reviews){
            System.out.println(review);
        }

        //find the word
        boolean found=false;
        System.out.println("Enter the word:");
        String word=scanner.next();
        for(int i=0;i< reviews.length;i++){
            if(reviews[i].contains(word)){
                System.out.println(reviews[i]);
                found=true;
            }
        }
        if(!found){
            System.out.println("result 0");
        }
    }
}
