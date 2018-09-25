package com.company;

import java.util.Arrays;

//https://stepik.org/lesson/12762/step/1?unit=3110
public class IntegrationArrays {
    public static void main(String[] args) {

        int[] array1 = {0, 2, 2};
        int[] array2 = {1, 3};

        int resultLength = array1.length + array2.length;
        int array1Length = array1.length;
        int array2Length = array2.length;
        int[] res = new int[resultLength];

        int i = 0;
        int j = 0;
        for (int k = 0; k < resultLength; k++)
            if (i < array1Length && array1[i] <= array2[j]) {
                res[k] = array1[i];
                i++;
            } else if (j < array2Length) {
                res[k] = array2[j];
                j++;
            }
        System.out.println(Arrays.toString(res));
    }

}

