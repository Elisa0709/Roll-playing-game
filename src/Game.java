import ennemis.Dragon;
import ennemis.Gobelin;
import ennemis.Sorcier;
import equipement.offensif.*;
import equipement.potion.BigPotion;
import equipement.potion.NormalPotion;
import personnage.Personnage;
import personnage.Guerrier;
import personnage.Magicien;
import exceptions.PlayerPositionException;
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

    private void fillBoard(ArrayList board) {
        board.add(new Eclair()); // Case 1
        board.add(new Massue()); // Case 2
        board.add(new Gobelin()); // Case 3
        board.add(new Eclair()); // Case 4
        board.add(new Massue()); // Case 5
        board.add(new Gobelin()); // Case 6
        board.add(new NormalPotion()); // Case 7
        board.add(new Eclair()); // Case 8
        board.add(new Gobelin()); // Case 9
        board.add(new Sorcier()); // Case 10
        board.add(new Massue()); // Case 11
        board.add(new Gobelin()); // Case 12
        board.add(new NormalPotion()); // Case 13
        board.add(new CaseVide()); // Case 14
        board.add(new Gobelin()); // Case 15
        board.add(new CaseVide()); // Case 16
        board.add(new Eclair()); // Case 17
        board.add(new Gobelin()); // Case 18
        board.add(new Epee()); // Case 19
        board.add(new Sorcier()); // Case 20
        board.add(new Gobelin()); // Case 21
        board.add(new Massue()); // Case 22
        board.add(new Eclair()); // Case 23
        board.add(new Gobelin()); // Case 24
        board.add(new Sorcier()); // Case 25
        board.add(new Epee()); // Case 26
        board.add(new Gobelin()); // Case 27
        board.add(new BigPotion()); // Case 28
        board.add(new CaseVide()); // Case 29
        board.add(new Gobelin()); // Case 30
        board.add(new NormalPotion()); // Case 31
        board.add(new Sorcier()); // Case 32
        board.add(new NormalPotion()); // Case 33
        board.add(new CaseVide()); // Case 34
        board.add(new Sorcier()); // Case 35
        board.add(new Sorcier()); // Case 36
        board.add(new Sorcier()); // Case 37
        board.add(new Massue()); // Case 38
        board.add(new NormalPotion()); // Case 39
        board.add(new Sorcier()); // Case 40
        board.add(new BigPotion()); // Case 41
        board.add(new Epee()); // Case 42
        board.add(new NormalPotion()); // Case 43
        board.add(new Sorcier()); // Case 44
        board.add(new Dragon()); // Case 45
        board.add(new CaseVide()); // Case 46
        board.add(new Sorcier()); // Case 47
        board.add(new FireBall()); // Case 48
        board.add(new FireBall()); // Case 49
        board.add(new CaseVide()); // Case 50
        board.add(new CaseVide()); // Case 51
        board.add(new Dragon()); // Case 52
        board.add(new Epee()); // Case 53
        board.add(new CaseVide()); // Case 54
        board.add(new CaseVide()); // Case 55
        board.add(new Dragon()); // Case 56
        board.add(new CaseVide()); // Case 57
        board.add(new CaseVide()); // Case 58
        board.add(new CaseVide()); // Case 59
        board.add(new CaseVide()); // Case 60
        board.add(new CaseVide()); // Case 61
        board.add(new Dragon()); // Case 62
        board.add(new CaseVide()); // Case 63
        board.add(new CaseVide()); // Case 64

    }
}
