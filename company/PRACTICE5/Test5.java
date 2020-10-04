package com.company.PRACTICE5;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Well, let's check the task 8.Enter a word to test polyindrom ");
        String l = keyboard.nextLine();
        if (Task8.recursion(l)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        System.out.println("Well, let's check the task 9. Enter number of 0s and digits ");
        System.out.println(Task9.NoTo2Zer0(keyboard.nextInt() ,keyboard.nextInt()));
        System.out.println("Well, let's check the task 10. Enter number ");
        System.out.println(Task10.Nreversal(keyboard.nextInt()));
    }
}