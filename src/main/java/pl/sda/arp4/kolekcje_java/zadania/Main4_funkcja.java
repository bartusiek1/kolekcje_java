package pl.sda.arp4.kolekcje_java.zadania;

import java.util.Scanner;

public class Main4_funkcja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj literę: ");
        String slowo = scanner.next();

        boolean wynik = sprawdzCzyWprowadzoneSlowoJestNumeremMiejsca(slowo);
        if(wynik) {
            System.out.println("Wprowadzone dane (wejście) są poprawne");
        }else{
            System.out.println("Wprowadzone dane (wejście) są niepoprawne");
        }
    }

    private static boolean sprawdzCzyWprowadzoneSlowoJestNumeremMiejsca(String slowo) {
        if (slowo.length() > 1 && slowo.length() < 4) {
            char znak = slowo.charAt(0);

            if (znak >= 'A' && znak <= 'F') {
                System.out.println("Litera jest ok!");

                String wszystkoPozaPierwszymZnakiem = slowo.substring(1);
                try {
                    int liczba = Integer.parseInt(wszystkoPozaPierwszymZnakiem);
                    System.out.println("Wszystko poza pierwszym znakiem jest cyfrą!");

                    return true; // nie został rzucony wyjątek, wszystkie if'y zostały spełnione
                } catch (NumberFormatException nfe) {
                    System.out.println("Wszystko poza pierwszym znakiem nie jest cyfrą!");
                }
            } else {
                System.out.println("Litera nie jest ok!");
            }
        }
        return false;
    }
}

