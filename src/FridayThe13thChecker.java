import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


    public class FridayThe13thChecker {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

            System.out.print("Enter a date (yyyy-MM-dd): ");
            String inputDate = scanner.nextLine();

            try {
                // Parse the input date
                LocalDate date = LocalDate.parse(inputDate, formatter);

                // Check if it's the 13th and a Friday
                if (date.getDayOfMonth() == 13 && date.getDayOfWeek().getValue() == 5) {
                    System.out.println(date + " is a Friday the 13th!");
                } else {
                    System.out.println(date + " is not a Friday the 13th.");
                }
            } catch (Exception e) {
                System.out.println("Invalid date format. Please enter the date in yyyy-MM-dd format.");
            }

            scanner.close();
        }
    }



