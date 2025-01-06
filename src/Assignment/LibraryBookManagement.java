package Assignment;

import java.util.Scanner;

public class LibraryBookManagement {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] books=new String[6];

        //books name from user
        System.out.println("Enter Books name");
        for(int i=0;i< books.length;i++){
            books[i]=scanner.next();
        }

        //book name search
        System.out.println("Enter the book name");
        String bookName=scanner.next();

        boolean found=false;
        for(int j=0;j< books.length;j++){
            if(books[j].equals(bookName)){
                System.out.println("It is in the library");
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("Book is not in the library");
        }

        //change the title
        System.out.println("Enter the title you want to update");
        String titleChange=scanner.next();
        System.out.println("Enter the new title");
        String newTitle=scanner.next();

        for(int i=0;i< books.length;i++){
            if (books[i].equals(titleChange)){
                books[i]=newTitle;
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("Book is not in the library");
        }

        //new books list
        System.out.println("New list is:");
        for(String book:books){
            System.out.println(book);
        }
    }

}
