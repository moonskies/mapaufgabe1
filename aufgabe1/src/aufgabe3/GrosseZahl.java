package aufgabe3;

import java.util.Arrays;

public class GrosseZahl {

    // 1. Summe
    public static int[] summe(int[] a, int[] b) {
        int n = a.length;
        int[] res = new int[n + 1];
        int carry = 0;

        for (int i = n - 1; i >= 0; i--) {
            int s = a[i] + b[i] + carry;
            res[i + 1] = s % 10;
            carry = s / 10;
        }
        res[0] = carry;
        return res[0] == 0 ? Arrays.copyOfRange(res, 1, res.length) : res;
    }

    // 2. Differenz (a >= b)
    public static int[] differenz(int[] a, int[] b) {
        int n = a.length;
        int[] res = new int[n];
        int borrow = 0;

        for (int i = n - 1; i >= 0; i--) {
            int diff = a[i] - b[i] - borrow;
            if (diff < 0) {
                diff += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            res[i] = diff;
        }
        return res;
    }

    // 3. Multiplikation mit einer Ziffer
    public static int[] multiplikation(int[] a, int b) {
        int n = a.length;
        int[] res = new int[n + 1];
        int carry = 0;

        for (int i = n - 1; i >= 0; i--) {
            int prod = a[i] * b + carry;
            res[i + 1] = prod % 10;
            carry = prod / 10;
        }
        res[0] = carry;
        return res[0] == 0 ? Arrays.copyOfRange(res, 1, res.length) : res;
    }

    // 4. Ganzzahlige Division mit einer Ziffer
    public static int[] division(int[] a, int b) {
        int n = a.length;
        int[] res = new int[n];
        int rest = 0;

        for (int i = 0; i < n; i++) {
            int num = rest * 10 + a[i];
            res[i] = num / b;
            rest = num % b;
        }
        return res;
    }
}
