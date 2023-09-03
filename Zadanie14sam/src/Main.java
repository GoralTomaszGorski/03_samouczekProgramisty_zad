public class Main {


    public static void main(String[] args){
        Zwierze kot = new Zwierze();
        kot.imie = "Bambi";
        kot.glos = "Miałłł";
        kot.wiek = 4;

        kot.przedstawSie();
        kot.dajGlos(4);
        kot.podajWiek();

        Zwierze pies = new Zwierze();
        pies.imie = "Odi";
        pies.wiek = 3;
        pies.przedstawSie();
        pies.dajGlos(2);
        pies.podajWiek();
        System.out.println();


        Zwierze chomik = new Zwierze();
        chomik.wiek = 1;
        chomik.imie = "Puszek";
        chomik.glos = "cmok";
        chomik.przedstawSie();
        chomik.podajWiek();
        chomik.dajGlos(2);
        System.out.println();


        System.out.println("Liczba zwierząt w programie to: " + Zwierze.liczebnosc);
    }

}
