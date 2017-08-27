import java.util.Scanner;

public class DodawaniezKlawiatury {

    public static void main(String args[]){

        System.out.print("Podaj liczbę nr1: ");

        Scanner sc1 = new Scanner(System.in);
        int liczba1 = sc1.nextInt();

        System.out.print("Podaj liczbę nr2: ");

        Scanner sc2 = new Scanner(System.in);
        int liczba2 = sc2.nextInt();

        System.out.println("Liczba n1: " + liczba1);
        System.out.println("Liczba n2: " + liczba2);

    }
}
