import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci il primo dato: ");
        double PrimoDato = input.nextDouble();
        System.out.println("Inserisci il Secondo dato: ");
        double SecondoDato = input.nextDouble();
        double Somma = PrimoDato + SecondoDato;
        double Sottrazione = PrimoDato - SecondoDato;
        double Moltiplicazione = PrimoDato * SecondoDato;
        double Divisione = PrimoDato / SecondoDato;

        System.out.println("il totale della somma è: " + Somma);
        System.out.println("il totale della sottrazione è: " + Sottrazione);
        System.out.println("il totale della moltiplicazione è: " + Moltiplicazione);
        System.out.println("il totale della divisione è: " + Divisione);
    }
}