package Assignment;

import java.util.Scanner;

public class MovieRatingSystem {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[]movies=new String[5];
        int[]rating=new int[5];
        //enter movie name
        System.out.println("Enter movies name:");
        for(int i=0;i< movies.length;i++){
            movies[i]=scanner.nextLine();
        }
        //enter rating
        System.out.println("Enter rating:");
        for(int i=0;i<rating.length;i++){
            rating[i]=scanner.nextInt();
        }
        //
        int maxRating=rating[0];
        for(int i=1;i<5;i++){
            if(maxRating<rating[i]){
                maxRating=rating[i];
            }
        }
        for(int i=0;i<5;i++){
            if(rating[i]==maxRating){
                System.out.println("highest rated movie is:"+movies[i]);
            }
        }

    }
}
