//Implements is used when a class wants to implement an interface.

public class Fruit implements Produce {
    //These attributes are protected so that they can only be accessed within their own package and subclasses in other packages.
    protected String name;

    protected double weight;

    protected double pricePerPound;

    protected boolean ripe;

    //Constructor
    public Fruit (String name, double weight, double pricePerPound, boolean ripe) {
        this.name = name;
        this.weight = weight;
        this.pricePerPound = pricePerPound;
        this.ripe = ripe;
    }
    //getter/setter methods for name
    public void setName (String name) {
        this.name = name;
    }
    public String getName () {
        return name;
    }

    //getter/setter methods for setWeight
    public void setWeight (double weight) {
        this.weight = weight;
    }
    public double getWeight () {
        return weight;
    }

    //getter/setter methods for pricePerPound
    public void setPricePerPound (double pricePerPound) {
        this.pricePerPound = pricePerPound;
    }
    public double getPricePerPound () {
        return pricePerPound;
    }

    //getter/setter methods for ripe
    public void setRipe (boolean ripe) {
        this.ripe = ripe;
    }
    public boolean getRipe () {
        return ripe;
    }

    //two methods
    /*the first method must make some sort of calculation, using user input. This method called price() takes the user input weight and multiplies it by the user
    input pricePerPound to get the price.*/
    public String price() {
        double price = weight * pricePerPound;
        return name + " is " + weight + "lbs " + " and at" + pricePerPound + " the cost will be " + price;
    }
    /*the second method must modify an object's state or attributes in some way, using user input. This method called ripen() takes the user input
    boolean of ripe and then feeds it through an if/else statement so that it will say something different if it's ripe or not ripe.*/
    public String ripen() {
        boolean condition = ripe;
        if (ripe==true) {
            // Code to execute if the fruit is ripe.
            return "The " + name + " is ripe.";
        } else {
            // Code to execute if the fruit is not ripe.
            return "The " + name + " is not ripe.";
        }
    }

    //a toString method. It returns a String representation of an object. Instead of the default hashcode, you can make it print meaningful output.
    @Override
    public String toString() {
        return "Fruit: " + name + ", weight: " + weight + "lbs, price per pound: $" + pricePerPound + ", Ripe?: " + ripe;
    }
}
