package pl.sda.arp4.kolekcje_java.zadania;

import java.util.Scanner;

public class MainWeryfikatorSamolot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj literę: ");
        String slowo = scanner.next();

        WeryfikatorNumeruMiejsca weryfikator = new WeryfikatorNumeruMiejsca(4, 'F');

        boolean wynik = weryfikator.sprawdzCzyWprowadzoneSlowoJestNumeremMiejsca(slowo);
        if(wynik) {
            System.out.println("Wprowadzone dane (wejście) są poprawne");
        }else{
            System.out.println("Wprowadzone dane (wejście) są niepoprawne");
        }
    }


}

