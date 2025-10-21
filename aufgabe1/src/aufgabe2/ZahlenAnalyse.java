package aufgabe2;

public class ZahlenAnalyse {

    public static int maximaleZahl(int[] zahlen) {
        int max = zahlen[0];
        for (int z : zahlen)
            if (z > max) max = z;
        return max;
    }

    public static int minimaleZahl(int[] zahlen) {
        int min = zahlen[0];
        for (int z : zahlen)
            if (z < min) min = z;
        return min;
    }

    public static int maximaleSumme(int[] zahlen) {
        int sum = 0, min = minimaleZahl(zahlen);
        for (int z : zahlen) sum += z;
        return sum - min;
    }

    public static int minimaleSumme(int[] zahlen) {
        int sum = 0, max = maximaleZahl(zahlen);
        for (int z : zahlen) sum += z;
        return sum - max;
    }
}
