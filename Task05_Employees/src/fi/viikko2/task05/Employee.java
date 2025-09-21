/**
 * Tehtävä 5 – Employee
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Perusluokka name-kentällä.
 *  2. monthlyPay() palauttaa 0.
 *  3. toString() ja equals(Object).
 *
 * VINKIT:
 *  - equals: sama nimi + sama alatyyppi.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task05;

import java.util.Objects;
//22. paketti fi.viikko2.task05. Perusluokka Employee(name).

public class Employee {
    // TODO: protected String name;
    // TODO: public Employee(String name){ ... }
    protected String name;

    public Employee(String name) {
        this.name = name;
    }
//24. Lisää metodi double monthlyPay() Employeeen (palauttaa 0) ja ylikirjoita aliluokissa.

    public double monthlyPay() {
        return 0.0; // Default implementation, should be overridden in subclasses
    }
    @Override
    public String toString(){ return "Employee{name='" + name + "'}"; }
//25. Ylikirjoita toString() ja equals(Object) (esim. sama nimi + sama alatyyppi).

    @Override
    public boolean equals(Object o) {
   if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee other = (Employee) o;
        // Sama nimi ja sama alatyyppi
        return Objects.equals(this.name, other.name) &&
               this.getClass().equals(other.getClass());

    }
}