public class Lekcja6 {
    public static void main(String[] args){
        int poraRoku = 5;

        switch (poraRoku){ //przelącznik int
            case 1: // przypdaki tez muszą byc int
                System.out.println("Wiosna");
                break; //brake sluzy do zastrzymania programu bo jak mamy case to program leci od np 3 do konca, czyli jak damy pora roku nr 3 to wypisze jesien i zima...
            case 2: // przypdaki tez muszą byc int
                System.out.println("Lato");
                break;
            case 3: // przypdaki tez muszą byc int
                System.out.println("Jesien");
                break;
            case 4: // przypdaki tez muszą byc int
                System.out.println("Zima");
                break;
                default: // podstawowy jak mamy zadeklarowane nr od 1 do 4 to w innym przypadku (0, 5, 6...) wypisze nam default czyli nie ma takiej pory roku
                    System.out.println("Nie masz takiej pory roku gosciu");

        }

    }
}
