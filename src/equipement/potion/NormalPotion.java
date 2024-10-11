package equipement.potion;

import personnage.Personnage;

public class NormalPotion extends Potion {
    public NormalPotion() {
        super("Petite potion", 2);
    }


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

