package pl.sda.arp4.kolekcje_java.zadania;

import pl.sda.arp4.kolekcje_java.zadania.university.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj literę: ");
        String slowo = scanner.next();

        if (slowo.length() == 2) {
            char znak = slowo.charAt(0);

            if (znak >= 'A' && znak <= 'F') {
                System.out.println("Litera jest ok!");

                // A3
                // AJaLubiePlacki
                // AJ
                // wytnij pierwszą literę,
                // ze zmiennej 'slowo' wez wszystkie litery zaczynając od indeksu 1
                String wszystkoPozaPierwszymZnakiem = slowo.substring(1);
                try {
                    // scanner -> slowo -> slowo.equals('dodaj')
                    int liczba = Integer.parseInt(wszystkoPozaPierwszymZnakiem);
                    System.out.println("Znak drugi jest cyfrą!");
                } catch (NumberFormatException nfe) {
                    System.out.println("Znak drugi nie jest cyfrą!");
                }
            } else {
                System.out.println("Litera nie jest ok!");
            }
        }
    }

    public static class MainStudentZadanie {
        public static void main(String[] args) {

            Student s1 = new Student(100200, "Marian", "Kmiot");
            Student s2 = new Student(555666444, "Jason", "Deluro");
            Student s3 = new Student(100400, "Tomasz", "Kot");
            Student s4 = new Student(222555666, "Wanda", "Niemiec");

            Map<Long, Student> student = new HashMap<>();

            student.put(100200L, s1);
            student.put(555666444l, s2);
            student.put(100400L, s3);
            student.put(222555666l, s4);

            System.out.println("Rozmiar: " + student.size());
            System.out.println("Student 100200: " + student.get(100200L));
            System.out.println("Contains 100400: " + student.containsKey(100400L));

            System.out.println("Mapa: " + student);
            System.out.println();

            // mapa iteracja:
    // 1. Klucze
            System.out.println("Klucze:");
            for (Long indeks : student.keySet()) {
                System.out.print(indeks + " ");
            }
            System.out.println();

    // 2. Wartości
            System.out.println("Wartości:");
            for (Student Student : student.values()) {
                System.out.print(student + " ");
            }
            System.out.println();

    // 3. Pary Klucz-Wartość - Entry - Wpis/Rekord
            for (Map.Entry<Long, Student> wpis : student.entrySet()) {

            }

        }
    }
}
