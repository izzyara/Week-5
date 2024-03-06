import java.util.*;
public class Sleep
{
    public static void main (String[] args)
    {
    int birthYear;
    int birthMonth;
    int birthDay;
    int year;
    int month;
    int day;
        
    System.out.println("Enter your birthdate: ");
    Scanner input = new Scanner(System.in);
    System.out.print("Year: ");
    birthYear = input.nextInt();
    System.out.print("Month: ");
    birthMonth = input.nextInt();
    System.out.print("Day: ");
    birthDay = input.nextInt();
    
    System.out.println("Enter today's date: ");
    System.out.print("Year: ");
    year = input.nextInt();
    System.out.print("Month: ");
    month = input.nextInt();
    System.out.print("Day: ");
    day = input.nextInt();
    input.close();

    int liveDays;
    int liveYears;
    int liveMonths;

    liveYears = (year-birthYear);
    liveMonths = (12-birthMonth) + (12*liveYears) + month;
    liveDays = 30*liveMonths;

    System.out.println("You have been alive for " + liveDays + " days");

    int sleepHours = (24*liveDays)/3;

    System.out.println("You have slept for " + sleepHours + " hours");

    }
}