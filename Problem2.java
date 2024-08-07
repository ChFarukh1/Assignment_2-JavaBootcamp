
import java.util.Scanner;

public class ValidateEmail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an email address: ");
        String email = scanner.nextLine();

        if (isValidUMTEmail(email)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }

    public static boolean isValidUMTEmail(String email) {
        String umtRegex = "^(\\d{10}|[a-zA-Z]+\\.\\w+)@gmail\\.com$";
        return email.matches(umtRegex);
    }
}
