package ennemis;

import Interfaces.Interactable;
import personnage.Personnage;

import java.awt.*;
import java.util.Scanner;

public abstract class Ennemi implements Interactable {
    private String enemyName;
    private int enemyPV;
    private int enemyforceAttack;

    public Ennemi(String enemyName, int enemyPV, int enemyforceAttack) {
        this.enemyName = enemyName;
        this.enemyPV = enemyPV;
        this.enemyforceAttack = enemyforceAttack;

    }

    public String getEnnemyName() {
        return enemyName;
    }

    public int getEnemyforceAttack() {
        return enemyforceAttack;
    }

    public int getEnnemyPV() {
        return enemyPV;
    }

    public void setEnemyName(String enemyName) {
        this.enemyName = enemyName;
    }

    public void setEnemyPV(int enemyPV) {
        this.enemyPV = enemyPV;
    }

    public void setEnemyforceAttack(int enemyforceAttack) {
        this.enemyforceAttack = enemyforceAttack;
    }

    public void wait(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    public void displayFightMenu() {
        System.out.println("*______________________________________*\n" +
                "A vous de jouer\n" +
                "[1] à l'attaque !\n" +
                "[2] voir mes statistiques\n" +
                "[3] boire une potion\n" +
                "[4] c'est trop pour moi, je quitte le jeu");
    }

    @Override
    public void interact(Personnage player, Menu menu) {
        menu.displayInteractMenu(this.enemyPV, this.enemyName);

        System.out.println(this.toString());

        this.displayFightMenu();
        Scanner userChoiceInput = new Scanner(System.in);
        int userChoice = userChoiceInput.nextInt();
        switch (userChoice) {
            case 1:
                attack(player, menu);
                break;
            case 2:
                player.toString();
                interact(player);
                break;
            case 3:
                //boire une potion
                break;
            case 4:
                //menu.displayGoodbye();
                wait(300);
                System.exit(0);
                break;
        }
    }


    public void attack(Personnage player, Menu menu) {
        this.setEnemyPV(this.getEnnemyPV() - player.getForceAttaque());
        System.out.println("Vous infligez une puissante attaque au " + this.getEnnemyName() + "\n" +
                "Il ne lui reste plus que " + this.enemyPV + " PV.\n\n");

        player.setPV(player.getPV() - this.getEnemyforceAttack());
        System.out.println("Le " + this.getEnnemyName() + " vous attaque à son tour. Vous perdez " + this.getEnemyforceAttack() + " PV.");
        wait(400);
        if (this.getEnnemyPV() > 0) {
            System.out.println("Vexé, le " + this.getEnnemyName() + " s'enfuit en courant.");
            wait(300);
        } else {
            System.out.println("Votre force n'a aucune limite.\n" +
                    "le " + this.getEnnemyName() + " est mort.");
        }

    }

}







