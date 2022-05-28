package pl.sda.arp4.kolekcje_java;

import java.util.HashSet;
import java.util.Set;

public class MainSet {
    public static void main(String[] args) {
        // List<x>
        //Map<K,V>
        // Set<x>

        // worek elementów, od listy różni się tym, że tu nie są przypisane do nich żadne numery porządkowe czy kolejność

        Set<String> zbior = new HashSet<>();

        zbior.add("Polska");
        zbior.add("Czechy");
        zbior.add("Ukraina");
        zbior.add("Niemcy");
        zbior.add("Francja");
        zbior.add("Polska");
        zbior.add("Czechy");
        zbior.add("Ukraina");
        zbior.add("Polska");
        zbior.add("Czechy");

        // usuwa zduplikowane elementy
        // wyrzuca w losowej kolejności
        // nie ma możliwości pobrania wybranego elementu - bo nie mają kolejności i nie są numerowane
        // -> dlatego nie ma pętli for i

        System.out.println(zbior);
    }
}
