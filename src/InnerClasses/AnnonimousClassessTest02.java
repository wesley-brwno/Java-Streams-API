package InnerClasses;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnnonimousClassessTest02 {
    public static void main(String[] args) {
        List<Barco> barcoList = new ArrayList<>(List.of(
                new Barco("Lancha"),
                new Barco("Canoa"),
                new Barco("Kayak")
        ));

        barcoList.sort(new Comparator<Barco>() {
            @Override
            public int compare(Barco o1, Barco o2) {
                return o1.nome().compareTo(o2.nome());
            }
        });

        System.out.println(barcoList);
    }
}

record Barco(String nome) {
}

class BarcoComparator implements Comparator<Barco> {
    @Override
    public int compare(Barco o1, Barco o2) {
        return o1.nome().compareTo(o2.nome());
    }
}