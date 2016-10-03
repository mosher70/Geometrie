import java.util.Scanner;

/**
 * Created by uwest on 03.10.2016.
 */
public class Kreis {
    public void methodenAuswahl () {

        double radius;
        double durchmesser;
        double umfang;
        // char wahl;
        System.out.print("\033[H\033[2J");
        System.out.println("Wie möchte Sie die Fläche des Kreises berechnen?");
        System.out.println("Radius = r");
        System.out.println("Durchmesser = d");
        System.out.println("Umfang = u");
        System.out.println("Bitte geben Sie Ihre Wahl ein: ");

        Scanner s = new Scanner(System.in);
        char wahl = s.next().charAt(0);

        switch(wahl){
            case 'r':  KreisBerechnung r = new KreisBerechnung();
                r.radius();
                break;
            case 'd': KreisBerechnung d = new KreisBerechnung();
                d.durchmesser();
                break;
            case 'u': KreisBerechnung u = new KreisBerechnung();
                u.umfang();
                break;
            default:
                System.out.println("Bitte wählen Sie richtig");
                methodenAuswahl();
        }
    }


}
