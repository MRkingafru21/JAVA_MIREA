package com.company.PRACTICE6;

import java.util.Random;

class SortingStudentsByGPA implements Comparable <SortingStudentsByGPA>{

    private Integer id;
    private Integer GPA;

    public Integer getGPA() {
        return GPA;
    }

    public void setGPA(Integer GPA) {
        this.GPA = GPA;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public static SortingStudentsByGPA[] getSamples(boolean flag)
    {
        Random random = new Random();
        var students = new SortingStudentsByGPA[10];

        if (flag == true) {

            for (int i = 0; i < 10; i++) {
                SortingStudentsByGPA student = new SortingStudentsByGPA();
                student.setId(random.nextInt(30) + i);
                students[i] = student;
            }
        } else {
            for (int i = 0; i < 10; i++) {
                SortingStudentsByGPA student = new SortingStudentsByGPA();
                student.setGPA(random.nextInt(7) + 1);
                students[i] = student;
            }
        }

        return students;
    }

    @Override
    public String toString() {
        return "Student with " +
                "id: " + id +
                " and GPA: " + GPA;
    }

    @Override
    public int compareTo(SortingStudentsByGPA o) {
        return o.GPA - this.GPA;
    }
}
