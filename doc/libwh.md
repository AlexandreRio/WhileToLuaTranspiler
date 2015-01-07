Ce document sert à faire le point sur ce que doit réaliser la libWH.

Tout d'abord elle doit être écrite en lua, le langage cible.

Elle sert de support aux programmes compilés en Lua depuis While,
dans les programmes compilés il y aura des imports de ce fichier.

La libWH doit, entre autre réaliser les fonctions suivantes :
* permettre la manipulation des arbres binaires que sont les variables
  (création et évaluation)
* gérer les appels de fonction, initialisation des variables à nil etc
