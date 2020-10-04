package com.company.PRACTICE5;

public class Task10 {
    private static int temp = 0;
    public static int Nreversal(int num) {
        int res = temp * 10 + num % 10;
        if (num > 10) {
            temp = res;
            res = Nreversal(num/10);
        }
        return res;
    }
}