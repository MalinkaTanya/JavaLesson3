package com.company;

//4
public class IncreasingSequence {
    public static void main(String[] args) {
        int number = 351;

        String temp = Integer.toString(number);
        char[] array = temp.toCharArray();

        for (int i = 0; i < array.length - 1; i++) {

            if (Character.getNumericValue(array[i]) > Character.getNumericValue(array[i + 1])) {
                System.out.println("not increasing sequence");
                return;
            }

        }
        System.out.println("increasing sequence");
    }
}
