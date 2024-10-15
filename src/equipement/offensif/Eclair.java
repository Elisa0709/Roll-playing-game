package equipement.offensif;

import personnage.Personnage;

/**
 * Classe représentant un équipement offensif spécifique : un éclair.
 * L'éclair est une arme que seuls les personnages de type "Magicien" peuvent équiper.
 */

public class Eclair extends EquipementOffensif {

    /**
     * Constructeur de la classe Eclair. Initialise un éclair avec un nom, une valeur d'attaque,
     * et la classe de personnage compatible.
     */
    public Eclair() {
        super("Eclair", 2, "Magicien");
    }

    @Override
    public void interact(Personnage player) {
        player.equipementOffensif = new Eclair();
    }

    public String toString() {
        return "Vous trouvez un éclair \n" +
                "⠀⠀⠀⠀⠀⠀⢠⠋⠉⠉⠉⠉⠉⠉⠉⠉⠉⢉⠝\n" +
                "⠀⠀⠀⠀⠀⢀⠆⠀⠀⠀⠀⠀⠀⠀⠀⠀⡠⠂⠀\n" +
                "⠀⠀⠀⠀⠀⡌⠀⠀⠀⠀⠀⠀⠀⠀⠀⡔⠁⠀⠀\n" +
                "⠀⠀⠀⠀⠰⠀⠀⠀⠀⠀⠀⠀⠀⠀⠔⠁⠀⠀⠀\n" +
                "⠀⠀⠀⢀⠃⠀⠀⠀⠀⠀⠀⠀⠠⠊⠀⠀⠀⠀⠀\n" +
                "⠀⠀⢀⠆⠀⠀⠀⠀⠀⠀⠀⠰⠥⠤⠤⠤⠤⠤⡤\n" +
                "⠀⠀⡌⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠄⠀\n" +
                "⠀⡘⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠔⠁⠀⠀\n" +
                "⢀⣃⣀⢀⢀⣀⣀⠀⠀⠀⠀⠀⠀⡠⠊⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⢠⠃⠀⠀⠀⢀⠔⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⢠⠂⠀⠀⠀⠔⠁⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⢀⠃⠀⠀⡠⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⢀⠆⠀⡠⠊⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⡜⠀⠘⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⡘⡠⠊⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⡰⠊⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
    }
}



