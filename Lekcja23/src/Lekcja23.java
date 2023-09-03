public class Lekcja23 {
    public static void main (String[] args){
        Samochod audi = new Samochod();
        audi.iloscKol = 4;
        audi.marka = "Audi";
        System.out.println(audi.iloscKol + " " + audi.marka);
        audi.odpal();


        audi.zamknijOtwzorz();
        audi.zamknijOtwzorz();

        SamochodSportowy subaru = new SamochodSportowy();
        subaru.zamknijOtwzorz();
        subaru.odpal();
        subaru.marka = "Subaru";
        System.out.println(subaru);
    }

}
