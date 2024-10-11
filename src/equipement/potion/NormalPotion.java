package equipement.potion;

import personnage.Personnage;

public class NormalPotion extends Potion {
    public NormalPotion() {
        super("Petite potion", 2);
    }

    @Override
    public String toString() {
        return "Vous avez trouvé une potion !\n"+
                "⠀⠀⠀⠀⠀⢀⣠⠤⠤⢤⡀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⢿⠑⠒⠂⠉⡇⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⢀⠼⣄⣀⣀⣠⠗⡄⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠈⢷⠶⠶⠶⠖⢺⠁⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⢸⡀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⢀⡴⠊⠀⠀⠀⠀⠀⠀⠈⠑⢦⡀⠀⠀\n" +
                "⠀⡰⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢆⠀\n" +
                "⢰⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⡄\n" +
                "⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇\n" +
                "⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡟\n" +
                "⢸⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡏\n" +
                "⠀⠳⢤⣀⡀⠀⠀⠀⠀⠀⠀⠀⣀⣀⡤⠞⠁\n" +
                "⠀⠀⠀⠈⠉⠉⠉⠛⠛⠋⠉⠉⠉⠁⠀⠀⠀\n"+
                "Vos points de vie augmentent de "+this.getHeal();

    }
}
