package PRACTICE9.Task2;

public class FindStudent {

    public static boolean findStudent(Student[] students, String surname) throws StudentNotFoundException {
        for (Student student : students) {
            if (student.getSurname().equals(surname)) {
                return true;
            }
        }
        throw new StudentNotFoundException("Студента с такой фамилией нету в списке");
    }

}
