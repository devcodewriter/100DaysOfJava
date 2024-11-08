public class App {
    public static void main(String[] args) throws Exception {
        Library library = new Library();

        Book book1 = new Book("Clean Code: A Handbook of Agile Software Craftsmanship", "Robert C. Martin", "978-0132350884");
        Book book2 = new Book("Effective Java", "Joshua Bloch", "978-0134685991");
        library.addBook(book1);
        library.addBook(book2);

        Member member1 = new Member("John Doe", "M004");
        Member member2 = new Member("Alice", "M002");
        library.registerMember(member1);
        library.registerMember(member2);

        // Borrowing books
        library.borrowBook("978-0132350884", "M004");
        library.borrowBook("978-0134685991", "M002");

        // Listing available books
        library.listAvailableBooks();

        // returning  a book
        library.returnBook("978-0134685991", "M002");

        library.listAvailableBooks();

    }
}
