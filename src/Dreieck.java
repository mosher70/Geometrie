import java.util.Scanner;

/**
 * Created by uwest on 03.10.2016.
 */
class Dreieck {
    double grundseite = 0;
    double hoehe ;
    double ergdreieck;


    public Dreieck() {
        System.out.print("\033[H\033[2J");
        Scanner s = new Scanner(System.in);
        System.out.println ("Bitte geben Sie die Grundseite g in cm ein: ");
        grundseite = s.nextDouble();
        System.out.println ("Bitte geben Sie die Höhe h in cm ein: ");
        hoehe = s.nextDouble();
    }

    void berechnen (){
        ergdreieck = (grundseite * hoehe) / 2;
        ergdreieck = Math.round(100.0 * ergdreieck) / 100.0;
        System.out.println("Die Fläche beträgt: " + ergdreieck + "cm²");

    }
}

