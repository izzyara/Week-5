import java.util.*;
public class Election
{
    public static void main (String[] args)
    {
    int votes;
    double percent;
    int votes2;
    double percent2;

    Scanner input = new Scanner(System.in);
    System.out.print("Enter Candidate 1's # of votes: ");
    votes = input.nextInt();
    System.out.print("Enter Candidate 2's # of votes: ");
    votes2 = input.nextInt();
    input.close();
 
    percent = ((double)votes/(votes+votes2))*100;
    percent2 = ((double)votes2/(votes+votes2))*100;

    System.out.println("Candidate\tVotes  Percentage");
    System.out.println("Candidate 1   \t" + votes + "\t" + percent);
    System.out.println("Candidate 2   \t" + votes2 + "\t" + percent2);
    }
}