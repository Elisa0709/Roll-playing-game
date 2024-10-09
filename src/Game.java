import Personnage.Personnage;
import Personnage.Guerrier;
import Personnage.Magicien;
import Exceptions.PlayerPositionException;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    Menu menu;
    private Personnage player;
    private ArrayList board;
    private int playerPosition;

    public Game() {
        this.menu = new Menu();
        this.playerPosition = 0;
        this.board = new ArrayList();
    }
    public void initGame() {
        menu.displayIntro();
        createCharacter();
        menu.displayType(player.getType());
        int choice = menu.choiceMenu();
        executeChoiceMenu(choice);
        while (playerPosition != 64) {
            playerChoice();
            getNewPlayerPosition(rollDice());
            wait(300);
        }
        isWinning();
    }
    private void wait(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
    private void executeChoiceMenu(int choice){
            switch (choice) {
                case 1:
                    System.out.println(player.toString());
                    wait(300);
                    int userchoice =menu.choiceMenu();
                    executeChoiceMenu(userchoice);
                    break;
                case 2:
                    String name = menu.getUserName();
                    wait(300);
                    String type = menu.getUserType();
                    instancePlayer(name, type);
                    int menuChoice = menu.choiceMenu();

                    executeChoiceMenu(menuChoice);
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
    private int rollDice() {
        int range = (6 - 1) + 1;
        return (int) ((range * Math.random()) + 1);
    }
    private void getNewPlayerPosition(int dice) {
        System.out.println("Votre lancé de dé : " + dice);
            try{
                playerPosition += dice;
                menu.displayPlayerPosition(playerPosition);

                if(playerPosition >= 64){
                    throw new PlayerPositionException();
                }
            } catch (PlayerPositionException e){
                playerPosition = 64;
            }
    }
    private void isWinning() {
        if(this.playerPosition == 64){
            System.out.println("Bravo, vous avez gagné !");
            wait(300);
            Scanner userChoiceInput = new Scanner(System.in);
            menu.displayWinMenu();
            int userChoice = userChoiceInput.nextInt(); //affichage (+en gaut) dans menu
            switch (userChoice) {
                case 1:
                    initGame();
                    break;
                case 2:
                    System.out.println("A bientôt !");
                    wait(300);
                    System.exit(0);
                    break;
            }
        }
}
    private void playerChoice() {
        Scanner userChoiceInput = new Scanner(System.in);
        menu.displayMenuRollDice();
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
    private void createCharacter(){
        String name = menu.getUserName();
        wait(400);
        String type = menu.getUserType();
        wait(800);
        instancePlayer(name, type);
    }
    private void instancePlayer(String name, String type) {
        switch (type) {
            case "Guerrier":
                 player = new Guerrier(name);
                 break;
            case "Magicien":
                 player = new Magicien(name);
                 break;
        }
    }
}
