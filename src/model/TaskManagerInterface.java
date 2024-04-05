package model;

import java.util.List;

public interface TaskManagerInterface {
    /**
     * Ajoute une tâche
     */
    void ajouterTache(Task tache);

    /**
     * Modifie une tâche
     */
    void modifierTache(Task tache);

    /**
     * Supprime une tâche
     */
    void supprimerTache(Task tache);

    /**
     * Récupère la liste des tâches
     */
    List<Task> getTaches();
}
