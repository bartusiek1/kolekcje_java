package pl.sda.arp4.kolekcje_java.zadanieDomowe28_05;

public class Produkt {
    private String nazwa;
    private double cena;
    private int ilosc;
    private String kodProduktu;

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Double getCena() {
        return cena;
    }

    public double setCena(Double cena) {
        this.cena = cena;
        return cena;
    }

    public int getiloscu() {
        return ilosc;
    }

    public void setilosc(int iloscu) {
        this.ilosc = ilosc;
    }

    public String getKodProduktu() {
        return kodProduktu;
    }

    public void setKodProduktu(String kodProduktu) {
        this.kodProduktu = kodProduktu;
    }

    public Produkt(String nazwa, Double cena, int stanMagazynu, String kodProduktu) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.ilosc = stanMagazynu;
        this.kodProduktu = kodProduktu;


    }

    @Override
    public String toString() {
        return "Produkt{" +
                "nazwa='" + nazwa + '\'' +
                ", cena='" + cena + '\'' +
                ", stanMagazynu=" + ilosc +
                ", kodProduktu='" + kodProduktu + '\'' +
                '}';
    }

    public Integer getilosc() {
    return ilosc;
    }
}
