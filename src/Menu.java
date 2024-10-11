import java.util.Scanner;
public class Menu {
    public void wait(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
    public String getUserName() {
        Scanner userInputName = new Scanner(System.in);
        System.out.println("Entrez votre nom : ");
        String userName = userInputName.nextLine();
        System.out.println("Bienvenue " + userName);
        return userName;
    }
    public String getUserType() {
        Scanner userInputType = new Scanner(System.in);
        System.out.println("Choix de votre classe : " +
                "\ntapez le numéro de la classe choisie" +
                "\n[1] Guerrier" +
                "\n[2] Magicien");

        switch (userInputType.nextInt()) {
            case 1:
                return "Guerrier";
            case 2:
                return "Magicien";
            default:
                System.out.println("Aucune classe n'est associée à votre choix.");
                wait(300);
                getUserType();
                return "";
        }

    }
    public int choiceStartMenu() {
        Scanner userChoiceInput = new Scanner(System.in);
        System.out.println("Par quoi on commence ?\n" +
                "[1] Je veux voir mon personnage\n" +
                "[2] Je veux modifier mon personnage\n" +
                "[3] Commencer le jeu !\n" +
                "[4] Quitter le jeu \n"
        );
        return userChoiceInput.nextInt();
    }
    public void displayType(String type) {
        System.out.println(
            "*------------------------------------------*\n" +
            "Votre classe : " + type + "\n" +
            "*------------------------------------------*\n");
    }
    public void displayIntro(){
        System.out.println(
            "*----------BIENVENUE AVENTURIER !----------*\n" +
            "*------------------------------------------*\n" +
            "   Commençons par créer votre personnage\n" +
            "*------------------------------------------*\n"
        );
    }
    public void displayValueDice(int dice){
        System.out.println("+-----+\n" +
                "|  " + dice + "  |\n" +
                "+-----+");
    }
    public void displayPlayerPosition(int playerPosition) {
        System.out.println("Vous êtes sur la case "+playerPosition+" sur 64");
    }
    public void displayMenuRollDice(){
        System.out.println("A vous de jouer\n" +
                "[1] Lancer le dé\n" +
                "[2] Voir mon personnage\n"+
                "[3] Boire une potion\n"+
                "[4] Quitter le jeu"
        );
    }
    public void displayPotionMenu(){
        System.out.println("Quelle potion voulez-vous boire ?\n" +
                "[1] Potion ( +2 PV )\n" +
                "[2] Grande potion ( +5 PV)");
    }
    public void displayNoPotionInStock(){
        System.out.println("Bien essayé, mais vous n'avez pas de potion.\n" +
                "Dommage.");
    }
    public void displayNoBigPotionInStock(){
        System.out.println("Bien essayé, mais vous n'avez pas de grande potion.\n" +
                "Dommage.");
    }
    public void displayPotionDrunk(){
        System.out.println("Vous avez bu une potion.");
    }
    public void displayWinMenu(){
        System.out.println(
                "[1] Rejouer\n" +
                "[2] Quitter le jeu\n");
    }
    public void displayGoodbye(){
        System.out.println(
                "┌─────────────────────────────────────────┐\n" +
                        "│  __     _     _            _   //\\  _   │\n" +
                        "│  \\_\\   | |__ (_) ___ _ __ | |_|/_\\|| |_ │\n" +
                        "│  /_\\   | '_ \\| |/ _ | '_ \\| __/ _ \\| __|│\n" +
                        "│ / _ \\  | |_) | |  __| | | | || (_) | |_ │\n" +
                        "│/_/ \\_\\ |_.__/|_|\\___|_| |_|\\__\\___/ \\__|│\n" +
                        "└─────────────────────────────────────────┘"
        );}
    public void displayInvalidChoice(){
        System.out.println(" ___  ___ \n" +
        "|\"  \\/\"  |\n" +
                " \\   \\  / \n" +
                "  \\\\  \\/  \n" +
                "  /\\.  \\  \n" +
                " /  \\   \\ \n" +
                "|___/\\___|\n" +
                "Choix invalide !\n");
    }
    public void displayInteractMenu(int pv, String name){
        System.out.println("Vous rencontrez un gobelin\n" +
                "Points de vie : " + pv + "\n" +
                "Force d'attaque " + name + "\n");
    }



    public void displayVictory(){
        System.out.println(
                " /\\_/\\  /\\_/\\  /\\_/\\  /\\_/\\  /\\_/\\  /\\_/\\  /\\_/\\  /\\_/\\  /\\_/\\  /\\_/\\  /\\_/\\  /\\_/\\  /\\_/\\  /\\_/\\ \n" +
                        "( o.o )( o.o )( o.o )( o.o )( o.o )( o.o )( o.o )( o.o )( o.o )( o.o )( o.o )( o.o )( o.o )( o.o )\n" +
                        " > ^ <  > ^ <  > ^ <  > ^ <  > ^ <  > ^ <  > ^ <  > ^ <  > ^ <  > ^ <  > ^ <  > ^ <  > ^ <  > ^ < \n" +
                        " /\\_/\\                                                                                      /\\_/\\ \n" +
                        "( o.o )   ▄█    █▄   ▄█   ▄████████     ███      ▄██████▄   ▄█     ▄████████    ▄████████  ( o.o )\n" +
                        " > ^ <   ███    ███ ███  ███    ███ ▀█████████▄ ███    ███ ███    ███    ███   ███    ███   > ^ < \n" +
                        " /\\_/\\   ███    ███ ███▌ ███    █▀     ▀███▀▀██ ███    ███ ███▌   ███    ███   ███    █▀    /\\_/\\ \n" +
                        "( o.o )  ███    ███ ███▌ ███            ███   ▀ ███    ███ ███▌  ▄███▄▄▄▄██▀  ▄███▄▄▄      ( o.o )\n" +
                        " > ^ <   ███    ███ ███▌ ███            ███     ███    ███ ███▌ ▀▀███▀▀▀▀▀   ▀▀███▀▀▀       > ^ < \n" +
                        " /\\_/\\   ███    ███ ███  ███    █▄      ███     ███    ███ ███  ▀███████████   ███    █▄    /\\_/\\ \n" +
                        "( o.o )  ███    ███ ███  ███    ███     ███     ███    ███ ███    ███    ███   ███    ███  ( o.o )\n" +
                        " > ^ <    ▀██████▀  █▀   ████████▀     ▄████▀    ▀██████▀  █▀     ███    ███   ██████████   > ^ < \n" +
                        " /\\_/\\                                                            ███    ███                /\\_/\\ \n" +
                        "( o.o )                                                                                    ( o.o )\n" +
                        " > ^ <                                                                                      > ^ < \n" +
                        " /\\_/\\  /\\_/\\  /\\_/\\  /\\_/\\  /\\_/\\  /\\_/\\  /\\_/\\  /\\_/\\  /\\_/\\  /\\_/\\  /\\_/\\  /\\_/\\  /\\_/\\  /\\_/\\ \n" +
                        "( o.o )( o.o )( o.o )( o.o )( o.o )( o.o )( o.o )( o.o )( o.o )( o.o )( o.o )( o.o )( o.o )( o.o )\n" +
                        " > ^ <  > ^ <  > ^ <  > ^ <  > ^ <  > ^ <  > ^ <  > ^ <  > ^ <  > ^ <  > ^ <  > ^ <  > ^ <  > ^ < "
        );
    }

}

