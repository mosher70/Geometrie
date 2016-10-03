import java.util.Scanner;

/**
 * Created by uwest on 03.10.2016.
 */
public class KreisBerechnung {
    double radius;
    double durchmesser;
    double ergebnis;
    double umfang;


    public void radius(){
        System.out.println("Bitte geben Sie den Radius ein:");
        Scanner s = new Scanner(System.in);
        radius = s.nextFloat();
        ergebnis = (radius * radius) * Math.PI;
        ergebnis = Math.round(100.0 * ergebnis) / 100.0;
        System.out.println("Die Fläche über den Radius berechnet ist: " + ergebnis + " cm²");
    }
    public void durchmesser (){
        System.out.println("Bitte geben Sie den Durchmesser in cm ein:");
        Scanner s = new Scanner(System.in);
        durchmesser = s.nextFloat();
        radius = durchmesser / 2;
        ergebnis = (radius * radius) * Math.PI;
        ergebnis = Math.round(100.0 * ergebnis) / 100.0;
        System.out.println("Die Fläche über den Durchmesser berechnet ist: " + ergebnis + " cm²");
    }
    public  void umfang () {
        System.out.println("Bitte geben Sie den Umfang ein");
        Scanner s = new Scanner(System.in);
        umfang = s.nextFloat();
        durchmesser = umfang / Math.PI;
        radius = durchmesser /2;
        ergebnis = (radius * radius) * Math.PI;
        ergebnis = Math.round(100.0 * ergebnis) / 100.0;
        System.out.println("Die Fläche über den Umfang berechnet ist: " + ergebnis + " cm²");

    }
}

