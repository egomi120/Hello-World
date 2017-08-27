import java.util.Scanner;

public class DodawaniezKlawiatury {

    // static instant variable
    private static int sumaLiczb;

    // może być dostępna ze statycznej metody.
    public static void main(String args[]){

        System.out.print("Podaj liczbę nr1: ");

        Scanner sc1 = new Scanner(System.in);
        int liczba1 = sc1.nextInt();

        System.out.print("Podaj liczbę nr2: ");

        Scanner sc2 = new Scanner(System.in);
        int liczba2 = sc2.nextInt();

        System.out.println("Liczba nr1: " + liczba1);
        System.out.println("Liczba nr2: " + liczba2);

        sumaLiczb = liczba1 + liczba2;
        System.out.println("Suma = "+ sumaLiczb);

        int roznicaLiczb = liczba1 - liczba2;
        System.out.println("Różnica (nr1-nr2) = " + roznicaLiczb);

        int iloczynLiczb;
        iloczynLiczb = liczba1 * liczba2;
        System.out.println("Iloczyn =  " + iloczynLiczb);

    }
}
