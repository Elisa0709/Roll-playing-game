package Interfaces;

import personnage.Personnage;

import java.awt.*;
/**
 * Interface représentant un objet interactif dans le jeu.
 * Les classes qui implémentent cette interface doivent fournir
 * une façon d'interagir avec un personnage.
 */
public interface Interactable {

     /**
      * Interagit avec le personnage passé en paramètre.
      *
      * @param player Le personnage qui interagit avec l'objet.
      *               Cette méthode peut modifier l'état du personnage
      *               en fonction de l'objet interactif.
      */
     void interact(Personnage player);
}
