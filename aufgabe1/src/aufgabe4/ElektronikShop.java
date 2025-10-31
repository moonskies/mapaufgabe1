package aufgabe4;

public class ElektronikShop {

    public static int billigsteTastatur(int[] tastaturen) {
        int min = tastaturen[0];
        for (int preis : tastaturen)
            if (preis < min) min = preis;
        return min;
    }

    public static int teuersterGegenstand(int[] tastaturen, int[] usb) {
        int max = tastaturen[0];
        for (int p : tastaturen)
            if (p > max) max = p;
        for (int p : usb)
            if (p > max) max = p;
        return max;
    }

    public static int teuerstesUsbInnerhalbBudget(int[] usb, int budget) {
        int max = -1;
        for (int p : usb)
            if (p <= budget && p > max)
                max = p;
        return max;
    }

    public static int maximalerKaufbetrag(int budget, int[] tastaturen, int[] usb) {
        int max = -1;
        for (int t : tastaturen) {
            for (int u : usb) {
                int sum = t + u;
                if (sum <= budget && sum > max)
                    max = sum;
            }
        }
        return max;
    }
}
