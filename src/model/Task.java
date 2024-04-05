package model;

import java.io.Serializable;

/**
 * Classe Task
 */
public class Task implements Comparable, Serializable {
    private int id;
    private String titre;
    private String description;
    private String dateEcheance;
    private String priorite;

    /**
     * Constructeur de la classe Task
     */
    public Task(int id, String titre, String description, String dateEcheance, String priorite) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.dateEcheance = dateEcheance;
        this.priorite = priorite;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", description='" + description + '\'' +
                ", dateEcheance='" + dateEcheance + '\'' +
                ", priorite='" + priorite + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public String getDescription() {
        return description;
    }

    public String getDateEcheance() {
        return dateEcheance;
    }

    public String getPriorite() {
        return priorite;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDateEcheance(String dateEcheance) {
        this.dateEcheance = dateEcheance;
    }

    public void setPriorite(String priorite) {
        this.priorite = priorite;
    }

    @Override
    public int compareTo(Object o) {
        return ((Task) o).getId() - getId();
    }
}
