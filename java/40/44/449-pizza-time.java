// Pizza.java
public class Pizza
{
    private String type;
    private String toppings;
    private int size;
    
    public Pizza(String theType, String theToppings, int theSize)
    {
        type = theType;
        toppings = theToppings;
        size = theSize;
    }
    
    public String toString()
    {
        return type + " " + toppings + " " + size + " inch.";
    }
}

// PizzaTester.java
public class PizzaTester extends ConsoleProgram
{
    public void run()
    {
        Pizza pizzaTest1 = new Pizza("Classic", "Pepperoni", 14);
        Pizza pizzaTest2 = new Pizza("Deluxe", "Cheese", 16);
        Pizza pizzaTest3 = new Pizza("Ultra", "Pinnaple", 18);
        
        System.out.println(pizzaTest1);
        System.out.println(pizzaTest2);
        System.out.println(pizzaTest3);
    }
}
