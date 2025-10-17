import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
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

        System.out.println("Time Converter:");
        System.out.println(hours + " hour + " + mins + " minute + " + secs + " second");
        System.out.println("Total seconds: " + (int) total + "\n\n");


        System.out.println("Calculation:");
        System.out.println(hours + " hours x 3600 = " + hours1 + " seconds");
        System.out.println(mins + " minutes x 60 = " + mins1 + " seconds");
        System.out.println(secs + " seconds x 1 = " + secs + " seconds");
        System.out.println("Total Seconds: " + (int) total);


    }
}
