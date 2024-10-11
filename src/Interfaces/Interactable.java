package Interfaces;

import personnage.Personnage;

import java.awt.*;

public interface Interactable {
     void interact(Personnage personnage);

    void interact(Personnage player, Menu menu);
}
