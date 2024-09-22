// Dragon.java
public class Dragon 
{
    private String atk;
    private int lvl;
    
    // Write the constructor here!
    public Dragon(int level, String attack)
    {
        lvl = level;
        atk = attack;
    }
    
    // Put getters here
    public int getLevel()
    {
        return lvl;
    }
    
    public String getAttack()
    {
        return atk;
    }
    
    // Put other methods here
    public String fight()
    {
        StringBuilder fightString = new StringBuilder();
        
        for (int i = 0; i < lvl; i++)
        {
            fightString.append(atk);
        }
        
        return fightString.toString();
    }
    
    // String representation of the object
    public String toString()
    {
        return "Dragon is at level " + lvl + " and attacks with " + atk;
    }
}
