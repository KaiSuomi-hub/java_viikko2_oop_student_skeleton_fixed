/**
 * Tehtävä 6 – SportsCar (eri paketti, perii Vehicle)
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Perii Vehicle.
 *  2. Kenttä horsepower.
 *  3. Konstruktori kutsuu yliluokan konstruktoria, super(...).
 *  4. toString() käyttää brand-kenttää (protected).
 *
 * VINKIT:
 *  - Älä käytä mileagea täällä: se on package-private (eri paketti).
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */
package fi.viikko2.task06.sub;

import fi.viikko2.task06.model.Vehicle;

public class SportsCar extends Vehicle {
    // lisätään hp
    private int horsepower;

    // konstruktori joka kutsuu yliluokan konstruktoria ja lisää horsepowerin
    public SportsCar(String brand, int horsepower, int mileage) {
        super(brand, mileage);
        this.horsepower = horsepower;
    }

    // Overloaded konstruktori ilman mileagea, asettaa mileage=0 ja horsepower=0
    public SportsCar(String brand) {
        super(brand, 0);
        this.horsepower = 0;
    }

    public int getHorsepower() {
        return horsepower;
    }

    @Override
    // ei päästä mileagea käyttöön, koska se on package-private
    public String toString() {
        return "SportsCar{brand='" + brand + "', horsepower=" + horsepower + "}";
    }
}
