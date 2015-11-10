

/**
 * A car has a certain fuel efficiency and a certain amnount of fuel in the gas tank.
 * 
 * @author Noah Thompson
 * @version Version 1 9/10/15
 */
public class Car
{
    /** fuel efficiency if the car in miles per gallon (mpg) */
    private double fuelEfficiency;
    
    /** amount of fuel left in the car's tank in gallons */
    private double fuelInTank;

    /**
     * Constructor for objects of class Car that specifies the fuel efficiency
     */
    public Car(double fuelEfficiency)
    {
        // initialise instance variables
        this.fuelEfficiency = fuelEfficiency;
        this.fuelInTank = 0;
    }

    /**
     * Simulates driving the car the specified distance and reduces the amount of fuel in the tank.
     *    
     * @pre        specified distance cannot result in the comsumption of more gas than is avalible
     * @param    distance that the car drives in miles
     * @return    description of the return value
     */
    public void drive(double distance)
    {
        this.fuelInTank -= distance / this.fuelEfficiency;
    }

    /**
     * Returns the amount of gas in the car's tank in unitss of gallons
     * 
     * @return  Returns the amount of gas in the car's tank in unitss of gallons
     */
    public double getGasInTank()
    {
        return this.fuelInTank;
    }
    
    /**
     * Increments the fuel in the car's tank by the specifified amount in gallons
     *
     * @pre gallonsOfGas must be a positive number
     * @parem gallonsOfGas amount of gas to add to the car's tank in gallons
     */
    public void addGas(double gallonsOfGas)
    {
        fuelInTank += gallonsOfGas;
    }


    
}
