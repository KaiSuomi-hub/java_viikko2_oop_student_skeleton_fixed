/**
 * Tehtävä 3 – BankAccount (kapselointi, konstruktorit, toString, equals)
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Kentät: accountNumber (String), balance (double).
 *  2. Konstruktori: jos initialBalance < 0 -> nollaa.
 *  3. `deposit(amount)` ja `withdraw(amount)` säännöillä.
 *  4. `toString()` ja `equals(Object)` (tilinumero).
 *
 * VINKIT:
 *  - equals: pelkkä tilinumero riittää; vältä double-vertailua.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task03;
import java.util.Objects;
public class BankAccount {

    // 11. kentät accountNumber ja balance tai paremmin fieldit
    private String accountNumber;
    private double balance;
    // 12. Konstruktori: jos initialBalance < 0 -> nollaa.
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance < 0 ? 0 : initialBalance;
    }
    // 13. deposit(amount): talleta summa, jos amount > 0, palauta uusi saldo
    public boolean deposit(double amount) {
        if (amount <= 0) {
            return false; // ei sallita nollaa tai negatiivista
        }
        balance += amount;
        return true;
    }
    // 13. withdraw(amount): nosta summa, jos amount > 0 ja riittää saldo, palauta uusi saldo
    public boolean withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            return false; // ei sallita negatiivista tai yliottoa
        }
        balance -= amount;
        return true;
    }
    // 14. getBalance(): palauttaa saldon
    public double getBalance() {
        return balance;
    }
    @Override
    public String toString(){
        //  Toteuta ja palauta merkkijono. Kun olet valmis, POISTA alla oleva rivi.
        return "BankAccount{accountNumber='" + accountNumber + "', balance=" + balance + "}";
    }

    @Override
    public boolean equals(Object o){
        //  Toteuta ja palauta merkkijono. Kun olet valmis, POISTA alla oleva rivi.
        if (this == o) return true;
        if (!(o instanceof BankAccount))
            return false;
        BankAccount other = (BankAccount) o;
        return Objects.equals(this.accountNumber, other.accountNumber);
    }
}
