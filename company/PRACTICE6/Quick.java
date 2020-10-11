package com.company.PRACTICE6;

public class Quick {
    public static void quickSort(SortingStudentsByGPA[] array, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(array, left, right);
            quickSort(array, left, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, right);
        }
    }

    private static int partition(SortingStudentsByGPA[] array, int left, int right) {
        SortingStudentsByGPA pivot = array[right];
        int partitionIndex = left;

        for (int i = left; i < right; i++) {
            if (array[i].compareTo(pivot) < 1) {
                swap(array, i, partitionIndex);
                partitionIndex++;
            }
        }

        swap(array, partitionIndex, right);

        return partitionIndex;
    }

    private static void swap(SortingStudentsByGPA[] array, int i, int j) {
        SortingStudentsByGPA temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
