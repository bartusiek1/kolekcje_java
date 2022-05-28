package pl.sda.arp4.kolekcje_java;

import java.util.HashSet;
import java.util.Set;

/**
 * Stwórz Main a w nim kilka instancji klasy ParaLiczb: {(1,2), (2,1), (1,1), (1,2)}.
 *  *
 *  *     Wyświetl wszystkie elementy zbioru na ekran. Czy program działa zgodnie z oczekiwaniem?
 */

public class MainParaLiczb {
    public static void main(String[] args) {

        ParaLiczb p1 = new ParaLiczb(1, 2);
        ParaLiczb p2 = new ParaLiczb(2, 1);
        ParaLiczb p3 = new ParaLiczb(1, 1);
        ParaLiczb p4 = new ParaLiczb(1, 2);

        Set<ParaLiczb> zbiorParaLiczb = new HashSet<>();
        zbiorParaLiczb.add(p1);
        zbiorParaLiczb.add(p2);
        zbiorParaLiczb.add(p3);
        zbiorParaLiczb.add(p4);

        System.out.println("Ilość: " + zbiorParaLiczb.size());

        // String:
        // ==       <- porównuje referencje (miejsce w pamięci)
        // .equals  <- porównuje treść obiektu w środku

        // ParaLiczb:
        // ==       <- porównuje referencje (miejsce w pamięci)
        // .equals  <- porównuje referencje (miejsce w pamięci)
        // jeśli nadpiszemy metodę 'equals' to:
        // .equals  <- porównuje treść obiektu w środku
    }
}
