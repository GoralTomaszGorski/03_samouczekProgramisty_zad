import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Lekcja20 {
    public static void main(String[] args){
        LinkedList<String> lista = new LinkedList<>(); //linked list pozwala na duplikownanie
        lista.add("Kot");
        lista.add("Kot");
        lista.add("Kot");
        lista.add("Kot");
        lista.add("pies");
        lista.add("gęś");
        lista.add("kura");
        lista.add("kuna");
        for (String e : lista) { //pętla obiektowa
            System.out.println(e);
        }
        lista.remove(0);
        System.out.println();
        for (String e : lista) {
            System.out.println(e);
        }
        lista.clear();
        System.out.println();
        for (String e : lista) {
            System.out.println(e);
            lista.size();
        }

        HashMap<Integer, String> mapa = new HashMap<>();
        mapa.put(1,"Adam");
        mapa.put(2, "Barbara");
        mapa.put(3, "Barbara");
        mapa.put(4, "Barbara");
        mapa.put(5, "Ula");
        mapa.put(6, "Bartek");
        System.out.println();
        for (String e : mapa.values()) {
            System.out.println(e);

        }
        System.out.println(mapa.size()) ;
        mapa.size();
        mapa.remove(1);

        System.out.println();
        System.out.println();
        System.out.println(mapa.get(5));
        System.out.println(mapa.get(4));
        System.out.println(mapa.get(3));
        System.out.println(mapa.get(2));


        System.out.println();
        System.out.println();
        HashSet<String> zbior = new HashSet<>(); //przy HashSet nie ma toleracnji dla duplikatow
        zbior.add("dom");
        zbior.add("mieszkanie");
        zbior.add("jacht");
        zbior.add("jacht");
        zbior.add("jacht");
        zbior.add("jacht");
        zbior.add("jacht");
        zbior.add("lesniczowka");
        zbior.add("zmaek");
        zbior.add("mieszkanie");
                for (String e : zbior){
                    System.out.println(e);
                }
        System.out.println(zbior.size()) ;
    }
}
