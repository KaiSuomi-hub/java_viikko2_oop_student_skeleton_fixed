/**
 * Tehtävä 4 – Circle
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Kenttä radius.
 *  2. Konstruktori.
 *  3. Ylikirjoita area(), toString(), equals().
 *
 * VINKIT:
 *  - Area = Math.PI * r * r.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task04;
import java.util.Objects;

public class Circle extends Shape {
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }
// 18. Luo aliluokat Rectangle(width, height) ja Circle(radius). Ylikirjoita area().
    @Override
    public double area(){
        //  Toteuta ja palauta merkkijono. Kun olet valmis, POISTA alla oleva rivi.
          if (radius <= 0) return 0.0;
        return Math.PI * radius * radius;
    }
    @Override
    public String toString(){
        //  Toteuta ja palauta merkkijono. Kun olet valmis, POISTA alla oleva rivi.
        return "Circle{" + "radius=" + radius + ", area=" + area() + "}";
    }
// 19. Toteuta equals(Object) jokaisessa luokassa vertaamaan oleellisia mittoja ja tyyppiä.
    @Override
    public boolean equals(Object o) {
        //  Toteuta ja palauta merkkijono. Kun olet valmis, POISTA alla oleva rivi.
        return "Circle{" + "radius=" + radius + ", area=" + area() + "}";

    }
}