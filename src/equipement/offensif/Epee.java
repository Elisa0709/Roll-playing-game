package equipement.offensif;

import personnage.Personnage;

/**
 * Classe représentant un équipement offensif spécifique : une épée.
 * L'épée est une arme que seuls les personnages de type "Guerrier" peuvent équiper.
 */
public class Epee extends EquipementOffensif {

    /**
     * Constructeur de la classe Epee. Initialise une épée avec un nom, une valeur d'attaque,
     * et la classe de personnage compatible.
     */
    public Epee(){
     super("Epée", 5, "Guerrier");
    }


    @Override
    public void interact(Personnage player) {
        player.equipementOffensif = new Epee();
    }

    public String toString() {
        return " Vous trouvez une épée\n"+
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣠⣤⠶⢾⡿\n"+
"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⡾⠋⠁⠀⠀⣼⠃\n"+
"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡼⠋⠀⠀⠀⠀⣰⡏⠀\n"+
"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⠟⠀⠀⠀⠀⣠⡾⠋⠀⠀\n"+
"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⠟⠁⠀⠀⢀⣠⠞⠉⠀⠀⠀⠀\n"+
"⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠟⠁⠀⠀⢀⣴⠟⠁⠀⠀⠀⠀⠀⠀\n"+
"⠀⠀⢀⣴⣦⣀⠀⣠⡾⠃⠀⠀⢀⣴⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀\n"+
"⠀⠀⠘⢷⣄⠙⠻⣯⡀⠀⣠⡶⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
"⠀⠀⠀⢀⣽⢷⣄⠀⠻⣾⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
"⠀⢀⣠⡟⠁⢀⣽⢷⣄⠙⣧⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
"⣼⠋⠙⢷⡶⠛⠁⠀⠙⠷⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
"⠻⣦⣤⠾⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
    }


}
