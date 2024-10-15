package equipement.offensif;

import personnage.Personnage;

/**
 * Classe représentant un équipement offensif spécifique : un bâton.
 * Le bâton est l'équipement de départ de tous les perosnnages.
 */
public class Baton extends EquipementOffensif{
    /**
     * Constructeur de la classe Baton. Initialise un baton avec un nom, une valeur d'attaque,
     * et la classe de personnage compatible. Cette arme est compatible avec toutes les classes
     */
    public Baton(){
        super("Bâton", 1, "");
    }
    @Override
    public void interact(Personnage player) {
        System.out.println("interact de la classe Baton");
    }
}
