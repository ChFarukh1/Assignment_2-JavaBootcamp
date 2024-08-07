import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatDate {
    public static void main(String[] args) {
        LocalDate date = LocalDate.parse("2024-07-24");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-M-yyyy");
        String formattedDate = formatter.format(date);
        System.out.println("Formatted Date: " + formattedDate);
    }
}
