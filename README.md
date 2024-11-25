# MAD-AI

## A Kotlin Simple example

```IShape``` est une interface qui définit trois propriétés
- aire et périmètre en lecture seule
- ancrage en lecture et écriture qui renvoie un Vecteur2D pour placer la figure géométrique

La classe ```Rectangle``` implémente l'interface ```IShape``` avec son propre constructeur

La classe ```Carre``` hérite de ```Rectangle```

La classe ```Vecteur2D``` est une classe de données qui définit un vecteur 2D

### Tests

La classe ```RectangleTest``` contient les tests unitaires pour la classe Rectangle.

### Commandes 

- pour compiler

```
mvn clean compile
```

- Commande pour lancer les test

```
mvn test
```

- Commande pour exécuter le main

```
mvn exec:java
```

