import Interfaces.Interactable;
import ennemis.Dragon;
import ennemis.Gobelin;
import ennemis.Sorcier;
import equipement.offensif.*;
import equipement.potion.BigPotion;
import equipement.potion.NormalPotion;
import personnage.Personnage;
import personnage.Guerrier;
import personnage.Magicien;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    Menu menu= new Menu();;
    private Personnage player;
    private ArrayList<Interactable> board;
    private int playerPosition;

    public Game() {
        this.playerPosition = 0;
        this.board = new ArrayList<>();
    }

    public void initGame() {
        fillBoard(this.board);
        menu.displayIntro();
        createCharacter();
        menu.displayType(player.getType());
        int choice = menu.choiceStartMenu();
        executeChoiceStartMenu(choice);
        while (playerPosition != 64) {
            playerChoice();
            getNewPlayerPosition(rollDice());
            interactWithCase(playerPosition, player);
            wait(300);
            //isAlive
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

    private void executeChoiceStartMenu(int choice) {
        switch (choice) {
            case 1:
                System.out.println(player.toString());
                wait(300);
                int userchoice = menu.choiceStartMenu();
                executeChoiceStartMenu(userchoice);
                break;
            case 2:
                String name = menu.getUserName();
                wait(300);
                String type = menu.getUserType();
                instancePlayer(name, type);
                int menuChoice = menu.choiceStartMenu();

                executeChoiceStartMenu(menuChoice);
                break;
            case 3:
                break; //permet de sortir du menu choix et de continuer les instructions de game
            case 4:
                menu.displayGoodbye();
                wait(300);
                System.exit(0);
                break;
            default:
                menu.displayInvalidChoice();
                wait(6000);
                menu.choiceStartMenu();
                executeChoiceStartMenu(menu.choiceStartMenu());
                break;
        }
    }

    private int rollDice() {
        int range = (6 - 1) + 1;
        return (int) ((range * Math.random()) + 1);
    }


    private void isWinning() {
        menu.displayVictory();
        wait(300);
        Scanner userChoiceInput = new Scanner(System.in);
        menu.displayWinMenu();
        int userChoice = userChoiceInput.nextInt();
        switch (userChoice) {
            case 1:
                initGame();
                break;
            case 2:
                menu.displayGoodbye();
                wait(300);
                System.exit(0);
                break;
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
                System.out.println(player.toString());
                playerChoice();
                break;
            case 3:
                drinkPotion();
                break;
            case 4:
                menu.displayGoodbye();
                wait(300);
                System.exit(0);
                break;
            default :
                menu.displayInvalidChoice();
                playerChoice();
                break;
        }
    }
    private void drinkPotion(){
        Scanner userChoiceInput = new Scanner(System.in);
        menu.displayPotionMenu();
        int userChoice = userChoiceInput.nextInt();
        switch (userChoice) {
            case 1:
                if(player.getNbPotion()>=1){
                    player.setNbPotion(player.getNbPotion()-1);
                    player.setPV(player.getPV()+2);
                    menu.displayPotionDrunk();

                }
                else{
                    menu.displayNoPotionInStock();
                }
                playerChoice();
                break;
            case 2 :
                if(player.getNbGrandePotion()>=1){
                    player.setNbGrandePotion(player.getNbGrandePotion()-1);
                    player.setPV(player.getPV()+5);
                    menu.displayPotionDrunk();
                }
                else{
                    menu.displayNoBigPotionInStock();
                }
                playerChoice();
                break;
        }
    }
    private void createCharacter() {
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
    private void getNewPlayerPosition(int dice) {
        menu.displayValueDice(dice);
        if (playerPosition + dice < 64) {
            playerPosition += dice;
            menu.displayPlayerPosition(playerPosition);
        } else if (playerPosition + dice == 64) {
            isWinning();
        } else {
            playerPosition = 64;
            isWinning();

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
    private void interactWithCase(int playerPosition, Personnage player) {
        Interactable objet = board.get(playerPosition);
        objet.interact(player, this.menu);
    }

}
