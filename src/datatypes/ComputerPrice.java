package datatypes;

/*
test GIT
Lesson 2
date 24.02.2019

2. Przenieś kod zapisany w metodach main() klas FahrenheitConverter i ComputerPrice do osobnych metod, np.:
convertToCelsius(double temperatureInFahrenheit), getComputerPrice()

4. W klasie ComputerPrice wydziel metody getComputerPrice(), getMonitorPrice() i getComputerAndMonitorPrice(),
ostatnia z metod ma korzystać z dwóch pierwszych. Zmienną VAT ustaw jako pole klasy ComputerPrice

*/

public class ComputerPrice {

    private double priceMainBoard;
    private double priceProcessor;
    private double priceRam;
    private double priceHardDisk;

    private double priceMonitor;
    private double priceMonitorVat;
    private double priceComputer;
    private double priceComputerVat;

    public double getPriceMainBoard() {
        return priceMainBoard;
    }

    public void setPriceMainBoard(double priceMainBoard) {
        this.priceMainBoard = priceMainBoard;
    }

    public double getPriceProcessor() {
        return priceProcessor;
    }

    public void setPriceProcessor(double priceProcessor) {
        this.priceProcessor = priceProcessor;
    }

    public double getPriceRam() {
        return priceRam;
    }

    public void setPriceRam(double priceRam) {
        this.priceRam = priceRam;
    }

    public double getPriceHardDisk() {
        return priceHardDisk;
    }

    public void setPriceHardDisk(double priceHardDisk) {
        this.priceHardDisk = priceHardDisk;
    }

    public double getPriceMonitor() {
        return priceMonitor;
    }

    public void setPriceMonitor(double priceMonitor) {
        this.priceMonitor = priceMonitor;
    }

    public double getPriceComputer() {
        return priceMainBoard + priceHardDisk + priceProcessor + priceRam;
    }

    public double getPriceComputerAndMonitor() {
        return priceComputer + priceMonitor;
    }

    public double getPriceComputerVat() {
        return (getPriceComputer()*0.23);
    }

    public double getPriceMonitorVat() {
        return (getPriceMonitor()*0.23);
    }
}


