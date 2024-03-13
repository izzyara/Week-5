import java.util.*;
public class Pythag
{
    public static void main (String[] args)
    //Isabelle Arabe, 3/13, Pyhtag
    {
    int m;
    int n;
    int side1;
    int side2;
    int hyp;

    Scanner input = new Scanner(System.in);
    System.out.print("Enter a positive integer: ");
    m = input.nextInt();
    System.out.print("Enter a positive integer (less than previous num): ");
    n = input.nextInt();
    
    input.close();

    side1 = (m*m)-(n*n);
    side2 = 2*m*n;
    hyp = m*m + n*n;
    System.out.println("Side 1: " + side1 +"\nSide 2: " + side2 + "\nHypotenuse: " + hyp);

    double cost;
    cost = 2.412*side1 + 3.767*side2 + 15.758*hyp;
    System.out.println("Total cost: $" + cost);

    }
}
