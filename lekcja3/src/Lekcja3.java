public class Lekcja3 {
    public static void main(String[] args){
        int a = 31;
        int b = 10;
        //double wynik = (a + b) * b; zwraca wynik na zmiennych jesli mamy System.out.println
        //a-=b przypisuje zmiennej a wynik odejmowania jesli a = 31, b= 10 to -= daje nam 21 nie uwzglednia 31
        //a%=b daje reszte % daje reszte z dzielenia jesli a = 31, b = 10 to a % b daje nam 1, a jesli mamy a%=b to zamianst a w 31 mamy a rowne 1
        //Math oddaje nam działania matematyczne
        System.out.println(Math.abs(-16)); //wartosc bezwzgledna
        System.out.println(Math.pow(2, 5)); //wartosc potęga 2 do 8tej
        System.out.println(Math.sqrt(9)); //wartosc potęga 2 do 4tej
        a++;    //inkrematacja  operacje powodujące zwiększenie wartości argumentu o jeden.
        System.out.println(a); //jesli a=31 zainkremetujemy a++ to pozniej a = 32
        a--;
        a--;
        System.out.println(a); //jesli a=32 zdekrementujemy 2 razy to a-- to pozniej a = 30

    }


}
