package equipement.offensif;

import personnage.Personnage;

/**
 * Classe représentant un équipement offensif spécifique : une boule de feu.
 * La boule de feu est une arme que seuls les personnages de type "Magicien" peuvent équiper.
 */
public class FireBall extends EquipementOffensif {

    /**
     * Constructeur de la classe FireBall. Initialise une boule de feu avec un nom, une valeur d'attaque,
     * et la classe de personnage compatible.
     */
    public FireBall() {
        super("Boule de feu", 7, "Magicien");
    }


    @Override
    public void interact(Personnage player) {
        player.equipementOffensif = new FireBall();
    }


    public String toString() {
        return "Vous trouvez un éclair \n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠎⠀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
"⠀⠀⠀⠀⠀⠀⠀⠀⢀⡄⢸⢯⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
"⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⢸⣻⣞⡄⢸⡄⡄⠀⠀⠀⠀⠀⠀⠀\n"+
"⠀⠀⠀⠀⠀⠀⠀⠀⡿⣄⣜⣧⣿⢦⡾⡅⠈⠀⠀⠀⠀⠀⠀⠀\n"+
"⠀⠀⠀⠀⠀⠀⠀⠀⡿⢷⣏⡀⢸⣏⡿⢱⢰⠀⠀⠀⠀⠀⠀⠀\n"+
"⠀⠀⠀⠀⠀⠀⠀⡇⢿⠈⠟⢃⠌⣃⠁⣾⢾⠀⠀⠀⠀⠀⠀⠀\n"+
"⠀⠀⠀⠀⠀⠀⠀⢷⠻⡆⠘⠌⠒⣠⢹⢏⡯⠀⠀⠀⠀⠀⠀⠀\n"+
"⠀⠀⠀⠀⠀⠀⠀⠈⠳⣐⠀⠀⠀⢜⡨⠞⠁⠀⠀⠀⠀⠀⠀⠀\n"+
"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠁⠀⠀⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";

    }

}
