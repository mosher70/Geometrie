import java.util.Scanner;

public class MenueAuswahl {
    public void auswahl(){
        int eingabe = 0;
        System.out.println("Was möchten Sie berechnen?");
        System.out.println("1:  Rechteck");
        System.out.println("2:  Dreieck");
        System.out.println("3:  Kreis");
        System.out.println("Bitte geben Sie ihre Auswahl an: ");

        Scanner eingabezahl = new Scanner(System.in);
        eingabe = eingabezahl.nextInt();

        switch(eingabe) {
            try {

                case 1:
                    Rechteck a = new Rechteck();
                    a.berechnen();
                    break;
                case 2:
                    Dreieck b = new Dreieck();
                    b.berechnen();
                    break;
                case 3:
                    Kreis c = new Kreis();
                    c.methodenAuswahl();
                    break;
            }
    }


    }

}
