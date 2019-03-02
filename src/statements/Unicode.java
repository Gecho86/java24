package Statements;



public class Unicode {
    public static void main(String[] args) {

//        Zadanie 4. Napisz program, który wypisze na ekran konsoli czy podany kod Unicode jest liczbą (0-9), małą literą (a-z) czy też dużą literą (A-Z).
//        Kody każdej z grup znaków następują po sobie więc wystarczy znaleźć kod np. dla litery 'a' i 'z' i sprawdzić czy podany kod zawiera się w tym przedziale.


        char uni = 'z';
        int code = uni;
       /*code = 77;
       uni = (char) code;*/


        if ( uni>= 48 && uni <= 57)
            System.out.println("Unicode " + code + " is a number: " + uni);
        else if ( uni >= 97 && uni <= 122)
            System.out.println("Unicode "  + code + " is a small letter: " + uni);
        else if ( uni >= 65 && uni <=90)
            System.out.println("Unicode " + code + " a capital letter: " + uni);
        else
            System.out.println("ERROR - " + " Please enter: NUMBER (0-9), SMALL LETTER (a-z) or CAPITAL LETTER (A-Z)");

        /*char c2 = 'a';
        int code = c2;
        System.out.println("Code for " + c2 + " = " + code);
        code = 77;
        c2 = (char) code;
        System.out.println("Code for " + c2 + " = " + code);*/

        /*//czasem trzeba użyć jawnej konwersji rozszerzającej
        System.out.println("Code for " + '*' + " = " + (int) '*');
        //oczywiście - zawężające trzeba zawsze podać jawnie
        System.out.println("Code for " + (char) 66 + " = " + 66);*/
    }
}