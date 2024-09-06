public class LongestStreak extends ConsoleProgram
{
    public static final int FLIPS = 100;
    public static int hstreak = 0;
    public static int hmaxstreak = 0;
    
// O(n) runtime
    
    public void run()
    {
        hstreak = 0;
        hmaxstreak = 0;
        
        for (int i = 0; i < FLIPS; i++)
        {
            if (Randomizer.nextBoolean())
            {
                System.out.println("Heads");
                hstreak++;

                if (hstreak > hmaxstreak)
                {
                    hmaxstreak = hstreak;
                }
            }
            else
            {
                System.out.println("Tails");
                hstreak = 0;
            }
        }
        System.out.println("Longest streak of heads: " + hmaxstreak);
    }
}
