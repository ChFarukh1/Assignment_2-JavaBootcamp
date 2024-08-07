
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AddDaysToDate {
    public static void main(String[] args) {
        LocalDate date = LocalDate.parse("2024-07-24");
        LocalDate newDate = date.plusDays(30);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = formatter.format(newDate);
        System.out.println("New Date after adding 30 days: " + formattedDate);
    }
}
