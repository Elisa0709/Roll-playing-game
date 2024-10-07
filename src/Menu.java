import java.util.Scanner;


public class Menu {


    public void menu() {

    }

    public Personnage createCharacter() {
        String name = getUserName();
        wait(400);
        String type =getUserType();
        wait(800);

       Personnage player = new Personnage(name, type);
       return player;
    }
//    public Personnage getPlayer(String name, String type) {
//        return new Personnage(name, type);
//    }

    public static void wait(int ms) {
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
        }
            return "";
    }


    public int choiceMenu(){
        Scanner userChoiceInput = new Scanner(System.in);
        System.out.println("Par quoi on commence ?\n" +
                "[1] Je veux voir mon personnage\n" +
                "[2] Je veux modifier mon personnage\n" +
                "[3] Commencer le jeu !\n" +
                "[4] Quitter le jeu \n"
        );
        return userChoiceInput.nextInt();
    }






}
