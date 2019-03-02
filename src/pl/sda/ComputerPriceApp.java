package pl.sda;

/*
Lesson 1
date 23.02.2019

        W osobnej klasie ComputerPriceApp, w metodzie main() napisz program obliczający cenę komputera na podstawie jego
        części. Program ma wypisać na konsolę osobno cenę samego komputera: płyta główna, procesor, pamięć RAM,
        dysk twardy i osobno cenę komputera i monitora. W cenie należy uwzględnić podatek VAT = 23%.
        
*/

public class ComputerPriceApp {
    public static void main(String[] args) {

        System.out.println(">>Task 8");

        ComputerPrice cP = new ComputerPrice();

        cP.setPriceHardDisk(250);
        cP.setPriceMainBoard(150);
        cP.setPriceProcessor(120);
        cP.setPriceRam(90);
        cP.setPriceMonitor(400);

        System.out.println("Hard Disk price is " + cP.getPriceHardDisk() + " zł");
        System.out.println("Mainboard price is " + cP.getPriceMainBoard() + " zł");
        System.out.println("Processor is " + cP.getPriceProcessor() + " zł");
        System.out.println("Ram Price is " + cP.getPriceRam() + " zł");
        System.out.println("Monitor Price is " + cP.getPriceMonitor() + " zł");

        System.out.println("\nComputer price [net] is " + cP.getPriceComputer()+ " zł");
        System.out.println("Computer and monitor price [net] is " + (cP.getPriceComputer()+ cP.getPriceMonitor() + " zł"));
        System.out.println("\nComputer and monitor price [brutto] is " + (cP.getPriceComputer() + cP.getPriceComputerVat() + " zł"));
        System.out.println("Computer and monitor price [brutto] is " + (cP.getPriceComputer() + cP.getPriceMonitor()+ cP.getPriceComputerVat()+ cP.getPriceMonitorVat() + " zł"));
    }
}
