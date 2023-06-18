package zadanie9;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class time {
    public static void main(String[] args) {
        System.out.println("Введите дату, в формате YYYY-MM-DD");
        Scanner scanner = new Scanner(System.in);
        String dateString = scanner.nextLine();
        LocalDate date = LocalDate.parse(dateString, DateTimeFormatter.ISO_DATE); // как раз таки формат 2023-03-21
        DayOfWeek day = date.getDayOfWeek();

        System.out.println("дата: " + date + " день недели: " + day);
    }
}
