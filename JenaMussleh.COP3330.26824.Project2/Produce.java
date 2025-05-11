/*An interface in Java is a blueprint for a class that defines methods but does not provide implementations for them. Allows for different variations of the methods in
different classes.*/

public interface Produce {
    //When this interface is implemented by another class is when we define ripen() and weight().
    String price();
    String ripen();
}
