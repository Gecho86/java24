package pl.sda.statements;

public class RomanToArabic {
    public static void main(String[] args) {

//      3. Napisz program, który wypisze na ekran konsoli, cyfrę arabską dla podanej liczby rzymskiej (od 1 do 9). Czyli np.
//      dla 'I' wypisze 1, dla 'V' 5 itp. Obsłuż przypadek gdy podana liczba rzymska jest nieprawidłowa.

        String enterRomanNumber = "I";


        if ( enterRomanNumber == "I")
            System.out.println("Roman number: " + enterRomanNumber  + " in Arabic numeral is " + 1 );
        else if ( enterRomanNumber == "II")
            System.out.println("Roman number: " + enterRomanNumber  + " in Arabic numeral is " + 2 );
        else if ( enterRomanNumber == "III")
            System.out.println("Roman number: " + enterRomanNumber  + " in Arabic numeral is " + 3 );
        else if ( enterRomanNumber == "IV")
            System.out.println("Roman number: " + enterRomanNumber  + " in Arabic numeral is " + 4 );
        else if ( enterRomanNumber == "V")
            System.out.println("Roman number: " + enterRomanNumber  + " in Arabic numeral is " + 5 );
        else if ( enterRomanNumber == "VI")
            System.out.println("Roman number: " + enterRomanNumber  + " in Arabic numeral is " + 6 );
        else if ( enterRomanNumber == "VII")
            System.out.println("Roman number: " + enterRomanNumber  + " in Arabic numeral is " + 7 );
        else if ( enterRomanNumber == "VIII")
            System.out.println("Roman number: " + enterRomanNumber  + " in Arabic numeral is " + 8 );
        else if ( enterRomanNumber == "IX")
            System.out.println("Roman number: " + enterRomanNumber  + " in Arabic numeral is " + 9 );
        else
            System.out.println("Błąd - proszę wpisać Rzymską liczbę od I do IX");
    }




}