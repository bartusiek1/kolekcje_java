package pl.sda.arp4.kolekcje_java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *     Stwórz Main'a (MainSetSlowa) użytkownik ma wpisać jedną linię tekstu ze scannera:
 *
 *     wczytaj linię tekstu
 *     podziel linię na słowa
 *     wypisz unikalne słowa wpisane przez użytkownika
 *     wypisz unikalne litery wpisane przez użytkownika
 */

public class MainSetSlowa {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wpisz linię tekstu");
        String tekst = scanner.nextLine();

        System.out.println(tekst);

        String tekstBezPrzecinkow = tekst.replaceAll(",", "");
        String tekstBezPrzecikowIKropek = tekstBezPrzecinkow.replaceAll(".", "");

        String[] tablicaSlow = tekstBezPrzecikowIKropek.split(" ");
        Set<String> zbiorSlow = new HashSet<>(Arrays.asList(tekstBezPrzecikowIKropek));
        System.out.println(zbiorSlow);




    }
}
