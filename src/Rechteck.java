/**
 * Created by uwest on 01.10.2016.
 */
import java.util.Scanner;
public class Rechteck {
    double seitea;
    double seiteb ;
    double ergrechteck  ;



    public Rechteck() {
        System.out.print("\033[H\033[2J");
        Scanner s = new Scanner(System.in);
        System.out.println ("Bitte geben Sie die Seitenlänge a in cm ein: ");
        seitea = s.nextDouble();
        System.out.println ("Bitte geben Sie die Seitenlänge b  in cm ein: ");
        seiteb = s.nextDouble();
    }

    void berechnen (){
        ergrechteck = seitea * seiteb;
        ergrechteck = Math.round(100.0 * ergrechteck) / 100.0;
        System.out.println("Das Ergebnis ist: " + ergrechteck + " cm²");

    }
}
