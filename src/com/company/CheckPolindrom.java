package com.company;

//https://stepik.org/lesson/12761/step/1?unit=3109
public class CheckPolindrom {
    public static void main(String[] args) {
       String  checkString = "Madam, I'm Adam!";
        checkString = checkString.replaceAll("[^A-Za-z1-9]*", "");
        checkString = checkString.toLowerCase();

        StringBuilder checkIsPolindrom1 = new StringBuilder(checkString);
        StringBuilder checkIsPolindrom2 = new StringBuilder(checkString);

        checkIsPolindrom2 = checkIsPolindrom2.reverse();

        if(checkIsPolindrom1.toString().equals(checkIsPolindrom2.toString()))
            System.out.println("The string is polindrom");
        else System.out.println("The string is not polindron");
    }
}
