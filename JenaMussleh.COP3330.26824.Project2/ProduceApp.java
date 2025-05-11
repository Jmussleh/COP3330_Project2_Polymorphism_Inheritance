/*Jena Mussleh COP 3330 26824 February 2, 2025
This program models different types of fruits using inheritance and polymorphism.
It categorizes fruits into different types and allows dynamic behavior based on their unique characteristics.
The user does not manually enter input; instead, objects are instantiated in ProduceApp.java with predefined values.
For each fruit object, the program prints the following:
Fruit Details (toString())
Price Calculation (price())
Ripeness Check (ripen())*/

//ProduceApp will create fruit objects and demonstrate polymorphism, inheritance, and overriding.

public class ProduceApp {
    public static void main(String[] args) {
        //Instantiates objects of the child class Citrus.
        Citrus Orange = new Citrus("Orange", 2.20, 2.99, true);
        Citrus Grapefruit = new Citrus("Grapefruit", 4.65, 4.99, false);
        Citrus Lemon = new Citrus("Lemon", 2.20, 0.99, true);

        //Instantiates objects of the child class Berries.
        Berries Strawberries = new Berries("Strawberries", 4.00, 3.99, false);
        Berries Blackberries = new Berries("Blackberries", 3.20, 5.99, false);
        Berries Blueberries = new Berries("Blueberries", 2.00, 2.99, true);

        //Demonstrates polymorphism by having Fruit reference with child class objects.
        Fruit[] fruits = {Orange, Grapefruit, Lemon, Strawberries, Blackberries, Blueberries};

        //Going to loop through the fruit array to demonstrate polymorphic behavior.
        for (Fruit fruit : fruits) {
            System.out.println(fruit.toString());
            System.out.println(fruit.price());
            System.out.println(fruit.ripen());
        }
    }
}

