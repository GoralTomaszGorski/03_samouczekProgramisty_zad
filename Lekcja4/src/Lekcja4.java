public class Lekcja4 {
    public static void main(String[] args){
        int wiek = 21;

        if(wiek >= 18) {
            System.out.println("Pełnoletni");
        }
        else if (wiek>=16)
        {
            System.out.println("mozesz pracowac");
        }
         else {
             System.out.println("nie mozesz pracowac");
        }
         String imie = wiek >= 18 ? "Góral" : "Góralek";
         System.out.println(imie);
        }

    }