package exercise4;

public class BankAccount {

  public double balance;
  public int fuelLevel;
  public double mileage;
  public String name;
  public String surname;
  public int accountNumber;
  public int limit;



  public BankAccount(String name, String surname, int accountNumber, double balance, int limit) {
      this.name = name;
      this.surname = surname;
      this.accountNumber = accountNumber;
      this.balance = balance;
      this.limit = limit;
  }

  public void withdraw(int amount) {
      if (amount > limit) {
          System.out.println("You can't withdraw more than "+limit);
      } else if (amount > balance) {
          System.out.println("You can't withdraw more than "+balance);
      } else {
          balance -= amount;
      }


  }

  public void deposit(int geld) {
      balance += geld;
  }


  public String toString() {
      return " Name: " + name + ", Nachname: " + surname + ", Kontonummer: " + accountNumber + ", Kontostand: " + balance + ", Limite: " + limit;
  }
}
