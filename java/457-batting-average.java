// BaseballPlayer.java
public class BaseballPlayer
{
    private int hits;
    private int atBats;
    private String name;
    
    public BaseballPlayer(String theName, int theHits, int theAtBats)
    {
        name = theName;
        hits = theHits;
        atBats = theAtBats;
    }
    
    public double getBattingAverage()
    {
        double avg = (double) hits / atBats;
        return avg;
    }
    
    public String toString()
    {
        return name + ": " + hits + "/" + atBats;
    }
    
}

// BaseballTester.java
public class BaseballTester extends ConsoleProgram
{
    public void run()
    {
        BaseballPlayer babeRuth = new BaseballPlayer("Babe Ruth", 2873, 8399);
        System.out.println(babeRuth);
        System.out.println(babeRuth.getBattingAverage());
    }
}
