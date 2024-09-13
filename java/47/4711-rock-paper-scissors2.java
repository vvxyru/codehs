public class RockPaperScissors extends ConsoleProgram
{
    private static final String USER_PLAYER = "User wins!";
    private static final String COMPUTER_PLAYER = "Computer wins!";
    private static final String TIE = "Tie";
    private static String userInput = "";
    private static String computerInput = "";
    private static int randomNum = 0;
    
    private void getUser() {
        userInput = readLine("Enter your choice (rock, paper, or scissors): ");
    }
        
    private String getWinner(String user, String computer)
    {
        if (  user.equals("rock") && computer.equals("paper")) {
            return COMPUTER_PLAYER; }
        else if (  user.equals("rock") && computer.equals("scissors")) {
            return USER_PLAYER; }
        else if (  user.equals("paper") && computer.equals("scissors")) {
            return COMPUTER_PLAYER; }
        else if (  user.equals("paper") && computer.equals("rock")) {
            return USER_PLAYER; }
        else if (  user.equals("scissors") && computer.equals("rock")) {
            return COMPUTER_PLAYER; }
        else if (  user.equals("scissors") && computer.equals("paper")) {
            return USER_PLAYER; }
        else {
            return TIE; }
    }
    
    public void run()
    {
        while (true) {
            
            getUser();
            
            if (userInput.equals("")) {
                System.out.println("Thanks for playing!");
                break;
            }
            
            randomNum = Randomizer.nextInt(0, 2);
            
            computerInput = (randomNum == 0) ? "rock" : (randomNum == 1) ? "paper" : "scissors";
            
            System.out.println("User: " + userInput);
            System.out.println("Computer " + computerInput);
            System.out.println(getWinner(userInput, computerInput));
        }
    }
}
