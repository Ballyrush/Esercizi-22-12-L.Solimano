import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int Seconds = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci il numero di giorni: ");
        int Days = input.nextInt();
        System.out.println("Inserisci il numero di ore: ");
        int Hours = input.nextInt();
        System.out.println("Inserisci il numero di minuti: ");
        int Minutes = input.nextInt();
        System.out.println("Inserisci il numero di secondi: ");
        int Secondi = input.nextInt();


        int TotalSecondsDays = Days * 86400;
        int TotalSecondsHours = Hours * 3600;
        int TotalSecondsMinutes = Minutes * 60;
        int FinalResult = TotalSecondsDays + TotalSecondsHours + TotalSecondsMinutes + Secondi;
        System.out.println("Il totale del secondi è:" + FinalResult);

        //i secondi in un giorno sono 86400;
        //6 gg ===> 6 * 86400
    }
}