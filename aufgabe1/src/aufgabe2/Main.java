package aufgabe2;

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] zahlen = {4, 8, 3, 10, 17};

        System.out.println("Maximale Zahl: " + ZahlenAnalyse.maximaleZahl(zahlen));
        System.out.println("Minimale Zahl: " + ZahlenAnalyse.minimaleZahl(zahlen));
        System.out.println("Maximale Summe (n-1): " + ZahlenAnalyse.maximaleSumme(zahlen));
        System.out.println("Minimale Summe (n-1): " + ZahlenAnalyse.minimaleSumme(zahlen));
    }
}
