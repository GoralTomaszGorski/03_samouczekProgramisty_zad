public class Lekcja12a {
    public static void main(String[] args)  {
        int []y = {5} ;
        y = zmienna(y);
        System.out.println(y[0]);

    }
    public static int[] zmienna (int[] x){
        x = new int[1];
        x[0] +=20;
        System.out.println("Metoda: " + x[0]);
        return x ; // jak mamy return to y tez staje się 20 bierze to co z x

    }
}
