package ennemis;

/**
 * Classe représentant un Sorcier, un type spécifique d'ennemi dans le jeu. Le Sorcier est
 * caractérisé par un nom, des points de vie (PV), et une force d'attaque définis par défaut dans
 * son constructeur. Cette classe étend la classe abstraite {@link Ennemi}.
 */
public class Sorcier extends Ennemi{

    /**
     * Constructeur de la classe Sorcier. Initialise un Sorcier avec un nom, des points de vie
     * et une force d'attaque spécifiques. Le nom est défini comme "Sorcier", les points de vie
     * à 17 et la force d'attaque à 2.
     */
    public Sorcier(){
        super("Sorcier", 17, 2);
    }

    @Override
    public String getPicture() {
        return "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡠⠀⠀⢠⡀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⡔⠁⠀⢣⣀⠇⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⡰⠊⢀⠀⣀⡇⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠰⠁⢤⠊⢢⠀⠘⡄⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⢀⠃⠀⠀⠋⠙⠀⠀⠰⡀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⢀⣠⠧⠒⠉⠉⠉⠉⠁⠶⠤⣵⡀⠀⠀⠀⠀⠀\n" +
                "⠀⡠⢒⡨⠅⢠⣶⢖⠀⠀⠲⢴⠆⠀⢢⢠⡬⢅⡐⠤⡀⠀\n" +
                "⠊⠐⠁⠀⠀⠆⡇⠀⠿⠿⣀⡀⠿⠿⠀⡷⢰⠀⠈⠑⠎⢢\n" +
                "⠣⠌⠲⠄⠸⣼⣃⠠⠂⡉⠀⠈⣉⠂⠄⣷⡼⠀⠠⣄⣂⠜\n" +
                "⠀⠀⠀⠀⠀⢸⢊⠉⡁⠀⠈⠁⠀⠉⠉⢱⡆⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⢠⠃⢩⠎⢧⠀⠀⠐⢰⡜⠶⡁⠸⡀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⡶⠤⡮⠀⠀⠑⢆⡐⠃⠀⠀⡗⠒⢵⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠦⡴⠂⠀⠀⠀⠈⠀⠀⠀⠀⠓⢧⠔⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠓⢤⠤⣤⠤⠤⠤⠤⣤⠤⡤⠘⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠃⠠⠤⠋⠀⠀⠑⠤⠀⠜⠀⠀⠀";
    }
}
