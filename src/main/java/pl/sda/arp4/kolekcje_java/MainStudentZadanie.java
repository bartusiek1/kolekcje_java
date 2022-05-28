package pl.sda.arp4.kolekcje_java;

import java.util.HashMap;
import java.util.Map;

public class MainStudentZadanie {
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

    }
}

