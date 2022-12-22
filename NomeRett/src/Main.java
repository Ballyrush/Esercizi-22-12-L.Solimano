import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci il tuo nome: ");
        String nome = input.nextLine();
        System.out.println("+--------------+");
        System.out.println("|   " + nome +"  |" );
        System.out.println("+--------------+");

    }
}