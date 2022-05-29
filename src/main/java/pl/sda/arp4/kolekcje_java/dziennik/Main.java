package pl.sda.arp4.kolekcje_java.dziennik;

import java.util.List;
import java.util.Optional;

/**
 * Zadanie Dziennik Elektroniczny
 * Aplikacja ma pozwalać dodawać, usuwać (zarządzać) zbiorem studentów
 * Dla każdego obiektu Student dodanego wcześniej do dziennika powinna istnieć możliwość zarządzania jego ocenami
 * (dodawać i usuwać)
 *
 * Stwórz aplikację, a w niej klasę Dziennik i student .
 * Stwórz również klasę Student.


public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.
    **/

public class Main {
    public static void main(String[] args) {
        Dziennik dziennik = new Dziennik();

        dziennik.dodajStudenta("123123", "John", "Rambo");

        dziennik.wypiszListeStudentow();

        dziennik.usunStudenta("66698745");
        dziennik.usunStudenta("123123");

        Optional<Student> optionalStudent = dziennik.zwrocStudenta("888888");
        if (optionalStudent.isPresent()) {
            Student student = optionalStudent.get();
            System.out.println("Imie i naziwsko: " + student.getImie() + " " + student.getNazwisko());
        } else {
            System.out.println("Funkcja nie zwróćiła studenta");
        }

        // Pełne wykorzystanie dziennika
        dziennik.dodajStudenta("99999998", "Paweł", "Ziom");
        dziennik.dodajOCene("99999998", 5.0);
        dziennik.dodajOCene("99999998", 4.0);

        Optional<Double> optionalSrednia = dziennik.podajSredniaStudenta( "99999998");
        if (optionalSrednia.isPresent()) {
            Double sredniaStudenta = optionalSrednia.get();
            System.out.println("Zwrócona średnia to: " + sredniaStudenta);
        } else {
            System.err.println("Funkcja nie zeróciła średniej");
        }

        List<Student> listaZagrozonych = dziennik.podajStudentowZagrozonych();
        System.out.println("Lista zagrożonych: " + listaZagrozonych);
    }
}