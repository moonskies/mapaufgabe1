package aufgabe3;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        System.out.println("\n=== Aufgabe 3: Große Zahlen ===");

        // Beispiel 1: Addition
        int[] x1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] y1 = {8, 7, 0, 0, 0, 0, 0, 0, 0};
        System.out.println("Summe: " + Arrays.toString(GrosseZahl.summe(x1, y1)));

        // Beispiel 2: Differenz
        int[] x2 = {8, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] y2 = {5, 4, 0, 0, 0, 0, 0, 0, 0};
        System.out.println("Differenz: " + Arrays.toString(GrosseZahl.differenz(x2, y2)));

        // Beispiel 3: Multiplikation
        int[] x3 = {2, 3, 6, 0, 0, 0, 0, 0, 0};
        System.out.println("Multiplikation (*2): " + Arrays.toString(GrosseZahl.multiplikation(x3, 2)));

        // Beispiel 4: Division
        System.out.println("Division (/2): " + Arrays.toString(GrosseZahl.division(x3, 2)));

        // Zusatztest: Übertrag bei Addition
        int[] a = {9, 9, 9, 9};
        int[] b = {0, 0, 0, 1};
        System.out.println("Summe mit Übertrag: " + Arrays.toString(GrosseZahl.summe(a, b))); // [1, 0, 0, 0, 0]

        // Zusatztest: Multiplikation mit Übertrag
        int[] c = {9, 9, 9};
        System.out.println("Multiplikation (*9): " + Arrays.toString(GrosseZahl.multiplikation(c, 9))); // [8,9,9,1]

        // Zusatztest: Division mit Rest
        int[] d = {2, 3, 6, 0};
        System.out.println("Division (/3): " + Arrays.toString(GrosseZahl.division(d, 3))); // [0,7,8,6]



    }
}

