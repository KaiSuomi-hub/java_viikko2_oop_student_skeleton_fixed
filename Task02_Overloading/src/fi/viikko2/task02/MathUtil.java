/**
 * Tehtävä 2 – Metodien ylikuormitus (sum, min, max, taulukot)
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Toteuta sum(int,int), sum(int,int,int), sum(int[]), sum(double[]).
 *  2. Toteuta max(int[]) ja min(int[]).
 *
 * VINKIT:
 *  - Käy taulukko silmukalla; varo tyhjiä taulukoita.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */
package fi.viikko2.task02;
// 7
public class MathUtil {
    // 8. sum() metodit
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static int sum(int[] array) {
        int total = 0;
        for (int number : array)
            total += number;
        return total;
    }
    public static double sum(double[] array) {
        double total = 0.0;
        for (double number : array)
            total += number;
        return total;
    }
    // 9. max() ja min() metodit
    public static int max(int[] array) {
        if (array== null || array.length == 0) {
            throw new IllegalArgumentException("Tyhjä array" );
        }
        int best = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > best) {
                best = array[i];
            }
        }
        return best;
    }

    public static int min(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Tyhjä array");
        }
        int best = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < best) {
                best = array[i];
            }
        }
        return best;
    }

}
