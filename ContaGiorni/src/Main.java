import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci il numero di secondi: ");
        int Secondi = input.nextInt();
        int TotalDays = Secondi / 86400;
        int DaysDiff = Secondi % 86400;
        int TotalHours = DaysDiff / 3600;
        int HoursDiff = DaysDiff % 3600;
        int TotalMinutes = HoursDiff / 60;
        int MinutesDiff = HoursDiff % 60;
        System.out.println("Il totale  dei giorni è: " + TotalDays);
        System.out.println("Il totale delle ore è: " + TotalHours);
        System.out.println("Il totale dei minuti è: " + TotalMinutes);
        System.out.println("Il totale dei secondi è: " + MinutesDiff);
            }
}