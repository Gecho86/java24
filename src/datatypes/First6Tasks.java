package DataTypes;

public class First6Tasks {
    public static void main(String[] args) {
        // 1. Napisz program, który utworzy dwie zmienne, a następnie wypisze na ekran ich sumę, różnicę i iloczyn.

        int a = 15;
        int b = 7;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);

        // 2. Napisz program, który tworzy jedną zmienną, a następnie wypisze na ekran jej wartość podniesioną do 3 potęgi.

        int c = 25;
        System.out.println(c * c * c);

        // 3. Napisz program, który utworzy jedną zmienną, a następnie wypisze na ekran tekst: true jeżeli wartość tej
        // zmiennej jest liczbą parzystą lub false w przeciwnym przypadku.

        int d = 14;
        System.out.println("isEven: " + (d % 2 == 0));
        System.out.println("isEven: " + (d % 2 != 0));

        // 4. Napisz program, który utworzy jedną zmienną, a następnie wypisze na ekran tekst: true jeżeli wartość tej
        // zmiennej jest podzielna przez 3 i jednocześnie przez 5 lub false w przeciwnym przypadku.

        int e = 45;
        System.out.println(e + " isDivisible: by 3 = " + (e % 3 == 0));
        System.out.println(e + " isDivisible: by 5 = " + (e % 5 == 0));

        // 5. Wyświetl na ekranie pięć pierwszych liter alfabetu: łacińskiego (zaczyna się od kodu: 65), hebrajskiego
        // (zaczyna się od: 1488) i tybetańskiego (zaczyna się od: 3840)

        System.out.println("First five letter from latin alphabet is: " + (char) 65 + (char) 66 + (char) 67 + (char) 68 + (char) 69);

        System.out.println("First five letter from hebrew alphabet is: " + (char) 1488 + (char) 1489 + (char) 1490 + (char) 1490 + (char) 1491);

        System.out.println("First five letter from tibetan alphabet is: " + (char) 3840 + (char) 3841 + (char) 3842 + (char) 3843 + (char) 3844);

        // 6. Wyświetl na ekranie w jednej linijce znaki (char) dla kodów: 74, 65, 86, 65, 32, 8658, 32, 9786

        System.out.println( "The code from char numbers is: " + (char) 74 + (char) 65 + (char) 86 + (char) 65 + (char) 32 + (char) 8658 + (char) 32 + (char) 9786);

    }


}