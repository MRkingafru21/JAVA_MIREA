package com.company.PRACTICE6;

class Insertion {
    public static SortingStudentsByGPA[] insertionSort(SortingStudentsByGPA[] array) {

        for (int i = 1; i < array.length; i++) {
            SortingStudentsByGPA elem = array[i];
            int j = i - 1;

            while (j >= 0 && (array[j].getId() > elem.getId())) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = elem;
        }

        return array;
    }
}
