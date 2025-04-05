import java.util.*;

public class Library {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String[] books = {"Java", "Python", "C++", "HTML", "DSA"};
        int choice;

        System.out.println("Available Books:");
        for (int i = 0; i < books.length; i++) {
            System.out.println((i+1) + ". " + books[i]);
        }

        System.out.print("Choose book number to issue: ");
        choice = sc.nextInt();

        if (choice >= 1 && choice <= books.length) {
            System.out.println("You issued: " + books[choice - 1]);
        } else {
            System.out.println("Invalid choice.");
        }
    }
}
