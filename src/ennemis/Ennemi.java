package ennemis;

import Interfaces.Interactable;
import personnage.Personnage;

/**
 * Classe abstraite représentant un ennemi dans le jeu. Chaque ennemi a un nom, des points de vie (PV),
 * et une force d'attaque. Cette classe implémente l'interface Interactable, ce qui signifie que les
 * ennemis peuvent interagir avec les personnages du jeu.
 */
public abstract class Ennemi implements Interactable {
    private String enemyName;
    private int enemyPV;
    private final int enemyforceAttack;


    /**
     * Constructeur pour créer un ennemi avec un nom, des points de vie, et une force d'attaque.
     *
     * @param enemyName       Le nom de l'ennemi.
     * @param enemyPV         Les points de vie de l'ennemi.
     * @param enemyforceAttack La force d'attaque de l'ennemi.
     */
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


    /**
     * Méthode abstraite qui retourne l'image de l'ennemi. Chaque classe concrète
     * devra fournir sa propre implémentation de cette méthode.
     *
     * @return Une chaîne de caractères représentant l'image de l'ennemi.
     */
    public abstract String getPicture();


    /**
     * Interagit avec un personnage. Cette méthode diminue les points de vie de l'ennemi
     * en fonction de la force d'attaque du personnage, et diminue les points de vie du
     * personnage en fonction de la force d'attaque de l'ennemi.
     *
     * @param player Le personnage qui interagit avec l'ennemi.
     */
    @Override
    public void interact(Personnage player) {
        this.setEnemyPV(this.getEnnemyPV() - player.getForceAttaque());
        if(this.getEnnemyPV()>0) {
            player.setPv(player.getPv() - this.getEnemyforceAttack());
        }

    }


}









