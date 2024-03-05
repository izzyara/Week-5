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

    liveDays = 365*(year - birthYear) + 30*()
    }
}