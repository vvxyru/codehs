public class RockPaperScissors extends ConsoleProgram
{
    private static final String USER_PLAYER = "User wins!";
    private static final String COMPUTER_PLAYER = "Computer wins!";
    private static final String TIE = "Tie";
    private static String userInput = "";
    private static String computerInput = "";
    private static int randomNum = 0;
    
    // This will apply what the user inputs to the variable "userInput"
    private void getUser() {
        userInput = readLine("Enter your choice (rock, paper, or scissors): ");
    }
        
    // This checks whether the computer wins or the user wins, or tie
    // It first takes in the users choice ("String user") and the computers choice ("String computer")
    // And it goes through all the combinations of rock paper scissors and returns who wins or loses
    private String getWinner(String user, String computer)
    {
        // if user picks rock and computer picks paper, the computer wins
        if (  user.equals("rock") && computer.equals("paper")) {
            return COMPUTER_PLAYER; }
        // if user picks rock and computer picks scissors, player wins
        // and then it repeats for all the cases
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
        // if none of the cases return anything, then it means that the user and computer
        // have the same option so it returns tie
            return TIE; }
    }
    
    public void run()
    {
        // this while true will keep the game in a loop
        // until the player enters nothing, which is when it will break the loop
        // and end the code
        while (true) {
            
            getUser();
            
            // this checks if the user entered nothing, then
            // prints thanks for playing and breaks out of the while loop
            if (userInput.equals("")) {
                System.out.println("Thanks for playing!");
                break;
            }
            
            // random number generator which picks a random number for
            // the computer to pick
            randomNum = Randomizer.nextInt(0, 2);
            
            // if the random number is 0, sets the computerInput variable to rock
            // if the random number is 1, sets the computer Input variable to paper
            // and if its 2 then its scissors
            /* what the code would look like for if statements normally i just did it like this cuz im od
             * if (randomNum == 0) {
             *  computerInput = "rock";
             * }
             * else if (randomNum == 1) {
             *  computerInput == "paper";
             * }
             * else {
             *  computerInput == "scissors";
             * }
             */
            computerInput = (randomNum == 0) ? "rock" : (randomNum == 1) ? "paper" : "scissors";
            
            // prints out the userInput
            System.out.println("User: " + userInput);

            // prints out the computer input
            System.out.println("Computer " + computerInput);

            // uses the function getWinner using the userInput and computerInput
            // this will print out who wins
            System.out.println(getWinner(userInput, computerInput));
        }
    }
}

/* simplified walkthrough
 * starts a loop
 *  ask the user for rock paper or scissors
 *      if its just empty (player just presses enter), break out the loop and end the code
 *  picks a random number between 0 and 2
 *  if its 0, makes computers choice rock
 *  if its 1, makes it paper,
 *  else, make it scissors
 *  print out the user and computer input
 *  use a method 
 */
