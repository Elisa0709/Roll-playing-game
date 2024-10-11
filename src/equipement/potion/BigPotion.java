package equipement.potion;

import personnage.Personnage;

public class BigPotion extends Potion {
    public BigPotion() {
        super("Grande potion",5);
    }


    @Override
    public void interact(Personnage player) {
        player.setNbGrandePotion(player.getNbGrandePotion() + 1);
        System.out.println( "Vous avez trouvé une GRANDE potion !\n"+
                "⠀⠀⠀⠀⠀⢀⣠⠤⠤⢤⡀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⢿⠑⠒⠂⠉⡇⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⢀⠼⣄⣀⣀⣠⠗⡄⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠈⢷⠶⠶⠶⠖⢺⠁⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⢸⡀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⡞⠀⠀⠀⠀⠘⣇⠀⠀⠀⠀⠀\n" +
                "⠀⠀⢀⡴⠊⠀⠀⠀⠀⠀⠀⠈⠑⢦⡀⠀⠀\n" +
                "⠀⡰⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢆⠀\n" +
                "⢰⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⡄\n" +
                "⢸⠀⠀⠀⠀GRANDE⠀⠀⠀⠀⠀⡇\n" +
                "⢰⠀   POTION⠀⠀⠀⠀⠀⣳\n" +
                "⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢼\n" +
                "⢸⠀⠀⠀⠀⠀5 PV⠀⠀⠀⠀⠀ ⣾\n" +
                "⢸⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡏\n" +
                "⠀⠳⢤⣀⡀⠀⠀⠀⠀⠀⠀⠀⣀⣀⡤⠞⠁\n" +
                "⠀⠀⠀⠈⠉⠉⠉⠛⠛⠋⠉⠉⠉⠁⠀⠀⠀\n");

    }
}
