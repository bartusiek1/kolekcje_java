package pl.sda.arp4.kolekcje_java.zadania.university;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class University {
    Map<Long, Student> student = new HashMap<>();

    public void dodaj(long indeks, String imie, String nazwisko) {
        Student nowoStworzonyStudentDoDodania = new Student (indeks, imie, nazwisko);
        student.put(indeks, nowoStworzonyStudentDoDodania);
    }

    public boolean czyZawieraStudenta(long szukanyIndeks) {
        return student.containsKey(szukanyIndeks);
    }

    public Student zwrocStudenta (long indeks) {
        return student.get(indeks);
    }

    public Optional<Student> zwrocStudentaOptional (long indeks) {
        if (student.containsKey(indeks)) {
            return Optional.of(student.get(indeks));
        } else {
            return Optional.empty();

        }
    }

    public int podajIloscStudentow() {
        return student.size();
    }

    public void wypiszWszystkichStudentow() {
        System.out.println("Lista studentow: ");
        for (Student studenci : student.values()) {
            System.out.println(studenci);
        }
    }

    public void wypiszWszystkieNumeryIndeksow() {
        System.out.println("Lista indeksów: ");
        for (Long numerIndeksu : student.keySet()) {
            System.out.println(numerIndeksu);

        }
    }

}
