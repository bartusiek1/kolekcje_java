package pl.sda.arp4.kolekcje_java.pozostałe;

import org.testng.Assert;
import org.testng.annotations.Test;

public class KalkulatorTest {
    public boolean czyDziala(int a, int b, int expectedResult) {
        // preparation
        Kalkulator obiektTestowany = new Kalkulator();

        // act / działanie
        // dla pewnych danych wejściowych
        // powinniśmy otrzymać pewne dane wyjściowe => wynik
        int result = obiektTestowany.dodaj(a, b);

        // weryfikacja
        return result == expectedResult;
//        if (result == expectedResult){
//            return true;
//        }else{
//            return false;
//        }
    }

    @Test
    public void test_dodaj_2_2() {
        // preparation
        Kalkulator obiektTestowany = new Kalkulator();

        // act / działanie
        int result = obiektTestowany.dodaj(5, 2);

        // weryfikacja / assertion
        Assert.assertEquals(7, result);
    }

    @Test
    public void test_dodaj_maxInt_2() {
        // preparation
        Kalkulator obiektTestowany = new Kalkulator();

        // act / działanie
        int result = obiektTestowany.dodaj(2147483647, 2);

        // weryfikacja / assertion
        Assert.assertEquals(-2147483647, result);
    }
}

