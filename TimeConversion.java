import java.util.*;
public class TimeConversion
{
    public static void main (String[] args)
    {
    int minutes;
    int second;
    int tenSecond;
    int hour;

    Scanner input = new Scanner(System.in);
    System.out.print("Enter the time in minutes: ");
    minutes = input.nextInt();
    input.close();
 
    second = minutes%60;
    hour = minutes/60;
    tenSecond = (minutes - second)%60;

    System.out.println("The time is: " + hour + ":" + tenSecond + second);
    }
}