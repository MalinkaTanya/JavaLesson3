package com.company;

//5
public class ArraySorting {
    public static void main(String[] args) {
        int[] array = {12, 1, 8, 25, 17, 0, 3};

        for (int i = 0; i < array.length; i++) {
            int minNumber = array[i];
            int minIndex = i;

            for (int j = i + 1; j < array.length; j++) {

                if (array[j] < minNumber) {
                    minNumber = array[j];
                    minIndex = j;
                }

            }

            if (i != minIndex) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }

        }

        System.out.print("[" + array[0]);
        for (int i = 1; i < array.length; i++) {
            System.out.print(","+ array[i]);
        }
        System.out.print("]");

    }
}
