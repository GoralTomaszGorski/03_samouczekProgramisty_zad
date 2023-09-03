public class Zwierze {
    static int liczebnosc = 0;

    Zwierze() {
        liczebnosc++;
    }
        String imie;
        Integer wiek;
        String glos = "Grrr";

        public void dajGlos (int x) {
            for (int i = 0; i < x; i++) {
                System.out.print(glos + " ");
            }
        }

        public void przedstawSie() {
            System.out.println("Nazywam sie: " + imie);
        }

        public void podajWiek() {
            System.out.println("Mam teraz: " + wiek + " lat/a");
        }

    }
