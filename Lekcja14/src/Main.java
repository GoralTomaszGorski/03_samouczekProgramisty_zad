public class Main { // w jednym pliku tylko jedna klasa druga klasa w oddzilenym pliku bedzie sie do niego odnosic

    //!!metody to inaczej zmienne to inaczej atrybuty
    //!!funkcje to inaczej metody
    public static void main(String[] args){
        Zwierzaki kot = new Zwierzaki();
        kot.wiek = 2;
        kot.imie = "Bambi";
        kot.głos = "Miaaaał";
        kot.przedstawSie();
        kot.dajGlos(3);
        kot.podajWiek();
        System.out.println( );

        Zwierzaki pies = new Zwierzaki();
        pies.imie = "Odi";
        pies.wiek = 3;
        pies.przedstawSie();
        pies.dajGlos(2);
        pies.podajWiek();
        System.out.println();


        Zwierzaki chomik = new Zwierzaki();
        chomik.wiek = 1;
        chomik.imie = "Puszek";
        chomik.głos = "cmok";
        chomik.przedstawSie();
        chomik.podajWiek();
        chomik.dajGlos(2);
        System.out.println();

    }
}
