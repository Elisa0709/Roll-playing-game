package ennemis;

import personnage.Personnage;

public class Gobelin extends Ennemi{
    public Gobelin(){
        super("Gobelin", 10, 1);
    }

    @Override
    public String toString() {
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
