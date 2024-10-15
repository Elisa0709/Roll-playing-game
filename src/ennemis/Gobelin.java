package ennemis;

/**
 * Classe représentant un Gobelin, un type spécifique d'ennemi dans le jeu. Le Gobelin est
 * caractérisé par un nom, des points de vie (PV), et une force d'attaque définis par défaut dans
 * son constructeur. Cette classe étend la classe abstraite {@link Ennemi}.
 */
public class Gobelin extends Ennemi{

    /**
     * Constructeur de la classe Gobelin. Initialise un Gobelin avec un nom, des points de vie
     * et une force d'attaque spécifiques. Le nom est défini comme "Gobelin", les points de vie
     * à 10 et la force d'attaque à 1.
     */
    public Gobelin(){
        super("Gobelin", 10, 1);
    }

    @Override
    public String getPicture() {
        return
                "⠀⣄⣀⠀⠀⠀⠀⠀⢀⡤⠒⠒⠒⠤⢄⡀⠀⠀⣀⣀⣀⣀⡠⣤⠀⠀⠀\n" +
                        "⠀⠙⢦⡩⣝⡒⠒⣲⠇⠀⠀⠀⠀⠀⠰⠚⢉⠥⠤⣴⣢⠔⠋⠁⠀⠀⠀\n" +
                        "⠀⠀⠀⠘⢎⠯⣉⡇⠀⠀⠀⠀⠀⠀⠀⢠⢧⠖⣊⠝⠁⠀⠀⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠓⣌⣻⣿⠆⠀⠰⡿⠝⠀⡶⠥⠚⠁⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⣩⢧⠀⠀⠀⠀⡠⠊⠦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠀⡔⠁⠈⠳⠤⠤⠊⠀⠀⠀⠈⠑⠢⣄⠀⠀⠀⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⢸⠀⠤⡄⠀⠀⠀⠀⠀⠀⠀⡀⠀⠀⠈⠧⡀⠀⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⢸⠀⠀⢱⠀⠀⠀⠀⠀⠰⠋⠙⢢⣀⠀⠀⠉⢦⡀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⢀⡴⠁⠀⣾⠂⠀⠀⠀⠀⠀⠀⠀⡞⠀⠙⣄⠀⠀⠸⡀⠀⠀\n" +
                        "⠀⠀⡠⠞⠁⢀⣠⠜⢹⡆⠀⠀⠀⠀⠀⠀⡸⢃⠀⠀⠈⠣⡀⠀⢱⠀⠀\n" +
                        "⢠⢞⢱⣆⠞⠉⠀⠀⠀⢷⡀⠀⠀⠀⠀⠀⠇⢸⡄⠀⠀⡠⠜⠀⠈⢦⡀\n" +
                        "⠘⢎⣓⡻⠀⠀⠀⢀⣴⠋⠉⠉⠓⠒⠒⠒⠋⠁⢱⠀⠀⠳⢋⣇⣀⡄⣼\n" +
                        "⠀⠀⠉⠀⠀⠀⡠⠋⠈⠓⣄⠀⠀⠀⢀⠀⠀⡔⠚⡄⠀⠀⠸⠾⠿⠝⠛\n" +
                        "⠀⠀⠀⠀⠀⣞⠀⠀⢀⢀⡼⢆⡔⢦⣶⣷⡜⠀⠀⠸⠀⠀⠀⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⢹⡀⠀⠈⡏⠀⠈⠁⠈⠈⠇⠹⡄⠀⠀⠣⠀⠀⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠀⢧⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠸⡄⠀⠀⢃⠀⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⢀⣸⠂⠀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠦⡀⠈⡄⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⣶⣯⡄⢀⡤⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣽⡀⣘⡄⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⠓⠓⠟⠋⠀⠀";
    }


}
