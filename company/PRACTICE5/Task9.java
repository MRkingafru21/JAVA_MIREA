package com.company.PRACTICE5;

public class Task9 {
    public static int NoTo2Zer0(int a, int b) {
        if (a > b + 1) {
            return 0;
        }
        if (a == 0 || b == 0) {
            return 1;
        }
        return NoTo2Zer0(a, b - 1) + NoTo2Zer0(a - 1, b - 1);
    }
}
