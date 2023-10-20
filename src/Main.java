import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void generuj(int[] tab){
        Random los = new Random();
        for(int i = 0; i < tab.length; i ++){
            tab[i] = los.nextInt(1,101);
        }
    }

    /******************************************************
     nazwa funkcji: znajdz_liczbe
     argumenty: tab - zawiera tablice elementow do przeszukania
     szukana - zawiera poszukiwana liczbe
     typ zwracany: int, indeks w tablicy na ktorym sie znajduje szukana liczba a jesli nie ma jej w tablicy, indeks liczby-wartownika
     informacje: Funkcja przeszukuje tablice 50 elementow w celu sprawdzenia, czy jest w niej podana przez nas liczba, jesli jest to podaje nam,
     indeks na ktorym ta liczba sie znajduje a jeżeli nie to zwraca ona indeks naszego wartownika
     autor: Zielak04
     *****************************************************/

    public static int znajdz_liczbe(int[] tab, int szukana){
        int indeks;
        for(int i = 0; i < tab.length; i++){
            if(tab[i] == szukana){
                indeks = i;
                return indeks;
            }
        }
        return tab.length;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] tablica = new int[51];
        int szukana;
        System.out.println("Podaj liczbe do wyszukania w zakresie od 1 do 100");
        szukana = input.nextInt();
        tablica[50] = szukana;
        generuj(tablica);
        for(int i = 0; i < tablica.length; i++){
            System.out.printf(tablica[i] + ", ");
        }
        int indeks = znajdz_liczbe(tablica, szukana);
        if(indeks < 50){
            System.out.println("\nIndeks w tablicy na ktorym ta liczba wystapila to: " + indeks);
        }else System.out.println("\nDanej liczby nie ma w tablicy i zostala dana jako wartownik na koniec tablicy!!!");
    }
}