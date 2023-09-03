import java.util.Random;
import java.util.Scanner;

public class Lekcja8 {
    public static void main(String[] args) {
        int i = 0;
        int los;
        int odp;

        Random rnd = new Random();
        los = rnd.nextInt(10) + 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("zgadnij liczbę od 1 do 10");
        do {
            i++;
            System.out.println("podaj liczbę: ");
            odp = scanner.nextInt();
            if (odp > los) {
                System.out.println("Niestety nie zgadłeś:( Moja liczba jest mniejsza");
            } else if (odp < los) {
                System.out.println("Niestety nie zgadłeś:( Moja liczba jest wieksza");
            }
        } while (odp != los);
        System.out.println("brawo! ogadłeś za " + i + " razem");

    }

}
