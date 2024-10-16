import ennemis.Ennemi;
import equipement.offensif.EquipementOffensif;
import personnage.Personnage;

import java.util.Scanner;
public class Menu {
    /**
     * Permet de différer l'exécution de la prochaine action.
     *
     * @param ms Le nombre de millisecondes pendant lesquelles le programme doit être en pause.
     */
    public void wait(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    /**
     * Demande à l'utilisateur de saisir son nom et le retourne.
     *
     * @return Le nom de l'utilisateur saisi.
     */
    public String getUserName() {
        Scanner userInputName = new Scanner(System.in);
        System.out.println("Entrez votre nom : ");
        String userName = userInputName.nextLine();
        System.out.println("Bienvenue " + userName);
        return userName;
    }

    /**
     * Demande à l'utilisateur de choisir un type de personnage et le retourne.
     * Les choix disponibles sont Guerrier ou Magicien.
     *
     * @return Le type de personnage choisi par l'utilisateur.
     */
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

    /**
     * Affiche le menu de démarrage du jeu et retourne le choix de l'utilisateur.
     *
     * @return Le choix de l'utilisateur.
     */
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

    /**
     * Affiche le type de personnage de l'utilisateur.
     *
     * @param type Le type de personnage de l'utilisateur.
     */
    public void displayType(String type) {
        System.out.println(
            "*------------------------------------------*\n" +
            "Votre classe : " + type + "\n" +
            "*------------------------------------------*\n");
    }

    /**
     * Affiche le message d'introduction du jeu.
     */
    public void displayIntro(){
        System.out.println(
            "*----------BIENVENUE AVENTURIER !----------*\n" +
            "*------------------------------------------*\n" +
            "   Commençons par créer votre personnage\n" +
            "*------------------------------------------*\n"
        );
    }

    /**
     * Affiche la valeur d'un lancer de dé.
     *
     * @param dice La valeur du dé lancé.
     */
    public void displayValueDice(int dice){
        System.out.println("+-----+\n" +
                "|  " + dice + "  |\n" +
                "+-----+");
    }

    /**
     * Affiche la position actuelle du joueur sur le plateau.
     *
     * @param playerPosition La position du joueur sur le plateau.
     */
    public void displayPlayerPosition(int playerPosition) {
        System.out.println("Vous êtes sur la case "+playerPosition+" sur 64");
    }

    /**
     * Affiche le menu de lancer de dé, voir son personnage, boire une potion ou quitter le jeu .
     */
    public void displayMenuRollDice(){
        System.out.println("A vous de jouer\n" +
                "[1] Lancer le dé\n" +
                "[2] Voir mon personnage\n"+
                "[3] Boire une potion\n"+
                "[4] Quitter le jeu"
        );
    }

    /**
     * Affiche le menu permettant de choisir quelle potion consommer.
     */
    public void displayPotionMenu(){
        System.out.println("Quelle potion voulez-vous boire ?\n" +
                "[1] Potion ( +2 PV )\n" +
                "[2] Grande potion ( +5 PV)");
    }

    /**
     * Affiche un message lorsque le joueur n'a pas de grande potion dans son inventaire.
     */
    public void displayNoPotionInStock(){
        System.out.println("Bien essayé, mais vous n'avez pas de potion.\n" +
                "Dommage.");
    }

    /**
     * Affiche un message lorsque le joueur n'a pas de potion dans son inventaire.
     */
    public void displayNoBigPotionInStock(){
        System.out.println("Bien essayé, mais vous n'avez pas de grande potion.\n" +
                "Dommage.");
    }

    /**
     * Affiche un message confirmant que le joueur a bu une potion.
     */
    public void displayPotionDrunk(){
        System.out.println("Vous avez bu une potion.");
    }

    /**
     * Affiche le menu de victoire avec les options de rejouer ou de quitter le jeu.
     */
    public void displayEndMenu(){
        System.out.println(
                "[1] Rejouer\n" +
                "[2] Quitter le jeu\n");
    }

    /**
     * Affiche un message de fin lorsque le joueur quitte le jeu.
     */
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

    /**
     * Affiche un message d'erreur lorsque l'utilisateur entre un choix invalide.
     */
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

    public void displayLootEquipementOffensif(EquipementOffensif equipement, Personnage player){
        System.out.println(equipement.toString());
        System.out.println("Bravo, l'objet "+equipement.getWeaponName()+" augmente votre force de " + equipement.getWeaponAttack() +
                ". Votre force d'attaque total est maintenant de " +
                (player.getForceAttaque()+equipement.getWeaponAttack()));
    }

    /**
     * Affiche un mesage d'erreur si le player essaye d'équiper une arme incompatible avec sa classe
     */
    public void displayInvalidLoot(EquipementOffensif equipement){
        System.out.println(equipement.toString());
         System.out.println("Votre classe ne vous permet pas d'équiper cet objet.");

    }

    /**
     * Affichage du menu pour : attaquer l'ennemi, voir les statisqtiques du personnage, boire une potion ou quiiter le programme.
     * Récupère le choix de l'utilisateur sous forme d'un nombre entier
     * @return choix de l'utilisateur (int)
     */
    public int displayFightMenu() {
        System.out.println("*______________________________________*\n" +
                "A vous de jouer\n" +
                "[1] à l'attaque !\n" +
                "[2] voir mes statistiques\n" +
                "[3] c'est trop pour moi, je quitte le jeu");
        Scanner userChoiceInput = new Scanner(System.in);
        return userChoiceInput.nextInt();
    }

    /**
     * Affiche les caractéristiques de l'ennemi présent. PV et nom.
     * @param ennemi objet représentant l'ennemi à affronter et qui implémente la classe abstraite Ennemi
     */
    public void displayEnemyStatistic(Ennemi ennemi){
        System.out.println(ennemi.getPicture());
        System.out.println("Vous rencontrez un "+ennemi.getEnnemyName()+"\n" +
                "Points de vie : " + ennemi.getEnnemyPV() + "\n" +
                "Force d'attaque " + ennemi.getEnemyforceAttack() + "\n");
    }

    /**
     * Afficher l'issue du combat
     * Que l'ennemi soit mort ou pas
     * @param ennemi représente l'ennemi engagé dans le combat
     */
    public void displayEndAttack(Ennemi ennemi){
        System.out.println("Vous infligez une puissante attaque au " + ennemi.getEnnemyName() + "\n");
        wait(300);
        wait(300);
        System.out.println("Le "+ennemi.getEnnemyName()+ " vous inflige à son tour une attaque\n" +
                " Vous perdez "+ennemi.getEnemyforceAttack()+" PV.");
        if (ennemi.getEnnemyPV() > 0) {
            System.out.println("Vexé, le " + ennemi.getEnnemyName() + " s'enfuit en courant.\n" +
                    "Il ne lui reste plus que " + ennemi.getEnnemyPV() + " PV.\n");
            wait(300);
        } else {
            System.out.println("Votre force n'a aucune limite.\n" +
                    "le " + ennemi.getEnnemyName() + " est mort.");
        }

    }

    /**
     * Affiche la mort du player
     */
    public void displayDeadPlayer(){
        System.out.println(
                "           ______\n" +
                        "        .-\"      \"-.\n" +
                        "       /            \\\n" +
                        "      |              |\n" +
                        "      |,  .-.  .-.  ,|\n" +
                        "      | )(__/  \\__)( |\n" +
                        "      |/     /\\     \\|\n" +
                        "      (_     ^^     _)\n" +
                        "       \\__|IIIIII|__/\n" +
                        "        | \\IIIIII/ |\n" +
                        "        \\          /\n" +
                        "         `--------`\n" +
                        "*-------VOUS ÊTES MORT-------*"
        );
    }

    /**
     * Affiche un message de victoire
     */
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

