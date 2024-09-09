// Dragon.java
public class Dragon 
{
    private String name;
    private int level;
    private boolean fire;
    
    // Write the constructor here!
    public Dragon(String dragonName, int dragonLevel)
    {
        name = dragonName;
        level = dragonLevel;
        fire = (level >= 70);
    }
    
    // Put getters here
    public String getName()
    {
        return name;
    }
    
    public int getLevel()
    {
        return level;
    }
    
    public boolean isFireBreather()
    {
        return fire;
    }
    
    // Put other methods here
    
    public void attack()
    {
        if (fire)
        {
            System.out.println(
                ">>>>>>>>>>\n" +
                ">>>>>>>>>>>>>>\n" +
                ">>>>>>>>>>>>>>\n" +
                ">>>>>>>>>>"
            );
        }
        else
        {
            System.out.println("~ ~ ~");
        }
    }
    
    public void gainExperience()
    {
        if ((level += 10) >= 70)
        {
            fire = true;
        }
        else
        {
            fire = false;
        }
    }
    
    // String representation of the object
    public String toString()
    {
        return "Dragon " + name + " is at level " + level;
    }
}
