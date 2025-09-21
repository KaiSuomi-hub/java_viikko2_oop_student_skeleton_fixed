/**
 * Tehtävä 4 – Shape-hierarkia (perintä)
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Perusluokka, jossa area() palauttaa 0.0.
 *  2. toString() voi palauttaa "Shape".
 *
 * VINKIT:
 *  - Aliluokissa Rectangle/Circle tehdään varsinainen logiikka.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task04;
import java.util.Objects;
//17. Luo luokka Shape, jossa metodi double area() { return 0; } ja toString()
public class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public double area() {
        return 0.0;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shape)) return false;
        Shape other = (Shape) o;
        return Objects.equals(this.name, other.name);
    }
}