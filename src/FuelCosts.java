import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double tankSize = 0.0;
        double fuelEfficiency = 0.0;
        double pricePerGallon = 0.0;
        double priceFor100 = 0.0;
        double howFarFullTank= 0.0;

        String trash = "";
        boolean done = false;


        do {

            System.out.printf("Enter fuel efficiency of your car in miles: ");


            if (in.hasNextDouble()) {
                fuelEfficiency = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You must enter a valid Number not: " + trash);
            }

        } while (!done);

        do {
            System.out.printf("Enter the number of gallons of gas the Tank Hold: ");

            if (in.hasNextDouble()) {
                tankSize = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("You must enter a valid Number not: " + trash);
            }

        } while (!done);


            do {

                System.out.printf("Enter the price of gas per gallon: ");


                if (in.hasNextDouble()) {
                    pricePerGallon = in.nextDouble();
                    in.nextLine();
                    done = true;
                }
                else
                {
                    trash = in.nextLine();
                    System.out.println("You must enter a valid number not: " + trash);
                }

            } while (!done);

            priceFor100 = 100.0 / fuelEfficiency * pricePerGallon;
            howFarFullTank = tankSize * fuelEfficiency;

        System.out.println("The Car can go 100 mile for " + priceFor100 + " dollars");
        System.out.println("The Car can go " + howFarFullTank + " miles on full tank");






        }
    }
