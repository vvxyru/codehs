// Player.java
public class Player 
{
    // Static Variables
    // ...
    
    public static int totalPlayers = 0;
    public static int maxPlayers = 10;
    
    // Public Methods
    public Player() 
    {
        // Some code here...
        totalPlayers += 1;
    }
    
    // Static Methods 
    // ...
    public static boolean gameFull()
    {
        if (totalPlayers >= maxPlayers)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
