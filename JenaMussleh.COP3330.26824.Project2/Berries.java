/*The Berries class is the child class and inherits all public and protected fields and methods from the
Fruit parent class*/

public class Berries extends Fruit {
    //Constructor
    public Berries(String name, double weight, double pricePerPound, boolean ripe) {
        super(name, weight, pricePerPound, ripe);
    }

    /*This is the override of the price() method that was in the parent Fruit class. The new price() method is for the Berries child class. This method called price()
    takes the user input of weight and makes it into an integer. Then the numberOfPackages is multiplied by the user input pricePerPound to get the price per package.
    A string is returned.*/
    @Override
    public String price() {
        //Berries are typically sold per package.
        //The typical package of berries is around one pound.
        int numberOfPackages = ((int) weight);
        double price = numberOfPackages * pricePerPound;
        return "There are " + numberOfPackages + " packages of " + name + "(s) and it will cost $" + price;
    }

    /*This is the override of the ripen() method that was in the parent Fruit class. The new ripen() method is for the Berries child class. This method called ripen() takes the
    user input boolean of ripe and then feeds it through an if/else statement so that it will say something different if it's ripe or not ripe. A string is returned.*/
    @Override
    public String ripen() {
        boolean condition = ripe;
        if (ripe == true) {
            // Code to execute if ripe is set to true.
            return "The " + name + "(s) are ripe so they are more fleshy.";
        } else {
            // Code to execute if ripe is set to false.
            return "The " + name + "(s) are not ripe so they are too firm.";
        }
    }
    //This is the override of the toString() method that was in the parent Fruit class. The new toString() method is for the Berries child class.
    @Override
    public String toString() {
        return "The " + name + " is/are a berry type of fruit, the weight of each package is around one pound, price per pound: $" + pricePerPound + ", Ripe?: " + ripe;
    }
}

