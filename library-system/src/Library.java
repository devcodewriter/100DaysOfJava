import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
    private List<Book> books;
    private List<Member> members;
    private Map<String, Member> borrowedBooks;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
        this.borrowedBooks = new HashMap<>();
    }

    public void addBook(Book book){
        books.add(book);
        System.out.println("Added book: " + book.getTtitle());
    }

    public void registerMember(Member member) {
        members.add(member);
        System.out.println("Registered member: " + member.getName());
    }

    public void borrowBook(String isbn, String memberId) {
        Book book = findBookByIsbn(isbn);
        Member member = findMemberById(memberId);

        if(book == null || member == null) {
            System.out.println("Invalid book or member information.");
            return;
        }

        if(!book.isBorrowed()){
            member.borrowBook(book);
            borrowedBooks.put(isbn, member);
        } else{
            System.out.println("Book is currenctly borrowed by another member.");
        }

    }

    public void returnBook(String isbn, String memberId) {
        Book book = findBookByIsbn(isbn);
        Member member = findMemberById(memberId);

        if(book == null || member == null) {
            System.out.println("Invalid book or member information.");
            return;
        }
        if(borrowedBooks.get(isbn) == member) {
            member.returnBook(book);
            borrowedBooks.remove(isbn);
        }else {
            System.out.println("Book was not borrowed by this member.");
        }
    }

    private Book findBookByIsbn(String isbn) {
        for(Book book : books) {
            if(book.getIsbn().equals(isbn)){
                return book;
            }
        }
        return null;
    }

    private Member findMemberById(String id) {
        for(Member member: members) {
            if(member.getId().equals(id)){
                return member;
            }
        }
        return null;
    }

    public void listAvailableBooks() {
        for(Book book: books){
            if (!book.isBorrowed()) {
                System.out.println("Available book: " + book.getTtitle());
            }
        }
    }
}
