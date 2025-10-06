import java.util.Scanner;

public class TimeConverter
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double hours, secs, mins, hours1, mins1, total;

        System.out.println("Enter # of Hours: ");
        hours = sc.nextDouble();
        System.out.println("Enter # of Minutes: ");
        mins = sc.nextDouble();
        System.out.println("Enter # of Seconds: ");
        secs = sc.nextDouble();

        hours1 = hours * 3600;
        mins1 = mins * 60;
        total = hours1 + mins1 + secs;

        System.out.println("(3600 * " + hours + " Hours)" + " +" + " (60 * " + mins + " Minutes)" + " +" + " (1 * " + secs + " Seconds)" + " = " + total + " Seconds");
    }
}