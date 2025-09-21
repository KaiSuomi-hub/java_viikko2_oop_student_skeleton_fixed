/**
 * Tehtävä 4 – Rectangle
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Kentät: width, height.
 *  2. Konstruktori.
 *  3. Ylikirjoita area(), toString(), equals().
 *
 * VINKIT:
 *  - Muista @Override.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task04;

public class Rectangle extends Shape {
    private double width;
        private double height;

        public Rectangle(String name, double width, double height) {
            super(name);
            this.width = width;
            this.height = height;
        }
// 18. Luo aliluokat Rectangle(width, height) ja Circle(radius). Ylikirjoita area().
    @Override
    public double area(){
        //  Toteuta ja palauta merkkijono. Kun olet valmis, POISTA alla oleva rivi.
        if (width <= 0 || height <= 0) return 0.0;
        return width * height;
    }

    @Override

    public String toString(){
        //  Toteuta ja palauta merkkijono. Kun olet valmis, POISTA alla oleva rivi.
        return "Rectangle{" + "width=" + width + ", height=" + height + ", area=" + area() + "}";
    }
// 19. Toteuta equals(Object) jokaisessa luokassa vertaamaan oleellisia mittoja ja tyyppiä.
    @Override
    public boolean equals(Object o){
        //  Toteuta ja palauta merkkijono. Kun olet valmis, POISTA alla oleva rivi.
    if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;
        Rectangle other = (Rectangle) o;
        return Double.compare(width, other.width) == 0 &&
               Double.compare(height, other.height) == 0;
    }}