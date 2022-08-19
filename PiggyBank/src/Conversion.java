import java.util.Scanner;
public class Conversion {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int totalPennies;
        System.out.println("How many pennies do you have in your piggy bank?");
        totalPennies = keyboard.nextInt();
        convertPennies(totalPennies);
        keyboard.close();

    }

        public static void convertPennies(int totalPennies){
        int pennies, nickels, dimes, quarters, dollars;

        dollars = totalPennies / 100;
        pennies = totalPennies % 100;

        quarters = pennies / 25;
        pennies = pennies % 25;

        dimes = pennies / 10;
        pennies = pennies % 10;

        nickels = pennies / 5;
        pennies = pennies % 5;

        System.out.println("Your original piggy bank had "+ totalPennies + " pennies.");
        System.out.println("That means that you have: ");
        System.out.println("Dollars: " + dollars);
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + pennies);

        }


    }

