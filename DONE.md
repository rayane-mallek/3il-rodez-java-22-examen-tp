# Réalisations du Projet de Gestion de Tâches en Java

Ce document récapitule les réalisations effectuées dans le cadre du TP de gestion de tâches en Java.

## Fonctionnalités implémentées

### Ajout d'une tâche

- [x] Formulaire de saisie des détails de la tâche.
- [x] Bouton "Ajouter".
- [ ] Test unitaire associé.

Manque tests unitaires.

### Modification d'une tâche

- [ ] Mécanisme de sélection et de modification de la tâche.
- [ ] Bouton "Modifier".
- [ ] Test unitaire associé.

(Explication et justification de ce qui a été fait...)

### Suppression d'une tâche

- [ ] Mécanisme de sélection et de suppression de la tâche.
- [ ] Bouton "Supprimer".
- [ ] Test unitaire associé.

(Explication et justification de ce qui a été fait...)

### Visualisation des tâches

- [x] Affichage des détails des tâches existantes.
- [ ] Mécanisme de filtrage ou de tri des tâches.
- [ ] Test unitaire associé.

(Explication et justification de ce qui a été fait...)

### Gestion des priorités

- [x] Possibilité de définir la priorité lors de l'ajout ou de la modification de la tâche.
- [ ] Test unitaire associé.

J'ai implémenté la possibilité d'ajouter une priorité à la création

### Possibilité d'évolution

- [ ] Description claire des fonctionnalités potentielles à ajouter dans le futur pour améliorer l'application.
- [ ] Réflexion sur la modularité et la scalabilité de l'application pour faciliter les évolutions futures.

En soit, il y a beaucoup de possibilité d'évolution. On peut penser à ajouter la modification et la suppression d'une tâche, puis les enregistrer dans un fichier texte ou une base de données. Le code respecte les principes SOLID + MVC, il est facilement améliorable.
## Bonus

### Implémentation de la sérialisation des tâches

- [ ] Sauvegarde des tâches lors de la fermeture de l'application.
- [ ] Chargement des tâches lors de l'ouverture de l'application.
- [ ] Test unitaire associé.

Sérialisation faite (implémentation de l'interface dans Task)