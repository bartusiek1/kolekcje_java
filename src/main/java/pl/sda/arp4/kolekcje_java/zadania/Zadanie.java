package pl.sda.arp4.kolekcje_java.zadania;

import java.time.LocalDateTime;

public class Zadanie {

    private String nazwa;
    private String tresc;
    private LocalDateTime czasDodania;
    private boolean wykonane;

    public Zadanie(String nazwa, String tresc) {
        this.nazwa = nazwa;
        this.tresc = tresc;
        this.czasDodania = LocalDateTime.now();
        this.wykonane = false;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getTresc() {
        return tresc;
    }

    public void setTresc(String tresc) {
        this.tresc = tresc;
    }

    public LocalDateTime getCzasDodania() {
        return czasDodania;
    }

    public void setCzasDodania(LocalDateTime czasDodania) {
        this.czasDodania = czasDodania;
    }

    public boolean isWykonane() {
        return wykonane;
    }

    public void setWykonane(boolean wykonane) {
        this.wykonane = wykonane;
    }

    @Override
    public String toString() {
        return "Zadanie{" +
                "nazwa='" + nazwa + '\'' +
                ", tresc='" + tresc + '\'' +
                ", czasDodania=" + czasDodania +
                '}';
    }
}
