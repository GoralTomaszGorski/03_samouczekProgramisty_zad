import  java.awt.*;
import java.util.ArrayList;

public class Lekcja19 {
    public static void main(String[] args){
        Animal kot1 = new Animal("Rudy" );
        Animal kot2 = new Animal("Bialy" );
        Animal kot3 = new Animal("Graniasty" );
        System.out.println(kot1);


        ArrayList lista = new ArrayList();
        lista.add(kot1);
        lista.add(kot2);
        lista.add(kot3);

        System.out.println("------------");
        for (Object k : lista){
            System.out.println(((Animal)k).imie);
        }
        System.out.println("------------");
        System.out.println(((Animal)lista.get(0)).imie);
        System.out.println(((Animal)lista.get(1)).imie);
        System.out.println(((Animal)lista.get(2)).imie);
        System.out.println(lista.size());
        System.out.println(lista.contains(3));

        lista.remove(kot2);
        System.out.println("------------");
        for (Object k : lista) {
            System.out.println(((Animal) k).imie);
        }
        lista.remove(0);
        System.out.println("------------");
        for (Object k : lista) {
            System.out.println(((Animal) k).imie);
            System.out.println(lista.size());

        }        lista.clear();
        System.out.println("------------");
        for (Object k : lista) {
            System.out.println(((Animal) k).imie);
            System.out.println(lista.size());

        }

    }

}
