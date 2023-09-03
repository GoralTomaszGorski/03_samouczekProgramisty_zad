import java.util.Scanner;

public class Firma {
    public static void main(String [] args){

        Pracownik p1 = new Pracownik();

        Scanner sc = new Scanner(System.in);

        System.out.println("podaj imie: ");
        p1.imie = sc.nextLine();
        System.out.println("podaj Nazwisko: ");
        p1.nazwisko = sc.nextLine();
        System.out.println("podaj wiek: ");
        p1.wiek = sc.nextInt();

        System.out.println(p1.imie + " "+ p1.nazwisko + " lat: "+ p1.wiek);

    }

}
