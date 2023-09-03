import java.util.ArrayList;
import java.util.Collections;

public class Lekcja21 {

    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();
        lista.clear();
        lista.add("AAA");
        lista.add("Krakow");
        lista.add("Kraśnik");
        lista.add("Krasnystaw");
        lista.add("Lublin");
        lista.add("BBB");
        lista.add("Nowe");

        System.out.println();
        for (String e : lista) {
            System.out.println(e);
        }

        Collections.sort(lista);

        System.out.println();
        for (String e : lista) {
            System.out.println(e);
        }
        System.out.println();
        System.out.println("min:");
        System.out.println(Collections.min(lista));

        System.out.println("max:");
        System.out.println(Collections.max(lista));

        System.out.println();
        Collections.reverse(lista);// czyli odwrocenie kolejnocsci
        for (String e : lista) {
            System.out.println(e);
        }

        Collections.shuffle(lista);
        System.out.println();
        for (String e : lista) {
            System.out.println(e);
        }
        ArrayList<Animals> koty = new ArrayList<Animals>();
        Animals kot1 = new Animals("Czarny");
        Animals kot2 = new Animals("Biały");
        Animals kot3 = new Animals("Bury");
        Animals kot4 = new Animals("Bury");
        Animals kot6 = new Animals("Bury");
        Animals kot5 = new Animals("Rudy");
        kot4.wiek = 10;
        kot6.wiek = 11;

        koty.add(kot1);
        koty.add(kot2);
        koty.add(kot3);
        koty.add(kot4);
        koty.add(kot5);
        koty.add(kot6);

        System.out.println();
        for (Animals kot : koty){
            System.out.println(kot.name + " "+ kot.wiek + " lat.");
        }

        System.out.println();
        Collections.sort(koty);
        for (Animals kot : koty){
            System.out.println(kot.name + " "+ kot.wiek + " lat.");
        }
    }
}
