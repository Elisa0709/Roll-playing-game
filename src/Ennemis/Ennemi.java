package Ennemis;

import Equipement.Interactable;

public abstract class Ennemi implements Interactable {
    private String enemyName;
    private int enemyPV;
    private int enemyforceAttack;
    public Ennemi(String enemyName, int enemyPV, int enemyforceAttack ) {
        this.enemyName = enemyName;
        this.enemyPV = enemyPV;
        this.enemyforceAttack = enemyforceAttack;
    }

    public String getEnemyName() {
        return enemyName;
    }
    public int getEnemyforceAttack() {
        return enemyforceAttack;
    }
    public int getEnemyPV() {
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



}
