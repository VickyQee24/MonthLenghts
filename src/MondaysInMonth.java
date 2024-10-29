import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;
public class MondaysInMonth {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Get the current year
            int currentYear = LocalDate.now().getYear();

            System.out.println("Current Year: " + currentYear);
            System.out.print("Enter the month number (1-12): ");
            int monthNumber = scanner.nextInt();

            // Validate the month input
            if (monthNumber < 1 || monthNumber > 12) {
                System.out.println("Invalid month. Please enter a number between 1 and 12.");
                return;
            }

            Month month = Month.of(monthNumber);

            System.out.println("Mondays in " + month + " " + currentYear + ":");

            // Find all Mondays in the given month
            LocalDate firstDayOfMonth = LocalDate.of(currentYear, month, 1);
            LocalDate lastDayOfMonth = firstDayOfMonth.withDayOfMonth(firstDayOfMonth.lengthOfMonth());

            for (LocalDate date = firstDayOfMonth; !date.isAfter(lastDayOfMonth); date = date.plusDays(1)) {
                if (date.getDayOfWeek().getValue() == 1) { // 1 represents Monday
                    System.out.println(date);
                }
            }

            scanner.close();
        }
    }



