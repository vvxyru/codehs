public class PickupWindow extends ConsoleProgram
{
    public void run()
    {
        String menu = "1. Hamburger\n2. Cheeseburger\n3. Veggie Burger\n4. Nachos\n5. Hot Dog\n";
        
        System.out.println(menu);
        
        String customerOrder = readLine("Enter label: ");
        
        // I have no clue what this does ngl
        String combo = customerOrder.substring(0, 1);
        
        // This too i hate java
        Integer comboNumber = Integer.valueOf(combo);
        
        System.out.println("Customer ordered number " + comboNumber);
        
    }
}

