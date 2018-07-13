import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        String st;
        System.out.println("Please enter a string");
        Scanner input = new Scanner(System.in);
        st = input.nextLine();

        System.out.println("Your string has " + countLetter(st) + " letters!" );
    }

    private static int countLetter(String string) {
        return string.length();
    }
}
