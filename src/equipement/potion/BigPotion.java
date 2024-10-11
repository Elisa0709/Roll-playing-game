package equipement.potion;

import personnage.Personnage;

public class BigPotion extends Potion {
    public BigPotion() {
        super("Grande potion",5);
    }


    @Override
    public String toString() {
        return "Vous avez trouvé une GRANDE potion !\n"+
                "⠀⠀⠀⠀⠀⢀⣠⠤⠤⢤⡀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⢿⠑⠒⠂⠉⡇⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⢀⠼⣄⣀⣀⣠⠗⡄⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠈⢷⠶⠶⠶⠖⢺⠁⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⢸⡀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⡞⠀⠀⠀⠀⠘⣇⠀⠀⠀⠀⠀\n" +
                "⠀⠀⢀⡴⠊⠀⠀⠀⠀⠀⠀⠈⠑⢦⡀⠀⠀\n" +
                "⠀⡰⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢆⠀\n" +
                "⢰⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⡄\n" +
                "⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇\n" +
                "⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇\n" +
                "⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡟\n" +
                "⢰⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣳\n" +
                "⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢼\n" +
                "⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾\n" +
                "⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡟\n" +
                "⢸⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡏\n" +
                "⠀⠳⢤⣀⡀⠀⠀⠀⠀⠀⠀⠀⣀⣀⡤⠞⠁\n" +
                "⠀⠀⠀⠈⠉⠉⠉⠛⠛⠋⠉⠉⠉⠁⠀⠀⠀\n"+
                "Vos points de vie augmentent de "+this.getHeal();

    }
}
