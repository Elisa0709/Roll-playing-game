package equipement.offensif;

import personnage.Personnage;

/**
 * Classe représentant un équipement offensif spécifique : une massue.
 * La massue est une arme que seuls les personnages de type "Guerrier" peuvent équiper.
 */
public class Massue extends EquipementOffensif {

    /**
     * Constructeur de la classe Massue. Initialise une massue avec un nom, une valeur d'attaque,
     * et la classe de personnage compatible.
     */
    public Massue(){
        super("Massue", 3, "Guerrier");
    }

    @Override
    public void interact(Personnage player) {
        player.equipementOffensif = new Massue();
    }

    public String toString() {
        return "Vous trouvez une massue \n"+
                " ⢀⣠⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⣾⣿⣿⣿⣦⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⢻⣿⢻⣿⣿⣿⣤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠈⠻⢾⣉⢿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠹⣬⣻⣿⣿⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠈⠻⢿⣿⣿⣷⡄⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠙⢿⣿⣿⣆⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢿⣿⣦⡀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⣿⣷⡄⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢿⣷⡄⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⣿⣦⡄\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠋⠁";
    }
}
