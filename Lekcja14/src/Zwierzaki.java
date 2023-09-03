
public class Zwierzaki { //klasa
    static int liczebnosc = 0;
    Zwierzaki(){
        liczebnosc++;
    }
    String imie;
    String głos = "Grrrr";
    Integer wiek;
    public void dajGlos(int x) {
        {
            for (int i = 0; i < x; i++) {
                System.out.print(głos);
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    public void przedstawSie(){
        System.out.println("Nazywam sie " + imie);

    }
    public void podajWiek(){
        System.out.println("mam aktualnie " + wiek + " lat");

    }
}
