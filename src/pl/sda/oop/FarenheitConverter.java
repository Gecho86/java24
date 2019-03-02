package pl.sda.oop;

/*
lesson 1
Date 23.02.2019
7. W osobnej klasie FahrenheitConverter, w metodzie main() napisz program przekształcający dane o temperaturze
        podanej w skali Fahrenheit do skali Celsjusza. Dane wejściowe (temperatura w skali Fahrenheit) podać w inicjacji
        odpowiedniej zmiennej w programie. Sprawdź czy program poprawnie oblicza temperatury dla danych:
        32 °F = 0 °C; 212 °F = 100 °C

Lesson 2
Date 24.02.2019
2. Przenieś kod zapisany w metodach main() klas FahrenheitConverter i ComputerPrice do osobnych metod, np.:
convertToCelsius(double temperatureInFahrenheit), getComputerPrice()
3. W klasie FahrenheitConverter dodaj metodę, która konwertuje temperatury w drugą stronę (Celsjusz →
Fahrenheit)
 */

public class FarenheitConverter {
    public static void main(String[] args) {

        System.out.println(">> Task 7");

        double fahrenheit_1 = 212;
        System.out.println(fahrenheit_1 + " deg F  = " + fahrenheitToCelcius(fahrenheit_1) + " deg C");

        double fahrenheit_2 = 32;
        System.out.println(fahrenheit_2 + " deg F  = " + fahrenheitToCelcius(fahrenheit_2) + " deg C");

        double celcius_1 = 100;
        System.out.println(celcius_1 + " deg C  = " + celciusToFahrenheit(celcius_1) + " deg F");

        double celcius_2 = 0;
        System.out.println(celcius_2 + " deg C  = " + celciusToFahrenheit(celcius_2) + " deg F");
    }

            private static double fahrenheitToCelcius (double fahrenheit){
                return (fahrenheit - 32) / 1.8;
            }
            private static double celciusToFahrenheit (double celcius){
                return ((celcius * 1.8) + 32);
            }

}