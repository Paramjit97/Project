package dec14;

public class Book {
    String title;
    String author;
    double price;
    String barcode;

    public Book(){
        title="five point someone";
        author="Chetan Bhagat";
        price=30;
        barcode="ISBN 456-3-4-245";
    }
    public Book(String title){
        this.title=title;
        author="Chetan Bhagat";
        price=20;
        barcode="ISBN 456-3-4-245";
    }
    public Book(String title,String author){
        this.title=title;
        this.author=author;
        price=30;
        barcode="ISBN 456-3-4-245";
    }
    public Book(String title, String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
        barcode="ISBN 456-3-4-245";
    }
    public Book(String title,String author,double price,String barcode){
        this.title=title;
        this.author=author;
        this.price=price;
        this.barcode=barcode;
    }



    public void displayDetails(){

    }
}
