# Analyse : EvaluationAssistant

## Déscription générale  

Les enseignant produisent des évaluations toute l'année pour chacun de leurs cours. Chaque enseignant produit ses propres questions par ses propres moyen, que ce soit, à partir de leur imagination, en reprant une question d'un collègue, d'un manuel, d'une évaluation précedente. 

A l'aide de ces questions ils composent une évaluation. Cette évalutation est en géneral sauvgarder par l'enseignant lui-même quelque part, sur une clé usb, dans un disque dur, etc... 

Les années suivantes, ils peuvent réutiliser ces intérrogations, s'ils la retrouvent. Pour la modifier légérement afin que les élèves redoublant n'aient pas à refaire exactement la même évaluation.

Ce travail est rédondant, car répété par *tous* les enseignants, pour les même sujet au seins des mêmes écoles, dans le même pays. Sans compter le temps investit dans le traitement de text, detérminer la cotation, grille d'évaluation. Cotation qui sera peut-être amener à changer si l'enseignant juge que les résultats ne sont pas révélateur du niveau montré lors de ces évaluation.

Même s'il reçoit souvent moins de soin, toute séance d'exercisation préparée s'inscrit géneralement dans cet démarche.

Tout cela représente un investissement de temps important pour chaque enseignant, temps qui pourrait-être investit dans leur activiter principale, enseigner et remédier au lacune soulevé par ces évaluation.

## Objectif

L'application "EvaluationMaker" doit dans un premier temps apporter un support technique à ce process par la platform elle-même, un cadre dans ce processus, faciliter la réalisation de ces évaluations (mise en page), la sauvgarde dans des questions et des évalutation, la possibilité de retroouver ces questions et ces évalution, la possibilités de les partager (dans un cercle restreint tel qu'un groupe de collègue ou à tout utilisateur de l'application)

## User stories

En tant qu'enseignant je peut :

Question


- Rechercher une question

Utilisation

- Créer un compte utilisateur
- Modifier une question existante

- - Proposer une modification à la question d'un utilisateur
Se connecter à son compte
- Afficher la liste de toutes les évaluations créee

## Walking skeleton

Dans une première itération du projet, les point requis sont les suivants :

- Créer une question et la sauvegarder
- Rechercher une question
- Composer une interrogation en Selectionnant plusieurs question existante

## Détails d'implémentation

### Créer une question

#### création

- Requirement
Il faut pouvoir créer une nouvelle question (cf. détail du contenu d'une question)

Tous les utilisateurs ayant le statut enseignant peuvent créer une question

## Entités

Pour que le projet soit fonctionnel il faut définir les entités suivante :

### Utilisateurs

- Nom
- prénom
- Adresse mail
- Mot de passe
- Id user

### Questions

- Titre
- Enoncé
- Sujet
- Id Question

### Liste questions

- Titre de la liste
- Liste des questions sélectionnées
