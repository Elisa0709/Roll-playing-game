package equipement.potion;

import personnage.Personnage;

/**
 * Classe représentant une potion normale qui restaure des points de vie.
 */
public class NormalPotion extends Potion {
    /**
     * Constructeur de la classe NormalPotion. Initialise une potion normale avec
     * un nom et un nombre de points de vie restaurés.
     */
    public NormalPotion() {
        super("Petite potion", 2);
    }

    /**
     * Interagit avec le personnage, augmentant le nombre de potions du joueur et
     * affichant un message de découverte de la potion.
     *
     * @param player Le personnage avec lequel interagir.
     */
    @Override
    public void interact(Personnage player) {
        player.setNbPotion(player.getNbPotion() + 1);
        System.out.println( "Vous avez trouvé une potion !\n"+
                "⠀⠀⠀⠀⠀⢀⣠⠤⠤⢤⡀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⢿⠑⠒⠂⠉⡇⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⢀⠼⣄⣀⣀⣠⠗⡄⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠈⢷⠶⠶⠶⠖⢺⠁⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⢸⡀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⢀⡴⠊⠀⠀⠀⠀⠀⠀⠈⠑⢦⡀⠀⠀\n" +
                "⠀⡰⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢆⠀\n" +
                "⢰⠁⠀⠀⠀POTION⠀⠀⠀⠀⠸⡄\n" +
                "⢸⠀⠀         ⠀⠀⠀⠀⡇\n" +
                "⢸⠀⠀⠀⠀⠀⠀2 PV⠀⠀⠀⠀⠀⡟\n" +
                "⢸⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡏\n" +
                "⠀⠳⢤⣀⡀⠀⠀⠀⠀⠀⠀⠀⣀⣀⡤⠞⠁\n" +
                "⠀⠀⠀⠈⠉⠉⠉⠛⠛⠋⠉⠉⠉⠁⠀⠀⠀\n");
    }
}

