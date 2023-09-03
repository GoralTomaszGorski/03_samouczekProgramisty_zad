public class Lekcja17 { //gettery setery pozwala na hermetyzacje danych
    public static void main(String[] args) {
        Uczen u1 = new Uczen();//pierwszy obiekt
        u1.setNazwisko("Nowak");
        System.out.println(u1.getNazwisko());

        u1.setNazwisko("K");
        System.out.println(u1.getNazwisko());

        u1.setOcena(7);
        System.out.println(u1.getOcena());

    }
}
