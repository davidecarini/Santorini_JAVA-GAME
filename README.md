# lebestie_ingsw2020

Repository Prova Finale di Ingegneria del Software - Anno Accademico 2019/2020, Gruppo Le Bestie

----

## PROJECT
The aim of the project is to implement the board game **Santorini** following the architectural model (MVC) for the realization of the model according to the object-oriented programming paradigm (OOP).
The sistem is distributed and it's composed by only one server and multiple clients. 
The game has been developed in JAVA as a Software Engineering project at Politecnico di Milano.
<p align="center">
  <img src="./readmePic/SantoriniBoardGame1.png" width="350" alt="SantoriniBoardGameIMG">
</p>

#### SYSTEM ARCHITECTURE
<p align="center">
  <img src=".\readmePic\systemArchitecture.png" alt="model">
</p>

## TEAM MEMBERS
<table style="margin-left: auto; margin-right: auto">
<thead>
<tr><th>NAME</th><th>EMAIL</th></tr>
</thead>
<tbody>
<tr><td><a href="https://github.com/veronicarovelli">Veronica Rovelli<a/></td><td align="center">veronica.rovelli@mail.polimi.it</td> </tr>
<tr><td><a href="https://github.com/lulol38"> Luca Ferrari <a/></td><td align="center">luca.ferrari23@mail.polimi.it</td></tr>
<tr><td><a href="https://github.com/davidecarini">Davide Carini<a/></td><td align="center">davide.carini@mail.polimi.it</td></tr>
</tbody>
</table>

## DESCRIPTION BOARD GAME
Santorini is an abstract strategy board game for 2-4 players(we implements the game for only 2 or 3 players) designed and released in 2004 by Gordon Hamilton and republished via Kickstarter in 2016 by Roxley Games. Inspired by the architecture of cliffside villages on Santorini Island in Greece, and primarily designed for two players, the game is played on a 5x5 grid of squares where each turn players build a town by placing building pieces up to three levels high. 
#### VICTORY CONDITIONS
The object of the game is to win by either moving a worker to stand on the third level above the base of the board, or alternatively to manouver so your opponent cannot move on his turn.

Complete rules are available [HERE](http://www.craniocreations.it/prodotto/santorini/). :point_left:

## FEATURES IMPLEMENTED
```
- [X] Simplified Rules
- [X] Complex Rules
- [X] Socket (TCP connection)
- [ ] CLI
- [X] GUI
- [X] Multiple Concourrent Games
- [ ] Undo
- [ ] State of Game Persistent 
- [X] Advanced Gods *
```
*Five advanced gods: Ares, Triton , Hestia, Poseidon, Zeus.

## DOCUMENTATION
### UML
Uml files are in UML <a href="https://github.com/lulol38/lebestie_ingsw2020/tree/master/UML/initial%20UML"> directory </a> with a pdf file that describes functioning of the model.


## SW & TOOLS
* **Maven** - Dependecy Manager tool
* **IntelliJ Idea Ultimate Edition** - IDE
* **StarUML** - UML tool
* **JavaFX** - Standard GUI library for JAVA SE
* **Scene Builder** - Visual Layout Tool

## HOW TO PLAY

### Client
```
java --module-path javafx-sdk-14/lib --add-modules javafx.controls --add-modules javafx.fxml -jar client.jar
```



### Server
```
java -jar Server.jar
```


### GOOD FUN! :call_me_hand:

## CREDITS AND LICENSE
Santorini is a trademark of Gordon Hamilton and Roxley Games.

The graphical resources copyright is held by Roxley Games, which provided the mentioned resources for educational purposes only.

Copyright (C) 2020 Davide Carini, Veronica Rovelli, Luca Ferrari
