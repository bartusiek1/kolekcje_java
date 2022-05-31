package pl.sda.arp4.kolekcje_java.pracaDomowa_29_05;

public class Product {

    private String nazwa;
    private Double ilosc;
    private String jednostka;

    public Product(String nazwa, Double ilosc, String jednostka) {
        this.nazwa = nazwa;
        this.ilosc = ilosc;
        this.jednostka = jednostka;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Double getIlosc() {
        return ilosc;
    }

    public void setIlosc(Double ilosc) {
        this.ilosc = ilosc;
    }

    public String getJednostka() {
        return jednostka;
    }

    public void setJednostka(String jednostka) {
        this.jednostka = jednostka;
    }

    public Product(String nazwa, String jednostka) {
        this.nazwa = nazwa;
        this.jednostka = jednostka;



    }

    @Override
    public String toString() {
        return "Product{" +
                "nazwa='" + nazwa + '\'' +
                ", ilosc=" + ilosc +
                ", jednostka='" + jednostka + '\'' +
                '}';
    }
}
