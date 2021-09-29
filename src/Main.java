import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.5 */

        /* zad.1 podziel swój wiek przez modulo 3 i jeśli twój wiek zwraca 0 wyświetl napis "Podzielny przez 3",
         * w innym wypadku "Niepodzielny przez 3" użyj kontrukcji if else
         * */
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj swój wiek: ");
        int liczba = scan.nextInt();
        int wynik = liczba % 3;
        if (wynik == 0){
        System.out.println("Podzielny przez 3");}
        else {
            System.out.println("Niepodzielny przez 3");


        }

        /* zad.2 użyj parametru trójargumentowego aby sprawdzić parzystośc nr. indeksu */
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Podaj nr indeksu: ");
        int liczba1 = scan.nextInt();
        int wynik1 = liczba1 / 2;
        if (wynik1 % 2== 0)

        {
            System.out.println("Numer indeksu jest parzysty");
        }
        else{
            System.out.println("Numer indeksu nie jest parzysty");
        }




        /* zad.3 wpisz z klawiatury liczbę zmiennoprzecinkową (użyj klasy Scanner z poprzednich ćwiczeń)
         * i stwórz konstrukcję else if z dowolnymi komunikatami */
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Podaj liczbę zmiennoprzecinkową: ");
        double liczba2 = scan.nextDouble();
        System.out.println("Podaj drugą liczbe zmiennoprzecnkową: ");
        double liczba3 = scan.nextDouble();
        double wynik2 = liczba2 - liczba3;
        if (wynik2 < 0){
            System.out.println("Wynik jest ujemny");
        }
        else{
            System.out.println("Wynik jest dodatni");
        }
    }
}
