import java.util.Scanner;

public class Game {
    Menu menu;
    private String[] board;
    private int playerPosition = 0;
    public Game() {
        this.menu = new Menu();


    }
    public void runGame() {
        initGame();

        while (playerPosition != 64) {
            playerChoice();
            getNewPlayerPosition(rollDice());
            wait(300);
        }

    }
    public static void wait(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
    public void initGame() {
        menu.createCharacter();
    }
    public int rollDice() {
        int range = (6 - 1) + 1;
        return (int) ((range * Math.random()) + 1);
    }
    public void getNewPlayerPosition(int dice) {
        System.out.println("Votre lancé de dé : " + dice);
        if ((playerPosition + dice) <= 64) {
            playerPosition = playerPosition + dice;
            System.out.println("Vous êtes sur la case : " + playerPosition);
        } else {
            System.out.println("Impossible d'avancer");
        }

        if (playerPosition == 64) {
            System.out.println("Bravo, vous avez gagné !");
            wait(300);
            Scanner userChoiceInput = new Scanner(System.in);
            System.out.println(
                    "[1] Rejouer\n" +
                            "[2] Quitter le jeu\n");
            int userChoice = userChoiceInput.nextInt();
            switch (userChoice) {
                case 1:
                    runGame();
                    break;
                case 2:
                    System.out.println("A bientôt !");
                    wait(300);
                    System.exit(0);
                    break;
            }
        }
    }
    public void playerChoice() {
        Scanner userChoiceInput = new Scanner(System.in);
        System.out.println("A vous de jouer\n" +
                "[1] Lancer le dé\n" +
                "[2] Quitte le jeu\n"
        );
        int userChoice = userChoiceInput.nextInt();

        switch (userChoice) {
            case 1:
                break;
            case 2:
                System.out.println("A bientôt !");
                wait(300);
                System.exit(0);
                break;
        }
    }

    ;


}
