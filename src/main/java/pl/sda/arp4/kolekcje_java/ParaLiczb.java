package pl.sda.arp4.kolekcje_java;

import java.util.Objects;

/**
 *     Utwórz klasę ParaLiczb, klasa powinna posiadać pole
 *
 *     int a;
 *     int b;
 *     konstruktor pełny
 *     gettery i settery
 *     toString
 *
 *
 */

public class ParaLiczb {

    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParaLiczb paraLiczb = (ParaLiczb) o;
        return a == paraLiczb.a && b == paraLiczb.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

    public ParaLiczb(int a, int b) {
        this.a = a;
        this.b = b;



    }

    @Override
    public String toString() {
        return "ParaLiczb{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
