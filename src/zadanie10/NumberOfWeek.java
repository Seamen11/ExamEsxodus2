package zadanie10;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.WeekFields;
import java.util.Locale;
import java.util.Scanner;

public class NumberOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try (scanner) {
            System.out.print("Введите дату в формате ДД.ММ.ГГ: ");
            String inputDate = scanner.nextLine();
            int weekNumber = getWeekNumber(inputDate);
            System.out.println("Неделя " + weekNumber);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
    public static int getWeekNumber(String inputDate) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yy");
            LocalDate date = LocalDate.parse(inputDate, formatter);
            WeekFields weekFields = WeekFields.of(Locale.getDefault());
            return date.get(weekFields.weekOfWeekBasedYear());
        } catch (Exception e) {
            throw new IllegalArgumentException("Неверный формат даты");
        }
    }

}
