import java.util.List;

public class Member {
    private String name;
    private String id;
    private List<Book> borrowedBooks;

    public Member(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() { return name; }
    public String getId() { return id; }
    public List<Book> getBoorrowedBooks() { return borrowedBooks; }

    public void borrowBook(Book book) {
        if(!book.isBorrowed()){
            book.borrowBook();
            borrowedBooks.add(book);
        }else {
            System.out.println("Book is already borrowed by someone else.");
        }
    }

    public void returnBook(Book book) {
        if(borrowedBooks.contains(book)) {
            book.returnBook();
            borrowedBooks.remove(book);
        } else {
            System.out.println("This book was not borrowed by " + name);
        }
    }

}
