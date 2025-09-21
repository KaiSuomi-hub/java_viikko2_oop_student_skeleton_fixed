package fi.viikko2.task01;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tehtävä 1: implementoi Person ja poista kommentit testausta varten.");
        Person[] people = { new Person("Ada",19), new Person("Linus",30), new Person("Ada",19) };
        System.out.println(people[0].equals(people[2]));
        System.out.println(people[0].birthday());
        System.out.println(people[0]);

        // 6. birthdayt ja muut tulostukset
        System.out.println(people[0]); // ennen syntymäpäivää
        people[0].birthday(); // syntymäpäivä +1
        System.out.println(people[0]); // jälkeen
        // Linuxin syntymäpäivä +1
        System.out.println(people[1].birthday()); // syntymäpäivä +1 ja tulostus
        // Testataan equals
        System.out.println("people[0] equals people[2]: " +
        people[0].equals(people[2]));
         // Testataan equals
        System.out.println("people[0] equals people[0]: " +
        people[0].equals(people[0]));
    }
}
