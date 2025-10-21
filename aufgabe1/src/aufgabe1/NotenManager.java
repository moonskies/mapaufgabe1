import java.util.ArrayList;

public class NotenManager {

    // 1. Nicht ausreichende Noten (< 40)
    public static ArrayList<Integer> findeNichtAusreichendeNoten(int[] noten) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int note : noten) {
            if (note < 40) {
                result.add(note);
            }
        }
        return result;
    }

    // 2. Durchschnitt der Noten
    public static double berechneDurchschnitt(int[] noten) {
        if (noten.length == 0) return 0.0;
        int summe = 0;
        for (int note : noten) {
            summe += note;
        }
        return Math.round((summe / (double) noten.length) * 100.0) / 100.0;
    }

    // 3. Noten runden nach den Regeln
    public static int[] rundeNoten(int[] noten) {
        int[] gerundet = new int[noten.length];
        for (int i = 0; i < noten.length; i++) {
            int note = noten[i];
            if (note >= 38) {
                int naechstesVielfaches = ((note / 5) + 1) * 5;
                if (naechstesVielfaches - note < 3) {
                    note = naechstesVielfaches;
                }
            }
            gerundet[i] = note;
        }
        return gerundet;
    }

    // 4. Maximale abgerundete Note
    public static int maximaleAbgerundeteNote(int[] noten) {
        int[] gerundet = rundeNoten(noten);
        int max = gerundet[0];
        for (int n : gerundet) {
            if (n > max) max = n;
        }
        return max;
    }
}
