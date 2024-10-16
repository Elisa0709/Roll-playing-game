import Interfaces.Interactable;
import ennemis.Dragon;
import ennemis.Ennemi;
import ennemis.Gobelin;
import ennemis.Sorcier;
import equipement.offensif.*;
import equipement.potion.BigPotion;
import equipement.potion.NormalPotion;
import exceptions.badChoiceException;
import personnage.Personnage;
import personnage.Guerrier;
import personnage.Magicien;

import java.util.*;

public class Game {
    private final Menu menu = new Menu();
    private Personnage player;
    private final ArrayList<Interactable> board;
    private int playerPosition;

    public Game() {
        this.playerPosition = 0;
        this.board = new ArrayList<>();
    }

    /**
     * Initialise et lance le jeu
     * Effectue les opérations :
     * remplir l'arrayList représentant le plateau
     * Afficher le message d'introduction du jeu
     * Lance la création de personnage
     * Permet à l'utilisateur de choisir la classe (type) de son personnage
     * Affiche le menu permettant de commencer la partie
     * exécute le choix du menu précédent
     * Tant que le joueur n'a pas gagné
     * Affiche le menu permettant au joueur d'effectuer une action
     * Le joueur lance le dé et sa position change en fonction du résultat
     * le joueur interagit avec l'objet présent sur la case où il se trouve
     * Quand le joueur a gagné, est en position 64, on lance l'affichage et la gestion de fin de partie.
     */
    public void initGame() {
        fillBoard();
        Collections.shuffle(board);
        menu.displayIntro();
        createCharacter();
        menu.displayType(player.getType());
        startMenu();
        while (playerPosition != 64) {
            playerChoice();
            getNewPlayerPosition(randomInt(1, 6));
            interactWithCase(playerPosition, player);
            menu.wait(300);
        }
        isWinning();
    }

    private int getValidChoice(List<Integer> options) {
        menu.displayChoiceStartMenu();
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        while (!options.contains(choice)) {
            System.out.println("Choix invalide, merci de renseigner un nouveau choix");
            choice = scanner.nextInt();
        }
        return choice;
    }

    private void startMenu() {
        try {
            int choice = getValidChoice(Arrays.asList(1, 2, 3, 4)); //Arrays.asList permet de convertir les n° en liste
            executeChoiceStartMenu(choice);
        } catch (InputMismatchException e) {
            System.out.println("Merci de renseigner un choix valide !");
            menu.wait(200);
            startMenu();
        }
    }

    private void executeChoiceStartMenu(int choice) {

        switch (choice) {
            case 1:
                System.out.println(player.toString());
                menu.wait(300);
                startMenu();
                break;
            case 2:
                String name = menu.getUserName();
                menu.wait(300);
                String type = menu.getUserType();
                instancePlayer(name, type);
                startMenu();
                break;
            case 3:
                break; //permet de sortir du menu choix et de continuer les instructions de game
            case 4:
                quitGame();
                break;
        }
    }

    private void quitGame() {
        menu.displayGoodbye();
        menu.wait(300);
        System.exit(0);
    }

    private int randomInt(int min, int max) {
        int range = (max - min) + 1;
        return (int) ((range * Math.random()) + 1);
    }

    private void isWinning() {
        menu.displayVictory();
        menu.wait(300);
        endGameChoices();
    }

    private void endGameChoices() {
        Scanner userChoiceInput = new Scanner(System.in);
        menu.displayEndMenu();
        int userChoice = userChoiceInput.nextInt();
        switch (userChoice) {
            case 1:
                Main.main(null);
                break;
            case 2:
                menu.displayGoodbye();
                menu.wait(300);
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
                quitGame();
                break;
            default:
                menu.displayInvalidChoice();
                playerChoice();
                break;
        }
    }

    private void drinkPotion() {
        Scanner userChoiceInput = new Scanner(System.in);
        menu.displayPotionMenu();
        int userChoice = userChoiceInput.nextInt();
        switch (userChoice) {
            case 1:
                if (player.getNbPotion() >= 1) {
                    player.setNbPotion(player.getNbPotion() - 1);
                    player.setPv(player.getPv() + 2);
                    menu.displayPotionDrunk();
                    playerChoice();

                } else {
                    menu.displayNoPotionInStock();
                    playerChoice();
                }
                break;
            case 2:
                if (player.getNbGrandePotion() >= 1) {
                    player.setNbGrandePotion(player.getNbGrandePotion() - 1);
                    player.setPv(player.getPv() + 5);
                    menu.displayPotionDrunk();
                } else {
                    menu.displayNoBigPotionInStock();
                    playerChoice();

                }
                break;
            default:
                menu.displayInvalidChoice();
                drinkPotion();
        }
    }

    private void createCharacter()  {
          boolean characterCreated = false;

        while (!characterCreated) {
            try {
                String name = menu.getUserName();
                menu.wait(400);
                String type = menu.getUserType();
                menu.wait(800);
                instancePlayer(name, type);
                characterCreated = true; // Met à jour pour sortir de la boucle une fois le personnage créé
            }
            catch (InputMismatchException e) {
                System.out.println(" /!\\ ERREUR /!\\ Saisie incorrecte. Veuillez réessayer.");
                createCharacter();
            }
        }
    }

    private void instancePlayer(String name, String type) {
        switch (type) {
            case "Guerrier":
                player = new Guerrier(name);
                break;
            case "Magicien":
                player = new Magicien(name);
                break;
            default:
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

    private void fillBoard() {
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

    private void isPlayerDead(Personnage player) {
        int playerPV = player.getPv();
        if (playerPV <= 0) {
            menu.displayDeadPlayer();
            endGameChoices();
        }

    }

    private int getBackwardsPosition(){
        int nbReverse = randomInt(1,6);
        if((this.playerPosition-nbReverse) <0){
            this.playerPosition = 0;
        }
        else{
            this.playerPosition -= nbReverse;
        }
        return nbReverse;
    }

    private void ennemyInteraction(Ennemi ennemi, Personnage player) {
        menu.displayEnemyStatistic(ennemi);
        int userChoice = menu.displayFightMenu();
        switch (userChoice) {
            case 1:
                ennemi.interact(player);
                isPlayerDead(player);
                menu.displayEndAttack(ennemi);
                removeEnnemi(ennemi);
                break;
            case 2:
                System.out.println(player.toString());
                ennemyInteraction(ennemi, player);
                break;
            case 3:
                int nbReverse = getBackwardsPosition();
                menu.displayPlayerPositionAfterReverse(this.playerPosition, nbReverse);
                break;
            default:
                menu.displayInvalidChoice();
                menu.wait(400);
                ennemyInteraction(ennemi, player);
                break;
        }
    }
    private void removeEnnemi(Ennemi ennemi){
        if (ennemi.getEnnemyPV() < 0){
            board.remove(playerPosition);
        }
    }

    private void armeInteraction(Personnage player, EquipementOffensif equipement) {
        if (equipement.getMatchWithClass() == player.getType()) {
            player.setEquipementOffensif(equipement);
            menu.displayLootEquipementOffensif(equipement, player);
        } else {

            menu.displayInvalidLoot(equipement);
        }
    }

    private void interactWithCase(int playerPosition, Personnage player) {
        Interactable object = board.get(playerPosition);
        if (board.get(playerPosition) instanceof Ennemi) {
            ennemyInteraction((Ennemi) object, player);
        } else if (board.get(playerPosition) instanceof EquipementOffensif) {
            armeInteraction(player, (EquipementOffensif) object);
        } else {
            object.interact(player);
        }
    }

}
