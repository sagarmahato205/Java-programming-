package challengeObject;

public class books {

    static int totalNoOfBooks;

    String title;
    String author;
    String isbn;
    boolean isBorrowed;

    
    static{
        totalNoOfBooks = 0;
    }
    {
        totalNoOfBooks++;
    }

    books(String isbn,String title , String author){

        this.isbn = isbn;
        this.title = title;
        this.author = author;

    }

    books(String isbn){
        this(isbn ,"unKnown" ,"unKnown");
    }

    static int getTotalNumberOFBooks(){
        return totalNoOfBooks;
    }

    void BorrowBook(){
        if(isBorrowed){
            System.out.println("Book is already borrowed");
        }else{
            this.isBorrowed = true;
            System.out.println("enjoy : "+this.title);
        }
    }

    void returnBook(){
        if(isBorrowed){
            this.isBorrowed =false;
            System.out.println("hope you enjoyed the book, Please share your review : "+this.title);
        }else{
            System.out.println("Book is already in the library");
        }
    }
    public static void main(String[] args) {
        books designOfThings = new books("1", "design","Author");
        books myBooks = new books("2");
        System.out.println(books.getTotalNumberOFBooks());
        designOfThings.BorrowBook();
        myBooks.BorrowBook();
        designOfThings.returnBook();
        myBooks.returnBook();
    }

}



