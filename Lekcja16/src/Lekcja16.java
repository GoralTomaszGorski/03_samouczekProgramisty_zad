public class Lekcja16 {

    public static void main(String[] args) {
        int l = 50;
        System.out.println("1 liczba przed działaniem fukcji: " + l);
        zmien(l); //jak kopjujemy typy prote to kopjuejemy ich wartość
        System.out.println("4 liczba po działaniu fukcji: " + l);

        Liczba obiektliczba = new Liczba(); //wywołanie klasy
        obiektliczba.ol = 10;
        System.out.println("5 Obiekt liczba wywolany z klasy przed: " + obiektliczba.ol);
        zmien(obiektliczba.ol); //jak kopjujemy typy złożone (w funkcjach tbalichach) to kopjuejemy ich REFERENCJE
        System.out.println("6 Obiekt liczba wywolany z klasy po przpuszczeniu przez funkcje zmien: " + obiektliczba.ol);


    }
    public static void zmien(int l){
        System.out.println("2 liczba wrzucona do wenatrz fukcji przed podstawieniem: " + l);
        l=1; //tutaj tworzona jest lokalna zmienna wyrzucano po wyjsciu z wfunkcji
        System.out.println("3 liczba wrzucona do wenatrz fukcji po podstawieniu: " + l);
        l=2;
    }


    public static void zmien(Liczba l) {
        System.out.println("liczba po działaniu klasy Liczba: " + l);
    }
}
