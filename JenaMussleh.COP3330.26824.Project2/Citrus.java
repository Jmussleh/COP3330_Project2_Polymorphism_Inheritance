/*The Citrus class is the child class and inherits all public and protected fields and methods from the
Fruit parent class*/

public class Citrus extends Fruit {
    //Constructor
    public Citrus(String name, double weight, double pricePerPound, boolean ripe) {
        super(name, weight, pricePerPound, ripe);
    }

    /*This is the override of the price() method that was in the parent Fruit class. The new price() method is for the Citrus child class.
    This method called price() takes the user input of weight and divides it by 0.6 which is the average weight of a piece of citrus.
    Then the numberOfCitrus is multiplied by the price of 0.99 cents. A string is returned.*/
    @Override
    public String price() {
        //Citrus is typically sold per item.
        //Weight in pounds divided by 0.6lbs because the average orange is 0.6lbs.
        double numberOfCitrus = Math.round(weight / 0.6);
        //The average cost of a piece of citrus is 0.99 cents.
        double price = Math.round(numberOfCitrus * 0.99);
        return "There are " + numberOfCitrus + " " + name + "(s)" + " so the cost will be about $" + price;
    }

    /*This is the override of the ripen() method that was in the parent Fruit class. The new ripen() method is for the Citrus child class. This method called ripen() takes the
    user input boolean of ripe and then feeds it through an if/else statement so that it will say something different if it's ripe or not ripe. A string is returned.*/
    @Override
    public String ripen() {
        boolean condition = ripe;
        if (ripe == true) {
            // Code to execute if ripe is set to true.
            return "The " + name + " is ripe so there is less acidity and more sweetness.";
        } else {
            // Code to execute if ripe is set to false.
            return "The " + name + " is not ripe so there is less sweetnesss and more acidity.";
        }
    }
    //This is the override of the toString() method that was in the parent Fruit class. The new toString() method is for the Citrus child class.
    @Override
    public String toString() {
        return "The " + name + " is a citrus fruit, the weight is: " + weight + "lbs, price per pound: $" + pricePerPound + ", Ripe?: " + ripe;
    }
}
