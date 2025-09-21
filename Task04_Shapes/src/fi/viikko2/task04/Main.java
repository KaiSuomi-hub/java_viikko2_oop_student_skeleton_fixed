/**
 * Tehtävä 4 – Main
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Luo Shape[] ja laske kokonaispinta-ala.
 *  2. Tulosta toString()-arvot.
 *
 * VINKIT:
 *  - Toteuta aliluokat ensin.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task04;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tehtävä 4: implementoi Rectangle ja Circle ennen ajoa.");
        // 20. Luo taulukko Shape[] shapes = { ... } ja laske kokonaispinta-ala silmukassa.

           Shape[] shapes = {
            new Rectangle("Rectangle", 1, 2),
            new Circle("Circle", 1.0),
            new Rectangle("Rectangel2", 1, 3)
        };
        double totalArea = 0.0;
        for (Shape shape : shapes) {
            System.out.println(shape);
            totalArea += shape.area();
        }
        //21. Tulosta toString()-arvot ja kokonaispinta-ala.
        // siisti tulostus
        totalArea = Math.round(totalArea * 100.0) / 100.0;
    System.out.println("Silmukan muodostama kokonaisala: " + totalArea);
    }
}
