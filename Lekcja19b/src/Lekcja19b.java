import  java.awt.*;
import java.util.ArrayList;

public class Lekcja19b {
    public static void main(String[] args){
        Animal kot1 = new Animal("Rudy" );
        Animal kot2 = new Animal("Bialy" );
        Animal kot3 = new Animal("Graniasty" );

        ArrayList lista = new ArrayList();
        ArrayList <Animal> ListaGeneryczna = new ArrayList<Animal>();
        lista.add(kot1);
        lista.add(kot2);
        lista.add(kot3);

        ListaGeneryczna.add(kot1);
        ListaGeneryczna.add(kot2);
        ListaGeneryczna.add(kot3);

        System.out.println("------------");
        for (Animal k : ListaGeneryczna){
            System.out.println(k.imie);
        }
        System.out.println("------------");
        System.out.println(ListaGeneryczna.get(0).imie);
        System.out.println(((Animal)lista.get(0)).imie);
        System.out.println((ListaGeneryczna.get(1)).imie);
        System.out.println((ListaGeneryczna.get(2)).imie);
        System.out.println(ListaGeneryczna.size());
        System.out.println(ListaGeneryczna.contains(3));

        ListaGeneryczna.remove(kot2);
        System.out.println("------------");
        for (Animal k : ListaGeneryczna) {
            System.out.println(k.imie);
        }
        ListaGeneryczna.remove(0);
        System.out.println("------------");
        for (Animal k : ListaGeneryczna) {
            System.out.println(k.imie);
            System.out.println(ListaGeneryczna.size());

        }        ListaGeneryczna.clear();
        System.out.println("------------");
        for (Animal k : ListaGeneryczna) {
            System.out.println(k.imie);
            System.out.println(ListaGeneryczna.size());

        }

    }

}
