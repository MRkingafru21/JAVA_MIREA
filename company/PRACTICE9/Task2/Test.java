package PRACTICE9.Task2;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        LabClassUI[] students = new Student[5];
        students[0] = new Student(123456, "Иванов", 4.0);
        students[1] = new Student(914192, "Поляков", 4.5);
        students[2] = new Student(460123, "Смирнов", 3.6);
        students[3] = new Student(412412, "Оводов", 3.3);
        students[4] = new Student(120120, "Петров", 3.3);

        System.out.println("Результаты студентов: " + Arrays.toString(students) + "\n");

        System.out.println("Тестирование поиска студента по фамилии");
        Scanner keyboard = new Scanner(System.in);
        String searchSurname = null;
        String next = "Да";
        boolean found = true;
        while (next.equals("Да")) {
            try {
                System.out.println("Введите фамилию студента: ");
                searchSurname = keyboard.next();
                if (!FindStudent.findStudent((Student[]) students, searchSurname)) {

                    throw new StudentNotFoundException("Студента с такой фамилией нету в списке");
                }
            } catch (StudentNotFoundException e) {
                found = false;
                e.printStackTrace();
            } finally {
                if (found) {
                    System.out.println("Студент с фамилией " + searchSurname + " найден");
                }
                System.out.println("Чтобы продолжить введите 'y' или 'n' для завершения программы");
                next = keyboard.next();
            }
        }

    }
}
