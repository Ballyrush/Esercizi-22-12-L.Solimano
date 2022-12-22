import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci il primo addendo: ");
        double PrimoAdd = input.nextDouble();
        System.out.println("Inserisci il secondo addendo: ");
        double SecondoAdd = input.nextDouble();
        double Totale = PrimoAdd + SecondoAdd;
        System.out.println("Il totale della Somma è: " + Totale);


    }
}