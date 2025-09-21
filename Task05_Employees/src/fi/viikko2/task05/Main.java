/**
 * Tehtävä 5 – Main
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Luo Employee[] ja laske palkkasumma.
 *  2. Tulosta tiedot.
 *
 * VINKIT:
 *  - Toteuta aliluokat ensin.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task05;
public class Main {
    public static void main(String[] args) {
        System.out.println("Tehtävä 5: implementoi SalariedEmployee ja HourlyEmployee ennen ajoa.");
        // 26. Main: Luo Employee[] (sekalaista porukkaa) ja laske sekä tulosta palkkasumma
         Employee[] payroll = {
            new SalariedEmployee("f", 3.0),
            new HourlyEmployee("s", 1, 11),
            new HourlyEmployee("d", 2, 1.25),
            new SalariedEmployee("f", 3)
        };
        double sum = 0.0;
        for (Employee e : payroll) {
            System.out.println(e + " → monthlyPay=" + e.monthlyPay());
            sum += e.monthlyPay();
        }
        System.out.println("Kaikki palkat: " + sum);
        System.out.println("payroll[0] = payroll[3]: " +
                           payroll[0].equals(payroll[3]));
    }
}