public class Lekcja13a { //konwersja danych
    public static void main(String[] args) {
        float a = 25.9f; //przy rzutowaniu konwersji danych nie ma zaokrąglania bierze tylko do calkowitej reszte odrzuca
        int b = (int)a; //rzutowanie zmiennej  (przpisanie jednego typu zmiennej na inny)
        String liczba = Integer.toString(b); //konwertowanie danych int na string
        int c = Integer.parseInt(liczba);
        int maxValue = Integer.MAX_VALUE;
        System.out.println(c+2);
        System.out.println(maxValue);
    }

}

