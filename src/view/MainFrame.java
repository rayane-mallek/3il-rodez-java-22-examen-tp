package view;

import model.Task;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/**
 * Classe principale représentant l'interface utilisateur de l'application.
 * Cette classe étend JFrame et gère l'affichage et l'interaction avec l'utilisateur.
 */
public class MainFrame extends JFrame {
    /**
     * Création de la fenêtre principale pour ajouter une tâche
     */
    public MainFrame() {
        JFrame fenetrePrincipale = new JFrame("Application");
        fenetrePrincipale.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetrePrincipale.setSize(800, 800);

        JPanel contentPane = new JPanel();

        JLabel labelTitre = new JLabel("Titre");
        JTextField titreField = new JTextField();
        contentPane.add(labelTitre);
        contentPane.add(titreField);

        JLabel labelDescription = new JLabel("Description");
        JTextField descriptionField = new JTextField();
        contentPane.add(descriptionField);
        contentPane.add(labelDescription);

        JLabel labelEcheance = new JLabel("Echeance");
        JTextField echeanceField = new JTextField();
        contentPane.add(echeanceField);
        contentPane.add(labelEcheance);

        JLabel labelPriorite = new JLabel("Priorité");
        JTextField prioriteField = new JTextField();
        contentPane.add(prioriteField);
        contentPane.add(labelPriorite);

        JLabel taskLabel = new JLabel("");
        contentPane.add(taskLabel);

        JButton btnLettre = new JButton("Soumettre");
        contentPane.add(btnLettre);
        btnLettre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Task t = new Task(titreField.getText(), descriptionField.getText(), echeanceField.getText(), prioriteField.getText());
                taskLabel.setText(t.toString());
            }
        });



        fenetrePrincipale.setContentPane(contentPane);
        fenetrePrincipale.setLocationRelativeTo(null);
        fenetrePrincipale.setVisible(true);
    }
}
