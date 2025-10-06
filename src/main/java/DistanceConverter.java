import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        boolean status = true;
        int choice;

        while(status)
        {
            System.out.println("\n\nMake a selection ");
            System.out.println("1, Kilos to Miles ");
            System.out.println("2, Miles to Kilos ");
            System.out.println("3, Exit ");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                {
                    System.out.println("Enter Kilos: ");
                    double kilos = sc.nextDouble();
                    double old = kilos;
                    kilos /= 1.60935;
                    System.out.println("Conversion Results: ");
                    System.out.println("Kilos: " + old);
                    System.out.println("Miles: " + kilos);
                    break;
                }
                case 2:
                {
                    System.out.println("Enter Miles: ");
                    double miles = sc.nextDouble();
                    double old = miles;
                    miles *= 1.60935;
                    System.out.println("Conversion Results: ");
                    System.out.println("Miles: " + old);
                    System.out.println("Kilos: " + miles);
                    break;
                }
                case 3:
                {
                    System.out.println("Goodbye!");
                    status = false;
                    break;
                }
            }
        }
    }
}
