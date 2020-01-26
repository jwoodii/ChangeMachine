import java.util.Scanner;

/**
 * Ask for price and payment, output change amount and number of coins and dollars
 * 
 * @author Jeffery
 **/
public class ChangeMachine {
  public static void main(String[] args) {

    // open Scanner for input
    Scanner input = new Scanner(System.in);

    // Get price and amount paid and calc Change
    System.out.print("Price:");
    float price = input.nextFloat();
    System.out.print("Cash Paid:");
    float paid = input.nextFloat();
    float change = (paid - price);

    // close Scanner
    input.close();

    //Calculate Dollars and change Change to reflect the amount subtracted
    float changeD = (change * 100);
    int Dollars = (int) (changeD / 100);

    // Calculate Quarters and change Change to reflect such
    int changeQ = (int) (changeD - (Dollars * 100));
    int Quarters = (int) (changeQ / 25);

    // Calculate Dimes and change Change to Reflect such
    int changeDi = changeQ - (Quarters * 25);
    int Dimes = (int) (changeDi / 10);

    // Calculate Nickels and change Change to Reflect such
    int changeN = changeDi - (Dimes * 10);
    int Nickels = (int) (changeN / 5);

    // Calculate pennies
    int changeP = changeN - (Nickels * 5);
    int Pennies = (int) changeP;

    // Find total amount
    double Amount = (Dollars + (Quarters * .25) + (Dimes * .10) + (Nickels * .05) + (Pennies * .01));
    System.out.println("Total Amount: " + Amount);

    // Print amount to tender
    System.out.println("Dollars: " + Dollars);
    System.out.println("Quarters: " + Quarters);
    System.out.println("Dimes: " + Dimes);
    System.out.println("Nickels: " + Nickels);
    System.out.println("Pennies: " + Pennies);
  }

}
