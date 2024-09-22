private String getWinner(String user, String computer)
{
    String USER_PLAYER = "User wins!";
    String COMPUTER_PLAYER = "Computer wins!";
    String TIE = "Tie";
    
    // generic answer
    if (  user.equals("rock") &&  computer.equals("paper"))
    {
        return COMPUTER_PLAYER;
    }
    else if (  user.equals("rock") &&  computer.equals("scissors"))
    {
        return USER_PLAYER;
    }
    else if (  user.equals("paper") &&  computer.equals("scissors"))
    {
        return COMPUTER_PLAYER;
    }
    else if (  user.equals("paper") &&  computer.equals("rock"))
    {
        return USER_PLAYER;
    }
    else if (  user.equals("scissors") &&  computer.equals("rock"))
    {
        return COMPUTER_PLAYER;
    }
    else if (  user.equals("scissors") &&  computer.equals("paper"))
    {
        return USER_PLAYER;
    }
    else
    {
        return TIE;
    }
}

/* really optimized answer with hashmap 3 lines

    HashMap<String, String> strength = new HashMap<String, String>() {{
        put("rock", "scissors"); put("paper", "rock"); put("scissors", "paper"); }};
    // used chatgpt to figure out how to put all returns in one line
    return user.equals(computer) ? "Tie" : strength.get(user).equals(computer) ? "User wins!" : "Computer wins!";
    
*/

/* one line

    return user.equals(computer) ? "Tie" : new HashMap<String, String>() {{ put("rock", "scissors"); put("paper", "rock"); put("scissors", "paper"); }}.get(user).equals(computer) ? "User wins!" : "Computer wins!";

*/
