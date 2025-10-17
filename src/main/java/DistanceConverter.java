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
            System.out.println("Choose conversion direction:");
            System.out.println("1: Convert Miles to Kilometers");
            System.out.println("2: Convert Kilometers to Miles");
            System.out.println("3: Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.print("Enter Miles: ");
                    mi = sc.nextDouble();
                    km = mi * 1.60935;
                    System.out.println("Conversion Results: ");
                    System.out.println("Miles: "+ mi);
                    System.out.println("Kilometers: " + km);
                    break;

                case 2:
                    System.out.print("Enter Kilometers: ");
                    km = sc.nextDouble();
                    mi = km / 1.60935;
                    System.out.println("Kilometers: "+ km);
                    System.out.println("Miles: " + mi);
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
