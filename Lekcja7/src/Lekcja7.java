public class Lekcja7 {
    public static void main(String[] args){
        int i = 3;
        while (i > 0) { //pentla while w nawiasie warunek kontynuacji pętli
            System.out.println(i);
            i--; //to byla dekrementacja czyli zmejszanie o 1
        }
        System.out.println(i);
        System.out.println(i);

        int j = 4;
        do{ //pętla do czyli zrób po wojskowemy naprzód
            //czym sie róznia do od while?? do najpierw robi później mysli czyli sprawdza warunek zrobi pętle co najmniej 1 raz
            System.out.println(j);
            j--;

        }while (j > 0); //tu średnik na koncu ma byc i stoi poza nawiasem klamorwym
        System.out.println(j);
        System.out.println(j);

        for(int k = 5; k>0; k--){       //"tzw pętla z licznikiem" for to jakby robimy przez
       // co po for (deklaracja zmiennej; dopóki k >0; k zmiejszamy o 1)
            System.out.println(k);

        }
       // System.out.println(k); zmienna k ma być w środku pętli
        //albo dajemy k przed pętlą i możemy k wypisac po nawiasie


    }
}
