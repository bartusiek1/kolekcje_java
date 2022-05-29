package pl.sda.arp4.kolekcje_java.zadania.university;

public class MainUnivesrity {
    public static void main(String[] args) {
        University university = new University();
        university.dodaj(123213L, "Pawel", "Gawel");
        university.dodaj(123214L, "Gaweł", "Paweł");
        university.dodaj(123215L, "Marian", "Nowak");
        university.dodaj(100200L, "Mirek", "Kowalski");

        boolean czyZawiera = university.czyZawieraStudenta(100200L);
        if (czyZawiera) {
            System.out.println("Zaweira studenta");
        } else {
            System.err.println("Nie zawiera studenta");
        }

        System.out.println("Student 100200: " + university.zwrocStudenta(100200));

        System.out.println("Ilość studentów: " + university.podajIloscStudentow());

        university.wypiszWszystkichStudentow();
        university.wypiszWszystkieNumeryIndeksow();
    }
}
