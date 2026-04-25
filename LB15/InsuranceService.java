import java.io.FileWriter;
import java.io.IOException;
import java.time.Year;

public class InsuranceService {

    /**
     * Перевіряє коректність даних та записує їх у файл.
     */
    public void save(Person person) throws InvalidNameException, InvalidSalaryException, InvalidDateException {
        validateName(person.getName());
        validateSalary(person.getSalary());
        validateDate(person.getYearOfBirth(), person.getBirthMonth(), person.getBirthday());
        writeToFile(person);
    }

    /**
     * Перевіряє ім'я особи.
     */
    private void validateName(String name) throws InvalidNameException {
        if (name == null) {
            throw new InvalidNameException("Ім'я не може бути null.");
        }
    }

    /**
     * Перевіряє зарплатню особи.
     */
    private void validateSalary(Double salary) throws InvalidSalaryException {
        if (salary == null) {
            throw new InvalidSalaryException("Зарплатня не може бути null.");
        }
        if (salary < 0) {
            throw new InvalidSalaryException("Зарплатня не може бути менше 0. Отримано: " + salary);
        }
    }

    /**
     * Перевіряє коректність дати народження.
     */
    private void validateDate(int year, int month, int day) throws InvalidDateException {
        int currentYear = Year.now().getValue();

        if (year > currentYear) {
            throw new InvalidDateException("Рік народження ще не настав: " + year);
        }
        if (year < 1900) {
            throw new InvalidDateException("Рік народження занадто давній: " + year);
        }
        if (month < 1 || month > 12) {
            throw new InvalidDateException("Некоректний місяць: " + month);
        }

        int[] daysInMonth = {31, 28, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        int maxDay = (month == 2 && isLeap) ? 29 : daysInMonth[month - 1];

        if (day < 1 || day > maxDay) {
            throw new InvalidDateException("День " + day + " не існує у місяці " + month);
        }
    }

    /**
     * Записує дані особи у файл.
     */
    private void writeToFile(Person person) {
        String record = "Ім'я: " + person.getName() +
                " | Дата народження: " + person.getBirthday() + "." +
                person.getBirthMonth() + "." + person.getYearOfBirth() +
                " | Зарплатня: " + person.getSalary() + " грн\n";

        try (FileWriter fw = new FileWriter("insurance.txt", true)) {
            fw.write(record);
            System.out.println("Запис збережено: " + record.trim());
        } catch (IOException e) {
            System.out.println("Помилка запису у файл: " + e.getMessage());
        }
    }
}
