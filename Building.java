import java.util.*;
public class Building
{
    public static void main (String[] args)
    //Isabelle Arabe, 3/13, Building
    {
    int numPoles;
    double volume;
    double volumeTotal;


    Scanner input = new Scanner(System.in);
    System.out.print("Enter how many poles needed: ");
    numPoles = input.nextInt();
    
    input.close();

    volume = 3.14*(1.5*1.5)*5;
    volumeTotal = volume*numPoles;

    double volumeYards = volumeTotal/27;
    double cost = volumeYards*12.98;

    System.out.println("Total cost: $" + cost);

    }
}
