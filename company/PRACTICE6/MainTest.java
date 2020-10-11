package com.company.PRACTICE6;

public class MainTest {
    public static void main(String[] args) {
        SortingStudentsByGPA[] iDNumber = SortingStudentsByGPA.getSamples(true);
        System.out.println("Without sorting");

        for (int i=0; i<iDNumber.length; i++){
            System.out.print(iDNumber[i]);
            System.out.print(' ');
        }
        System.out.println();
        System.out.println();
        System.out.println("Sorting by iDNumber");

        SortingStudentsByGPA[] sortedById = Insertion.insertionSort(iDNumber);

        for (int i=0; i<sortedById.length; i++){
            System.out.print(sortedById[i]);
            System.out.print(' ');
        }
        System.out.println();
        System.out.println();
        System.out.println("Sorting by GPA");

        SortingStudentsByGPA[] sortByGPA = SortingStudentsByGPA.getSamples(false);
        Quick.quickSort(sortByGPA, 0, sortByGPA.length - 1);

        for (int i=0; i<sortByGPA.length; i++){
            System.out.print(sortByGPA[i]);
            System.out.print(' ');
        }
        System.out.println();
        System.out.println();
        System.out.println("two lists without sorting by id");

        int[] sortByAll = new int[iDNumber.length + sortByGPA.length];
        int j=0;
        for (int i=0; i<sortByAll.length; i++){
            if (i<iDNumber.length){
                sortByAll[i] = iDNumber[i].getId();
            } else {
                sortByAll[i] = sortByGPA[j].getGPA();
                j++;
            }
        }

        for (int i=0; i<sortByAll.length; i++){
            System.out.print(sortByAll[i]);
            System.out.print(' ');
        }
        System.out.println();
        System.out.println();
        System.out.println("two lists with sorting by id");

        Merge.mergeSort(sortByAll, 0, sortByAll.length);

        for (int i=0; i<sortByAll.length; i++){
            System.out.print(sortByAll[i]);
            System.out.print(' ');
        }
    }
}
