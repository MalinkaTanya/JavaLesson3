package com.company;

import java.math.BigInteger;

//https://stepik.org/lesson/12762/step/1?unit=3110
public class Factorial {
    public static void main(String[] args) {

        int endFactorial = 3;
        BigInteger resultFactorial = new BigInteger("1");

        for (int i = 1; i <= endFactorial; i++) {

            String InputNumber = Integer.toString(i);
            BigInteger bigInputNumber = new BigInteger(InputNumber);

            resultFactorial = resultFactorial.multiply(bigInputNumber);
        }

        System.out.println(resultFactorial);

    }
}
