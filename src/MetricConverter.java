import java.util.Scanner;

public class MetricConverter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double metersMeasurement = 0.0;
        double miles = 0.0;
        double feet = 0.0;
        double inches = 0.0;

        String trash = "";


        System.out.printf("Enter an measurement in Meters : ");
        if(in.hasNextDouble())
        {
            metersMeasurement = in.nextDouble();
            in.nextLine();

        }
        else
        {
            trash = in.nextLine();
            System.out.println("You Enter An Invalid Measurement!!: " + trash);
            System.exit(0);
        }

        miles = metersMeasurement * 0.000621;
        feet = metersMeasurement * 3.281;
        inches = metersMeasurement * 39.37;

        System.out.println("The " + metersMeasurement + " meters to mile conversion is : " +miles);
        System.out.println("The " + metersMeasurement + " meters to feet conversion is : " +feet);
        System.out.println("The " + metersMeasurement + " meters to Inches conversion is : " +inches);


    }
}
