import Magazin.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Aliment> alimente = new ArrayList<>();

        alimente.add(new Lapte(2021L, "Lapte", 2.0));
        alimente.add(new Carne(2021L, "Carne", 3.0));
        alimente.add(new Cereale(2021L, "Cereale", 1.0));

        List<Aliment> alimenteSortate = alimente.stream().sorted((a1, a2) -> a1.getCalorii().compareTo(a2.getCalorii())).toList();
        System.out.println(alimenteSortate);
    }
}