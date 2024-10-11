package equipement.offensif;

import personnage.Personnage;

import java.util.Objects;

public class Eclair extends EquipementOffensif {
    public Eclair() {
        super("Eclair", 2, "Magicien");
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



