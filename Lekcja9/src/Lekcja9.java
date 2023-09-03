public class Lekcja9 {
    public static void main(String[] args){

        String[] tab = new String[20]; //tab tablica nowa z 20 elematami typu string od 0 do 19
        tab[19] = "Ania";
        tab[18] = "Tomek";
        tab[17] = "Kasia";
        tab[0] = "Kasia";
        tab[1] = "Bartek";

        for(int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
        System.out.println(tab[19]); //wyświetla dnay alement
        System.out.println(tab.length); //wyswietla dlugosc tablicy

        int[] tab2 = {1, 2, 3, 4, 5}; //deklarowanie poprzez tablice z palca w nawiasie poszczegolne elementy
                System.out.println(tab2[0]); //elemet nr 0 to jest 1 bo tablice numerowane sa od 0 po amyrykańsku podobno
        String[] tab3 = {"a", "b", "c", "d"}; // tablice typu string wartosci w nawiasach
        System.out.println(tab3[2]);
    }

    private static class string {
    }
}
