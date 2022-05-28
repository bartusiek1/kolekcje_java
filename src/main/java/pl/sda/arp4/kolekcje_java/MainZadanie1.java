package pl.sda.arp4.kolekcje_java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * (MainZbioryZad1) Umieść wszystkie elementy tablicy {10,12,10,3,4,12,12,300,12,40,55} w zbiorze (HashSet) oraz:
 *     Wypisz liczbę elementów na ekran (metoda size())
 *     Wypisz wszystkie zbioru elementy na ekran (forEach)
 *     Usuń elementy 10 i 12, wykonaj ponownie podpunkty a) i b)
 *     Skopiuj plik wraz z implementacją i w drugiej kopii (MainZbioryZad1_2) zmień implementacje na TreeSet
 *     (zamień HashSet na TreeSet przy tworzeniu instancji kolekcji)
 *
 */

public class MainZadanie1 {
    public static void main(String[] args) {

        Set<Integer> liczby = new HashSet<>(Arrays.asList(10,12,10,3,4,12,12,300,12,40,55));
        // drugie rozwiązanie
        // Set<Integer> liczby = new HAshSet<>(Set.of(10,12,10,3,4,12,12,300,12,40,55));

        System.out.println("Rozmiar: " + liczby.size());

        for (Integer element : liczby) {
            System.out.println("Element: " + element);
        }

        liczby.remove(10);
        liczby.remove(12);

        System.out.println("Rozmiar: " + liczby.size());
        for (Integer element : liczby) {
            System.out.println("Element: " + element);
        }

    }
}
