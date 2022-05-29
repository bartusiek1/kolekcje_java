package pl.sda.arp4.kolekcje_java.zadanieDomowe28_05;

import pl.sda.arp4.kolekcje_java.ParaLiczb;

import java.util.HashSet;
import java.util.Set;

public class MainObywatelSet {
    public static void main(String[] args) {

        Set<Obywatel> zbiorObywateli = new HashSet<>();

        zbiorObywateli.add(new Obywatel ("Jan", "Kowalski",1231234));
        zbiorObywateli.add(new Obywatel ("Marian", "Nowak",3213214));
        zbiorObywateli.add(new Obywatel ("Olek", "Bolek",3331115));
        zbiorObywateli.add(new Obywatel ("Marian", "Roztocki",1231234));

        System.out.println(zbiorObywateli.size());

    }
}
