import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double height =0.0;
        double width = 0.0;
        double area = 0.0;
        double perimeter = 0.0;
        double diagonal = 0.0;

        String trash = "";
        boolean done = false;



        do {
            System.out.printf("Enter the height of the rectangle: ");

            if (in.hasNextDouble()) {
                height = in.nextDouble();
                in.nextLine();
                done = true;

            } else {
                trash = in.nextLine();
                System.out.println("You Enter an invalid input: " + trash);
            }
        }while (!done);

        do {
            System.out.printf("Enter the width of the rectangle: ");

            if (in.hasNextDouble()) {
                width = in.nextDouble();
                in.nextLine();
                done = true;

            } else {
                trash = in.nextLine();
                System.out.println("You Enter an invalid input: " + trash);
            }
        }while (!done);
        area = height * width;
        perimeter = 2*(height + width);
        diagonal = Math. sqrt(height * height + width * width);

        System.out.println("The area of the rectangle is : " + area);
        System.out.println("The parameter of the rectangle is : " + perimeter);
        System.out.println("The diagonal length of the rectangle is : " + diagonal);



    }
}
