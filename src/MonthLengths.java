import java.util.Scanner;

public class MonthLengths {


    public static boolean isLeapYear(int year) {
        // Check if a year is a leap year
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int[] getMonthLengths(int year) {
        // Return the lengths of each month in the given year
        if (isLeapYear(year)) {
            return new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        } else {
            return new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        int[] monthLengths = getMonthLengths(year);

        System.out.println("Lengths of each month in the year " + year + ":");
        for (int month = 0; month < monthLengths.length; month++) {
            System.out.println("Month " + (month + 1) + ": " + monthLengths[month] + " days");
        }

        scanner.close();
    }

}






















