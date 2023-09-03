public class Lekcja12 {
    public static void main(String[] args)  {
        int []y = {5} ;
        zmienna(y);
        System.out.println(y[0]);

    }
    public static void zmienna (int[] x){
        x = new int[2];
        x[1] +=20;
        System.out.println("Metoda: " + x[0]);
        System.out.println("Metoda: " + x[1]);//to się wykonuje wewnątrz funkcji iniezwraca do tego co jestna górze
        //aby sie wykonało trzeba dać return i zamienic zmienna void na int to zadziała odda zamiane

    }
}
