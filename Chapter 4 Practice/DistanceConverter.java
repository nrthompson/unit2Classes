public class DistanceConverter
{
   public static final int FEET_IN_A_YARD = 3;
   public static final int INCHES_IN_A_FOOT = 12;
   
   public static void main(String[] args)
   {
      double yards = 3.5;
      double feet = yards * FEET_IN_A_YARD;
      double inches = feet * INCHES_IN_A_FOOT;
      
      System.out.println(yards + "yards are" + feet + "feet");
      System.out.println(yards + "yards are" + inches + "inches");
   }
}