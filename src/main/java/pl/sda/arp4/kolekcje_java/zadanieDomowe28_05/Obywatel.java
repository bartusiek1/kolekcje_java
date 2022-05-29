package pl.sda.arp4.kolekcje_java.zadanieDomowe28_05;

import java.util.Objects;

public class Obywatel {
    private String imie;
    private String nazwisko;
    private int pesel;

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getPesel() {
        return pesel;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Obywatel obywatel = (Obywatel) o;
        return pesel == obywatel.pesel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pesel);
    }

    public Obywatel(String imie, String nazwisko, int pesel) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;



    }

    @Override
    public String toString() {
        return "MainObywatelSet{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", pesel=" + pesel +
                '}';
    }
}
