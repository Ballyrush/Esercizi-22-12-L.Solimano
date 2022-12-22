import java.util.RandomAccess;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci il lato del quadrato: ");
        int latoQ = input.nextInt();
        int PeriQ = latoQ * 4;
        int AreaQ = latoQ * latoQ;
        System.out.println("Il Perimetro del quadrato è: " + PeriQ);
        System.out.println("L'area del quadrato è: " + AreaQ);


        System.out.println("Inserisci l'altezza del rettangolo: ");
        int AltezzaR = input.nextInt();
        System.out.println("Inserisci la base del rettangolo: ");
        int BaseR = input.nextInt();
        int AreaR = AltezzaR * BaseR;
        int PeriR = (AltezzaR * 2) + (BaseR * 2);

        System.out.println("Il Perimetro del rettangolo è: " + PeriR);
        System.out.println("L'Area del rettangolo è: " + AreaR);


        System.out.println("Inserisci il primo lato del triangolo: ");
        int LatoT1 = input.nextInt();
        System.out.println("Inserisci il secondo lato del triangolo: ");
        int LatoT2 = input.nextInt();
        System.out.println("Inserisci il terzo lato del triangolo: ");
        int LatoT3 = input.nextInt();
        int PeriT = LatoT1 + LatoT2 + LatoT3;
        System.out.println("Il Perimetro del Triangolo è: " + PeriT);


        System.out.println("Inserisci l'altezza del triangolo: ");
        int AltezzaT = input.nextInt();
        System.out.println("Inserisci la base del triangolo: ");
        int BaseT = input.nextInt();
        int AreaT = (AltezzaT * BaseT) / 2;
        System.out.println("L'Area del Triangolo è: " + AreaT);


        System.out.println("Inserisci il raggio del cerchio: ");
        int RaggioC = input.nextInt();
        double PI = 3.1415;
        double AreaC = PI * (RaggioC * RaggioC);
        double CircoC = PI * RaggioC * 2;
        System.out.println("La Circonferenza del cerchio è: " + CircoC);
        System.out.println("L'Area del Cerchio: " + AreaC);
    }
}