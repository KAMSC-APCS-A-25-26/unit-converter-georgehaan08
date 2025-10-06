
import java.util.Scanner;

public class TempConverter
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Boolean status = true;
        Double cel, fah;
        while (status)
        {
            System.out.println("\n\n\nChoose an option:");
            System.out.println("1: Fahrenheit to Celsius");
            System.out.println("2: Celsius to Fahrenheit");
            System.out.println("3: Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.print("Enter degrees fahrenheit: ");
                    fah = sc.nextDouble();
                    cel = (fah - 32) * 5 / 9;
                    System.out.println(cel);
                    break;

                case 2:
                    System.out.print("Enter degrees celsius: ");
                    cel = sc.nextDouble();
                    fah = (cel * 9 / 5) + 32;
                    System.out.println(fah);
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