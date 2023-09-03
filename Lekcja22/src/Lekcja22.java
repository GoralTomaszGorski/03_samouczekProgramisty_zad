import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Lekcja22 {

    public static void main (String[] args) {
        Queue<String> kolejka = new ArrayDeque<>(); //kolekcja kolejka jak cos usuwamy to uswua pierwszy element

        kolejka.add("pierwszy");
        kolejka.add("drugi");
        kolejka.add("trzeci");
        kolejka.add("czwarty");
        kolejka.add("piaty");

        System.out.println();
        System.out.println(kolejka.size());
        System.out.println(kolejka.peek()); //peek podlagladanie aktualnego elemenetu
        System.out.println(kolejka.remove());
        System.out.println(kolejka.remove());
        System.out.println(kolejka.remove());
        System.out.println(kolejka.poll()); //pull wypchniecie z kolejki
        System.out.println(kolejka.poll());
        System.out.println(kolejka.poll());
        System.out.println(kolejka.size()); //size rozmiar kolekcji w tym przypadku kolejki

        System.out.println(kolejka);


        Stack<String> stos = new Stack<>(); //stos to cos takiego jak kolejka tylko ze nie dodaje elementu na koniec tylko na poczatek
        System.out.println("\n\nStos"); //\n eneter
        stos.push("S1"); //push wypchniecie z kolejki
        stos.push("S2");
        stos.push("S3");
        stos.push("S4");
        stos.push("S5");
        stos.push("S6");
        System.out.println(stos.size());
        System.out.println(stos.pop()); //pop wypchniecie ze strosu
        System.out.println(stos.pop());
        System.out.println(stos.pop());
        System.out.println(stos.pop());
        System.out.println(stos);


    }
}
