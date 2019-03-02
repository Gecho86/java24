package datatypes;

/*
Lesson 1
Date 23.02.2019

1. Napisz program, który utworzy dwie zmienne, a następnie wypisze na ekran ich sumę, różnicę i iloczyn.
2. Napisz program, który tworzy jedną zmienną, a następnie wypisze na ekran jej wartość podniesioną do 3 potęgi.
3. Napisz program, który utworzy jedną zmienną, a następnie wypisze na ekran tekst: true jeżeli wartość tej zmiennej
jest liczbą parzystą lub false w przeciwnym przypadku.
4. Napisz program, który utworzy jedną zmienną, a następnie wypisze na ekran tekst: true jeżeli wartość tej zmiennej
jest podzielna przez 3 i jednocześnie przez 5 lub false w przeciwnym przypadku.
5. Wyświetl na ekranie pięć pierwszych liter alfabetu: łacińskiego (zaczyna się od kodu: 65), hebrajskiego (zaczyna się
od: 1488) i tybetańskiego (zaczyna się od: 3840)
6. Wyświetl na ekranie w jednej linijce znaki (char) dla kodów: 74, 65, 86, 65, 32, 8658, 32, 9786
 */


public class DataTypes {
    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        int c = 8;
        System.out.println("\n>> Task 1");

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));

        System.out.println("\n>> Task 2");

        int d = 2;
        int d_1 = 3;
        double triple_3 = Math.pow(d, d_1);
        System.out.println("d power of 3 = " + (triple_3));

        System.out.println("\n>> Task 3");

        int e = 131;
        if ((e % 2) == 0)
            System.out.println(e + " is even number");
        else
            System.out.println(e + " is odd number");

        System.out.println("\n>> Task 4");

        int f = 15;
        if ((f % 2) == 0 && (f % 5) == 0)
            System.out.println(f + " is divisible by 3 and 5"); // sprawdź co jest nie tak
        else
            System.out.println(f + " isn't divisible by 3 and 5");

        System.out.println("\n>> Task 5");

        char g = 65;
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + " number of Latin alphabet " + (char)(g + i));
        }

        char h = 1488;
        for (int i = 0; i < 5; i++) {
            System.out.println((h + 1) + " number of Hebrew alphabet " + (char)(h + i));
        }

        char j = 3840;
        for (int i = 0; i < 5; i++) {
            System.out.println((j + 1) + " number of Tibetian alphabet " + (char)(j + i));
        }

        System.out.println("\n>> Task 6_1");
        char h1 = 74, h2 = 65, h3 = 86, h4 = 65, h5 = 32, h6 = 8658, h7 = 32, h8 = 9786;
        System.out.println( h1 + "," + h2 + "," + h3 + ","+ h4 + ","+ h5 + ","+ h6 + ","+ h7 + ","+ h8 );

        System.out.println("\n>> Task 6_2");

        char[] hArray = {74, 65, 86, 65, 32, 8658, 32, 9786};
        for (int i = 0; i < 8; i++){
            System.out.println(hArray[i] + ", "); // sprawdz jak wyswietlic tablice w poziomie
        }
    }
}