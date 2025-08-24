class Member {
    String name;
    String[] borrowedBooks;
    int count;

    Member(String n, int size) {
        name = n;
        borrowedBooks = new String[size];
        count = 0;
    }

    void borrowBook(String book) {
        if (count < borrowedBooks.length) {
            borrowedBooks[count] = book;
            count++;
        } else {
            System.out.println("Cannot borrow more books.");
        }
    }

    void displayBorrowedBooks() {
        if (count == 0) {
            System.out.println(name + " has not borrowed any books.");
        } else {
            System.out.println(name + " has borrowed:");
            for (int i = 0; i < count; i++) {
                System.out.println("- " + borrowedBooks[i]);
            }
        }
    }
}

public class Library {
    public static void main(String[] args) {
        Member m = new Member("Alice", 5);
        m.borrowBook("The Wings of Fire");
        m.borrowBook("Harry Potter");
        m.borrowBook("To Kill a Mockingbird");
        m.displayBorrowedBooks();
    }
}
