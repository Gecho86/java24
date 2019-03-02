package pl.sda.statements;

import java.util.Scanner;

public class DayOfWeek {

    /*

    Zadanie 5. Napisz program, który dla podanej liczby wypisze na ekran konsoli dzień tygodnia (dla 1 - "poniedziałek",
    2 - "wtorek" itp). Dodatkowo wyświetl ile dni zostało do weekendu, dla poniedziałku - 5 dni, wtorku - 4 itp.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter your name: ");
        String name = scanner.next();

        System.out.print("What number day, in this week is today: ");
        int day = scanner.nextInt();

        System.out.println();
        System.out.println("Hello " + name + " today is " + day + " day.");

        switch (day){
            case 1:
                System.out.println("Monday," + " to weekend is: " + (6 - day) + " days");
                break;
            case 2:
                System.out.println("Tuesday," + " to weekend is: " + (6 - day) + " days");
                break;
            case 3:
                System.out.println("Wednesday," + " to weekend is: " + (6 - day) + " days");
                break;
            case 4:
                System.out.println("Thursday," + " to weekend is: " + (6 - day) + " days");
                break;
            case 5:
                System.out.println("Friday," + " to weekend is: only " + (6 - day) + " day");
                break;
            case 6:
                System.out.println("Saturday," + "YEAH today is weekend:)");
                break;
            case 7:
                System.out.println("Sunday," + " today is weekend, yuupi :)");
                break;

        }




    }
}