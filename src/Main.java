import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int zmiennaInt = 7;
        System.out.println("zmienna int = " + zmiennaInt);
        /* ćw.2 */

        /*   zad.1 zadeklaruj i zainicjalizuj zmienne różnych typów i wyświetl w konsoli (im więcej tym lepiej ;) ) */
        byte zmiennaByte;
        zmiennaByte = 1;
        System.out.println("zmiennaByte = " + zmiennaByte);
        short zmiennaShort;
        zmiennaShort = 31;
        System.out.println("zmiennaShort = " + zmiennaShort);
        int zmiennaint;
        zmiennaint = 112341;
        System.out.println("zmiennaint = " + zmiennaint);
        long zmiennalong;
        zmiennalong = 123456789L;
        System.out.println("zmiennalong = " + zmiennalong);
        float zmiennafloat;
        zmiennafloat = 123.67f;
        System.out.println("zmiennafloat = " + zmiennafloat);
        double zmiennadouble;
        zmiennadouble = 99989.96543;
        System.out.println("zmiennadouble +" + zmiennadouble);
        boolean zmiennaboolean;
        zmiennaboolean= true;
        System.out.println("zmiennaboolean = " + zmiennaboolean);
        char zmiennachar;
        zmiennachar = 'f';
        System.out.println("zmiennachar = " + zmiennachar);
        String zmiennastring;
        zmiennastring = "Hello world!";
        System.out.println("zmiennastring = " +zmiennastring);


        /*
        *    zad.2 Napisz kod który będzie wykonywał operacje: dodawania, odejmowania,
        *    mnożenia, dziealenia i modulo na zmiennych:
        *    a) liczbaA i liczbaB, dowolne liczby calkowite (int),
        *    b) liczbaX i liczbaY, dowolne liczby zmiennoprzecinkowe (double)
        *  */
        // a)
        int a = 10, b = 2;
        int wynik1 = a+b;
        System.out.println("wynik1 = " + wynik1);
        int wynik2 = a -b;
        System.out.println("wynik2 =" + wynik2);
        int wynik3 = a * b;
        System.out.println("wynik3 = "+ wynik3);
        int wynik4 = a / b;
        System.out.println("wynik4 = " + wynik4);
        int wynik5 = b % a;
        System.out.println("wynik5 = " + wynik5);

        // b)



    }
}
