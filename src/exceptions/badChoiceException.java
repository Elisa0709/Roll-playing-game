package exceptions;

public class badChoiceException extends Exception {
    public badChoiceException() {
        System.out.println("Choix invalide. Merci de réessayer.");
    }
}
