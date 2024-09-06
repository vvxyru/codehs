public class CoinFlips extends ConsoleProgram
{
    public static final int FLIPS = 100;
    public static int h = 0;
    public static int t = 0;

    
    public void run()
    {
        // reset variable each run because the test cases will save the
        // previous values from each test case for some reason
        h = 0;
        t = 0;
        
        for (int i = 0; i < FLIPS; i++)
        {
            if (Randomizer.nextBoolean())
            {
                System.out.println("heads");
                h++;
            }
            else
            {
                System.out.println("tails");
                t++;
            }
        }
        System.out.println("heads: " + h);
        System.out.println("tails: " + t);
        
        // divides h and t by float point value, so it can be assinged
        // to a float variable
        
        float hf = h / 100f;
        float tf = t / 100f;
        
        System.out.println("% heads: " + hf);
        System.out.println("% tails: " + tf);
    }
}
