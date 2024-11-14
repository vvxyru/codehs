public class Battleship extends ConsoleProgram
{
    private Player player;
    private Player computer;
    private int playerHits = 0;
    private int computerHits = 0;
    private int turn = 0;

    public Battleship() {
        this.player = new Player();
        this.computer = new Player();
    }
    
    public void run()
    {
        System.out.println("Welcome to battleship.");
        readLine("Press enter to begin.");
        clearScreen();  

        // player board setup
        // playerSetup();

        // TESTING: automatically place player ships
        player.chooseShipLocation(player.getShip(0), 2, 3, 0);  // Ship 0, Horizontal at (2, 3)
        player.chooseShipLocation(player.getShip(1), 4, 5, 1);  // Ship 1, Vertical at (4, 5)
        player.chooseShipLocation(player.getShip(2), 6, 7, 0);  // Ship 2, Horizontal at (6, 7)
        player.chooseShipLocation(player.getShip(3), 1, 2, 1);  // Ship 3, Vertical at (1, 2)
        player.chooseShipLocation(player.getShip(4), 8, 1, 0);  // Ship 4, Horizontal at (8, 1)


        // computer board setup at random
        computerSetup();

        System.out.println("Your ships:");
        player.printMyShips();

        System.out.println();

        // TESTING: show computers ships
        System.out.println("Computer's ships:");
        computer.printMyShips();
        System.out.println();

        readLine("Press enter to begin.");

        while (playerHits < 17 && computerHits < 17) {
            clearScreen();
            System.out.println("Turn " + (turn + 1));
            System.out.println();

            System.out.println("Computer Board:");
            computer.getOwnGrid().printStatus();
            System.out.println();

            System.out.println("Your Board:");
            player.getOwnGrid().printStatus();
            System.out.println();

            playerGuess(turn);

            System.out.println("Computer's turn:");
            computerGuess();

            readLine("Press enter to continue.");

            // TESTING: check win conditions
            //playerHits = 17;
            //computerHits = 17;
            turn++;
        }

        if (playerHits >= 17) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }
    }

    public void playerSetup() {
        for(int i = 0; i < 5; i++) {

            while (true) {

                int row = -1;
                int col = -1;
                int dir = -1;
                int colInput = -1;
                int rowInput = -1;
                String rowLetter = "";

                System.out.println("Placing ship #" + (i + 1) + " with length of " + player.getShipLength(i));

                player.printMyShips();

                dir = readInt("Enter direction (0 for horizontal, 1 for vertical): ");
                // test case to ensure that the input is valid
                // if direction is 0 (horizontal), ship column needs to length less than 10
                // ex. ship length is 5, column needs to be less than 6
                // if direction is 1 (vertical), ship row needs to be length less than 10
                // ex. ship length is 5, row needs to be less than 6
                if (dir == 0) {
                    while (row == -1) {
                        rowLetter = readLine("Enter row (A-J): ");
                        row = rowLetterToNumber(rowLetter); // Convert row letter to number
                    }

                    while (col == -1) {
                        colInput = readInt("Enter column (1-10): ");
                        if (colInput - 1 > 10 - player.getShipLength(i)) {
                            System.out.println("Invalid column. Try again.");
                            continue;
                        }
                        else {
                            col = colInput;
                        }
                    }

                    // Check if all horizontal spots are vacant
                    boolean isValid = true;
                    for (int x = col - 1; x < col - 1 + player.getShipLength(i); x++) {
                        if (player.getOwnGrid().hasShip(row, x)) {
                            clearScreen();
                            System.out.println("One or more spots are occupied. Try again.");
                            isValid = false;
                            break;
                        }
                    }
                    if (!isValid) continue;
                }

                else if (dir == 1) {
                    while (row == -1) {
                        rowLetter = readLine("Enter row (A-J): ");
                        rowInput = rowLetterToNumber(rowLetter); // Convert row letter to number
                        if (rowInput > 10 - player.getShipLength(i)) {
                            System.out.println("Invalid column. Try again.");
                            continue;
                        }
                        else {
                            row = rowInput;
                        }
                    }

                    while (col == -1) {
                        col = readInt("Enter column (1-10): "); 
                    }

                    // Check if all vertical spots are vacant
                    boolean isValid = true;
                    for (int y = row; y < row + player.getShipLength(i); y++) {
                        if (player.getOwnGrid().hasShip(y, col - 1)) {
                            clearScreen();
                            System.out.println("One or more spots are occupied. Try again.");
                            isValid = false;
                            break;
                        }
                    }
                    if (!isValid) continue;
                }
                player.chooseShipLocation(player.getShip(i), row, col - 1, dir);
                clearScreen(); 
                break;
            }
        }
    }

    public void computerSetup() {
        for (int i = 0; i < 5; i++) {
            boolean placed = false;

            while (!placed) {
                int dir = Randomizer.nextInt(2); // 0 for horizontal, 1 for vertical
                int row, col;

                if (dir == 0) { // Horizontal placement
                    row = Randomizer.nextInt(10);
                    col = Randomizer.nextInt(11 - computer.getShip(i).getLength()); // Ensures ship fits horizontally

                    // Check if all horizontal spots are vacant
                    boolean isValid = true;
                    for (int x = col; x < col + computer.getShip(i).getLength(); x++) {
                        if (computer.getOwnGrid().hasShip(row, x)) {
                            isValid = false;
                            break;
                        }
                    }

                    // Place the ship if valid
                    if (isValid) {
                        // Using the existing method to place the ship
                        computer.chooseShipLocation(computer.getShip(i), row, col, dir); 
                        placed = true;
                    }

                } else { // Vertical placement
                    row = Randomizer.nextInt(11 - computer.getShip(i).getLength());
                    col = Randomizer.nextInt(10);

                    // Check if all vertical spots are vacant
                    boolean isValid = true;
                    for (int y = row; y < row + computer.getShip(i).getLength(); y++) {
                        if (computer.getOwnGrid().hasShip(y, col)) {
                            isValid = false;
                            break;
                        }
                    }

                    // Place the ship if valid
                    if (isValid) {
                        // Using the existing method to place the ship
                        computer.chooseShipLocation(computer.getShip(i), row, col, dir); 
                        placed = true;
                    }
                }
            }
        }
    }

    public void playerGuess(int turn) {
        int row, col;

        while (true) {
            // Ask for player input for guess (row and column)
            String rowLetter = readLine("Enter row (A-J) to guess: ");
            row = rowLetterToNumber(rowLetter); // Convert row letter to number
            col = readInt("Enter column (1-10) to guess: ") - 1;  // Adjust for zero indexing
            System.out.println();

            // Check if the guess is valid
            if (row < 0 || row >= 10 || col < 0 || col >= 10) {
                System.out.println("Invalid guess. Try again.");
                continue;  // Exit method if invalid guess
            }
            else {
                break;
            }
        }

        // Determine if it's a hit or miss
        boolean hit = computer.getOwnGrid().hasShip(row, col);  // Check if there's a ship at that location

        // Mark the guess on the opponent's grid
        if (hit) {
            computer.getOwnGrid().markHit(row, col); // Mark as hit
        } else {
            computer.getOwnGrid().markMiss(row, col); // Mark as miss
        }

        clearScreen();  
        System.out.println("Turn " + (turn + 1));
        System.out.println();
        // Print the updated board showing guesses
        System.out.println("Your guess:");
        computer.getOwnGrid().printStatus();  // Use the existing printStatus method to display the board

        // Provide feedback to the player
        if (hit) {
            System.out.println("It's a hit!\n");
            playerHits++;
        } else {
            System.out.println("It's a miss.\n");
        }
    }

    public void computerGuess() {
        // print out the computers guess
        // and if it was a hit or miss,
        // if hit, increase computer hit by 1
        int row = Randomizer.nextInt(10);
        int col = Randomizer.nextInt(10);

        boolean hit = player.getOwnGrid().hasShip(row, col);

        if (hit) {
            player.getOwnGrid().markHit(row, col);
        } else {
            player.getOwnGrid().markMiss(row, col);
        }

        player.getOwnGrid().printStatus();
        if (hit) {
            System.out.println("Computer hit!\n");
            computerHits++;
        } else {
            System.out.println("Computer missed.\n");
        }
    }

    public int rowLetterToNumber(String rowLetter) {
        // Ensure that the input is valid (A-J)
        rowLetter = rowLetter.toUpperCase(); // Handle both upper and lower case inputs
        if (rowLetter.length() == 1 && rowLetter.charAt(0) >= 'A' && rowLetter.charAt(0) <= 'J') {
            return rowLetter.charAt(0) - 'A'; // Convert letter to number
        } else {
            System.out.println("Invalid input. Please enter a letter between A and J.");
            return -1; // Return -1 if invalid input
        }
    }

    public void clearScreen()
    {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            System.out.println("Error clearing the screen: " + e.getMessage());
        }
    }
}
