import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.3 */

        /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
        *   a) Imię, nazwisko, wiek, nr indeksu,
        *   dane mają być wprowadzane z klawiatury w konsoli
        *   b) wyświetlić dane za pomocą println i printf
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj imie i nazwisko: ");
        String tekst = scan.next();
        System.out.println("Podaj wiek: ");
        int liczba = scan.nextInt();
        System.out.println("Podaj nr indeksu: ");
        int liczba1 = scan.nextInt();



        Scanner scan1 = new Scanner(System.in);
        System.out.printf("Podaj imie i nzawisko: ");
        String tekst2 = scan1.next();
        System.out.printf("Podaj wiek:");
        int liczba2 = scan1.nextInt();
        System.out.printf("Podaj nr indeksu: ");
        int liczba3 = scan1.nextInt();




        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
        *   wynik wyświetlić w konsoli programu
        */

    }
}
