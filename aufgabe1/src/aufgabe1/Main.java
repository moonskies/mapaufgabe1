package aufgabe1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] noten = {29, 37, 38, 41, 84, 67};

        System.out.println("Nicht ausreichende Noten: " + NotenManager.findeNichtAusreichendeNoten(noten));
        System.out.println("Durchschnitt: " + NotenManager.berechneDurchschnitt(noten));
        System.out.println("Abgerundete Noten: " + Arrays.toString(NotenManager.rundeNoten(noten)));
        System.out.println("Maximale abgerundete Note: " + NotenManager.maximaleAbgerundeteNote(noten));
    }
}
