package aufgabe4;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        System.out.println("\n=== Aufgabe 4: ElektronikShop ===");

        int[] tastaturen1 = {40, 35, 70, 15, 45};
        System.out.println("Billigste Tastatur: " + ElektronikShop.billigsteTastatur(tastaturen1)); // 15

        int[] tastaturen2 = {15, 20, 10, 35};
        int[] usb2 = {20, 15, 40, 15};
        System.out.println("Teuerster Gegenstand: " + ElektronikShop.teuersterGegenstand(tastaturen2, usb2)); // 40

        int[] usb3 = {15, 45, 20};
        System.out.println("Teuerstes USB innerhalb Budget=30: " +
                ElektronikShop.teuerstesUsbInnerhalbBudget(usb3, 30)); // 20

        // Maximale Kaufbeträge
        int[] t1 = {40, 50, 60};
        int[] u1 = {8, 12};
        System.out.println("Budget=60 -> " + ElektronikShop.maximalerKaufbetrag(60, t1, u1)); // 58

        int[] t2 = {60};
        int[] u2 = {8, 12};
        System.out.println("Budget=60 -> " + ElektronikShop.maximalerKaufbetrag(60, t2, u2)); // -1

        int[] t3 = {40, 60};
        int[] u3 = {8, 12};
        System.out.println("Budget=60 -> " + ElektronikShop.maximalerKaufbetrag(60, t3, u3)); // 52

        // Zusatztests:
        int[] t4 = {5, 10, 20};
        int[] u4 = {2, 3, 9};
        System.out.println("Budget=15 -> " + ElektronikShop.maximalerKaufbetrag(15, t4, u4)); // 13

        int[] t5 = {100, 200};
        int[] u5 = {150};
        System.out.println("Budget=100 -> " + ElektronikShop.maximalerKaufbetrag(100, t5, u5)); // -1
    }


}

