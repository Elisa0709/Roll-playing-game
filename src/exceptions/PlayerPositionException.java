package exceptions;

public class PlayerPositionException extends Exception {
    public PlayerPositionException() {
    }

    public String getMessage(){
        return "Dépassement du plateau";
    }
}

