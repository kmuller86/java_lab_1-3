import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Tablice - cw_6 */

        /* zad1. stworzyć tablicę typu double 5-cio elementową,
        przypisać do niej wartości i wyświetlić */
        double[] tablica = new double[5];
        /*
        for (int i = 0; i < 5; i++) {
            tablica [i] = i +1.66;
         }
         Iterator tablicy (tab[i]) musi być zawsze liczbą calkowitą, był pan blisko dobrego rozwiązania 
        */
        for (double i = 0; i < 5; i++)
            tablica [(int) i] = i +1;
        double zmienna = tablica[3];
        for (int i = 0; i < 5; i++)
            System.out.println("Kolejna komórka to: " + tablica[i]);
    }
}
