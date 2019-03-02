package pl.sda.statements;

public class Statements {
    public static void main(String[] args) {

//      1. Napisz program, który wypisze na ekran konsoli, czy dana liczba całkowita znajduje się w przedziale 1-10, 11-100, 101-1000,
//      1001-10000, czy też może jest mniejsza od 0 lub większa od 10000. Parametrem wejściowym niech będzie zmienna zainicjowana na początku programu.

        int x = 10000;

        if (x < 0) {
            System.out.println("Number " + x + " is smaller than 0");
        }
        if (x >= 1 && x <= 10) {
            System.out.println("Number x " + x + " is in the range 1-10");
        }
        if (x >= 11 && x <= 100) {
            System.out.println("Number x " + x + " is in the range 10-100");
        }
        if (x >= 101 && x <= 1000) {
            System.out.println("Number x " + x + " is in the range 100-1000");
        }
        if (x >= 1001 && x <= 10_000) {
            System.out.println("Number x " + x + " is in the range 1000-10000");
        }
        if (x >= 10_001)
            System.out.println("Number x " + x + " is greater than 10000");

        int y = 1;

        if (y < 0)
            System.out.println("Number y " + y + " is smaller than 0");
        else if (y <= 10)
            System.out.println("Number y " + y + " is in the range 1-10");
        else if (y <= 100)
            System.out.println("Number y " + y + " is in the range 1-100");
        else if (y <= 1000)
            System.out.println("Number y " + y + " is in the range 1-1000");
        else if (y <= 10_000)
            System.out.println("Number y " + x + " is in the range 1-10 000");
        else
            System.out.println("Number y " + y + " is greater than 10 000");

//        2. Napisz program, który wypisze na ekran konsoli, słowo oznaczające ocenę dla podanej cyfry. Np. dla 1 - "niedostateczny",
//        2 - "mierny" itp. Obsłuż przypadek gdy cyfra jest poza skalą ocen.

        int ocena = 7;
        switch (ocena) {
            case 1:
                System.out.println("Dostałeś: " + ocena + " To jest PAŁA! Siadaj!");
                break;
            case 2:
                System.out.println("Dostałeś: " + ocena + " Udało Ci się fuksiarzu, Mierny! Siadaj!");
                break;
            case 3:
                System.out.println("Dostałeś: " + ocena + " Jak zwykle, Dostateczny! Siadaj!");
                break;
            case 4:
                System.out.println("Dostałeś: " + ocena + " Dobry, ale stac Ciebie na wiecej! Siadaj!");
                break;
            case 5:
                System.out.println("Dostałeś: " + ocena + " Nieźle, Bardzo dobry! Siadaj!");
                break;
            case 6:
                System.out.println("Dostałeś: " + ocena + " Brawo! Celujący! Siadaj!");
                break;
            default:
                System.out.println("Coś poszło nie tak");
        }
    }
}