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

    private void setEnemyName(String enemyName) {
        this.enemyName = enemyName;
    }

    private void setEnemyPV(int enemyPV) {
        this.enemyPV = enemyPV;
    }

    private void setEnemyforceAttack(int enemyforceAttack) {
        this.enemyforceAttack = enemyforceAttack;
    }


    public abstract String getPicture();


    @Override
    public void interact(Personnage player) {
        this.setEnemyPV(this.getEnnemyPV() - player.getForceAttaque());
        player.setPV(player.getPV() - this.getEnemyforceAttack());
    }


}









