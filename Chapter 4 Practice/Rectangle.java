import java.util.Scanner;

/**
 * This program will prompt the user for the lengths of a rectangle's sides.
 */
public class Rectangle
{
    public static void main(String[] args)
    {
        //Prompt for finding one side.
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("What is the length of one side of a rectangle? ");
        double oneSide = in.nextDouble();
        
        //Prompt for finding the other side.
        
        System.out.print("What is the length of the other side? ");
        double twoSide = in.nextDouble();
        
        final double FULL_SIDE_ONE = oneSide * 2;
        final double FULL_SIDE_TWO = twoSide * 2;
        
        //Make the necessary equations happen.
        
        double areaOfRectangle = FULL_SIDE_ONE * FULL_SIDE_TWO;
        double perimeterOfRectangle = FULL_SIDE_ONE + FULL_SIDE_TWO;
        double diagonalLength = (oneSide * oneSide) + (twoSide * twoSide);
        
        //Print out answers.
        
        System.out.printf("The area of the rectangle is ", areaOfRectangle);
        System.out.println();
        
        System.out.printf("The perimeter of the rectangle is ", perimeterOfRectangle);
        System.out.println();
        
        System.out.printf("The length of the diagonal is ", diagonalLength);
        System.out.println();
    }
}
        