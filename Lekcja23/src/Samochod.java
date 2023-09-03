public class Samochod extends Pojazd  {
    boolean otwarty = false;
    void zamknijOtwzorz(){
        otwarty = !otwarty;
        if(otwarty)
            System.out.println("otwarto");
        else
            System.out.println("zamknieto");

    }

}
