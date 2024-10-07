import java.util.Scanner;

public class Game {
    Menu menu;
    private Personnage player;
    private String[] board;
    private int playerPosition;

    public Game() {
        this.menu = new Menu();
        this.playerPosition = 0;
    }

    public void runGame() {
        intro();
        player = menu.createCharacter();
        System.out.println(
                "*------------------------------------------*\n" +
                        "Votre classe : " + player.getType() + "\n" +
                        "*------------------------------------------*\n");
        int choice = menu.choiceMenu();
        executeChoiceMenu(choice);


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

    public void executeChoiceMenu(int choice){
            switch (choice) {
                case 1:
                    System.out.println(player.toString());
                    wait(300);
                    int userchoice =menu.choiceMenu();
                    executeChoiceMenu(userchoice);
                    break;
                case 2:
                    Scanner userChoiceInput = new Scanner(System.in);
                    System.out.println("Entrez votre nom : ");
                    player.setName(userChoiceInput.nextLine());
                    wait(300);

                    player.setType(menu.getUserType());
                    int typeUserChoice = menu.choiceMenu();
                    executeChoiceMenu(typeUserChoice);
                    break;
                case 3:
                    break; //permet de sortir du menu choix et de continuer les instructions de game
                case 4:
                    System.out.println("A bientôt !");
                    wait(300);
                    System.exit(0);
                    break;
                default:
                    System.out.println("Choix invalide");
                    wait(6000);
                    menu.choiceMenu();
                    executeChoiceMenu(menu.choiceMenu());
                    break;
        }
    }



    public void intro() {
        System.out.println(
                "*----------BIENVENUE AVENTURIER !----------*\n" +
                        "*------------------------------------------*\n" +
                        "   Commençons par créer votre personnage\n" +
                        "*------------------------------------------*\n"

        );
    }

    public int rollDice() {
        int range = (6 - 1) + 1;
        return (int) ((range * Math.random()) + 1);
    }

    public void getNewPlayerPosition(int dice) {
        System.out.println("Votre lancé de dé : " + dice);
        if ((playerPosition + dice) <= 64) {
            playerPosition = playerPosition + dice;
            System.out.println("Vous êtes sur la case : " + playerPosition + "\n" +
                    "____________________________\n");
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


}
