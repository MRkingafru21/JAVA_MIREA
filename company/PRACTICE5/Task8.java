package com.company.PRACTICE5;

class Task8 {
    public static boolean recursion(String l) {
        char fChar;
        char lChar;
        int rate = l.length();
        String subString;

        if (rate <= 1) {
            return true;
        } else {
            fChar = l.toCharArray()[0];
            lChar = l.toCharArray()[rate - 1];
            subString = l.substring(1, rate - 1);

            return fChar == lChar && recursion(subString);
        }
    }
}
