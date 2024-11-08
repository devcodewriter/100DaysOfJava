public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isBorrowed;


    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTtitle() { return this.title; }
    public String getAuthor() { return this.author; }
    public String getIsbn() { return this.isbn; }
    public boolean isBorrowed() { return isBorrowed; }

    public void borrowBook() {
        if(!isBorrowed) {
            isBorrowed = true;
            System.out.println("Book borrowed: " + title);
        }else{
            System.out.println("Book is already borrowed");
        }
    }

    public void returnBook() {
        if(isBorrowed){
            isBorrowed = false;
            System.out.println("Book returned: " + title);
        }else {
            System.out.println("Book was not borrowed");
        }
    }
}
