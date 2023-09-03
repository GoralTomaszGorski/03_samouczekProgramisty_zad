public class Lekcja11 {
    public static void main(String[] args){ //funkcja metoda jest podbiorem danej klasy
        String h = wyswietl();
        System.out.println(h);
        System.out.println(dodaj());
        System.out.println(dodaj(5));
        System.out.println(dodaj(5, 6));

    }
    static String wyswietl(){ //przed naswą funkcji/metody jest void-typ zwracany nazwa z reguły z małej
        //wszytsko co wewnątrz metody jest to ciało metody, void nic nie zwraca
       return "Hello World";
    }
    static int dodaj(){
        return 0;
    }
    static int dodaj(int x){
        return ++x;
    }
    static int dodaj(int x, int y){
        return x + y;
    }
}
