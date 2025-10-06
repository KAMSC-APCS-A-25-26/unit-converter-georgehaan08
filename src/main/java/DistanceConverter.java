import java.util.Scanner;

public class DistanceConverter
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Boolean status = true;
        Double km, mi;
        while (status)
        {
            System.out.println("\n\n\nChoose an option:");
            System.out.println("1: Miles to Kilometers");
            System.out.println("2: Kilometers to Miles");
            System.out.println("3: Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.print("Enter Miles: ");
                    mi = sc.nextDouble();
                    km = mi * 1.609344;
                    System.out.println(km);
                    break;

                case 2:
                    System.out.print("Enter Kilometers: ");
                    km = sc.nextDouble();
                    mi = km * 0.621371;
                    System.out.println(mi);
                    break;

                case 3:
                    status = false;
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Enter 1, 2, or 3");
            }
        }
    }
}