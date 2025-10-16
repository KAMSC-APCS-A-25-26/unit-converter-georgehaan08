import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        boolean status = true;
        int choice;

        while(status)
        {
            System.out.println("\n\nMake a selection ");
            System.out.println("1, Fahrenheit to Celsius ");
            System.out.println("2, Celsius to Fahrenheit ");
            System.out.println("3, Exit ");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                {
                    System.out.println("Enter degrees fahrenheit: ");
                    double fah = sc.nextDouble();
                    double old = fah;
                    fah -= 32;
                    fah *= (double) 5/9;
                    System.out.println("Conversion Results: ");
                    System.out.println("Fahrenheit: " + old);
                    System.out.println("Celsius: " + fah);
                    break;
                }
                case 2:
                {
                    System.out.println("Enter degrees celsius: ");
                    double cel = sc.nextDouble();
                    double old = cel;
                    cel *= (double) 9/5;
                    cel += 32;
                    System.out.println("Conversion Results: ");
                    System.out.println("Celsius: " + old);
                    System.out.println("Fahrenheit: " + cel);
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
