import java.util.Scanner;


public class Menu {

private String name;
private String type;
private Personnage player;

    public void menu() {

    }


    public Personnage createCharacter() {
        intro();
        getUserName();
        wait(400);
        getUserType();
        wait(800);
        choices();
        return new Personnage(name, type);

    }


    public static void wait(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    };

    public void intro() {
        System.out.println(
                "*----------BIENVENUE AVENTURIER !----------*\n" +
                        "*------------------------------------------*\n" +
                        "   Commençons par créer votre personnage\n" +
                        "*------------------------------------------*\n"

        );
    }

    public void getUserName() {
        Scanner userInputName = new Scanner(System.in);
        System.out.println("Entrez votre nom : ");
        String userName = userInputName.nextLine();
        System.out.println("Bienvenue " + userName);
        this.name = userName;
    }

    public void getUserType() {
        Scanner userInputType = new Scanner(System.in);
        System.out.println("Choix de votre classe : " +
                "\ntapez le numéro de la classe choisie" +
                "\n[1] Guerrier" +
                "\n[2] Magicien");
        int userType = userInputType.nextInt();

        switch (userType) {
            case 1:
                this.type = "Guerrier";
                System.out.println(
                        "*------------------------------------------*\n" +
                                "Votre classe : " + this.type + "\n" +
                                "*------------------------------------------*\n");
                break;

            case 2:
                this.type = "Magicien";
                System.out.println(
                        "*------------------------------------------*\n" +
                                "Votre classe : " + this.type + "\n" +
                                "*------------------------------------------*\n");
                break;
            default:
                System.out.println("Aucune classe n'est associée à votre choix.");
                wait(300);
                getUserType();
        }

    }

    public void choices() {
        Scanner userChoiceInput = new Scanner(System.in);
        System.out.println("Par quoi on commence ?\n" +
                "[1] Je veux voir mon personnage\n" +
                "[2] Je veux modifier mon personnage\n" +
                "[3] Commencer le jeu !\n" +
                "[4] Quitter le jeu \n"
        );
        int userChoice = userChoiceInput.nextInt();

        switch (userChoice) {
            case 1:
                Personnage player = new Personnage(name, type);
                System.out.println(player);
                wait(300);
                choices();
                break;
                case 2:
                    getUserName();
                    wait(400);
                    getUserType();
                    wait(800);
                    choices();
                    break;
                    case 3:
                        //commencer le jeu
                        break;
                        case 4:
                            System.out.println("Ciao !");
                            wait(300);
                            System.exit(0);
                            break;
                            default:
                                System.out.println("Choix invalide");
                                wait(6000);
                                choices();
        }


    }

}
