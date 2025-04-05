package Arya;
import java.util.Scanner;
public class EvenOddChecker {

    static class Number {
        int num;

        void input() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            num = sc.nextInt();
        }

        void check() {
            if (num % 2 == 0) {
                System.out.println(num + " is Even.");
            } else {
                System.out.println(num + " is Odd.");
            }
        }
    }

    public static void main(String[] args) {
        Number n = new Number();
        n.input();
        n.check();
    }
}
