# SEW PROJEKT - TETRIS
Florian Doppler, Mia Mandel, Daniel Schobesberger, Nico Siegl

---

## Aufgabenstellung
Wir (Doppler, Mandel, Schobesberger, Siegl) möchten ein Tetris-Spiel mithilfe von Java realisieren. Unsere Umsetzung sollte alle Schritte, genauso wie sie im echten Tetris vorhanden sind, beherrschen. Unser Ziel ist dabei nicht nur, ein simples Spiel zu entwickeln, sondern auch, schon Gelerntes geschickt anzuwenden, und uns auch Neues mithilfe von Tutorials oder verschiedensten Foren im Internet beizubringen.

---

## Umsetzung & Ideen
Es öffnet sich ein Fenster, mit folgenden Informationen:

* Spielfeld (Raster)
* nächster Block
* Score
* Highscore

Vom Himmel herab fallen Blöcke in einer zufälligen Form und in einer zufälligen Farbe. Diese können mithilfe der Richtungs-Tasten (◀️🔼🔽▶️) beliebig gesteuert und somit verformt und verschoben werden. Oben rechts befindet sich die Anzeige des nächsten herabfallenden Blocks, darunter der derzeitige Score und der in einer früheren Runde erzielte Highscore.

Falls eine Reihe vollständig ausgefüllt wird, verschwindet diese, und der Score-Zähler am rechten Rand wird erhöht. Falls dies nicht der Fall ist, wird das Spielfeld immer größer - bis es schließlich zu Ende ist. Falls das Ende erreicht wird, startet sich das Spiel einfach nochmal neu. Abbrechen kann man das Spiel mit einem kleinen X in der rechten oberen Ecke.

Für die Umsetzung planen wir ungefähr 4 Wochen ein, wobei jeder von uns ungefähr 20 Stunden daran arbeiten & darin eingebunden werden sollte.

---

![img](/SKETCH.jpg)

---

## Klassendiagramm (UML)
Zur Umsetzung benötigen wir auch jede Menge Klassen, Methoden und Variablen. Diese sind im unten dargestellten Klassendiagramm aufgezählt.

![img](/CLASS-DIAGRAM.jpg)

---

## Bugs
Diese Bugs hatten wir bei der Entwicklung:

* import-Errors
* Interface-Error beim Start des Spiels
* Key-Handler
* Rotieren der Blöcke
* Highscore (Zähler)

---

## Time-Management

| Datum          | Uhrzeit          | Task                                              | Name                                     |
| -------------- |:-------------:   |:-------------------------------------------------:|:----------------------------------------:|
| 28.04.2020     | 15:30 - 17:15    | Planung, Ideen & Konzepte & Script                | Doppler, Mandel, Schobesberger, Siegl    |
| 29.04.2020     | 14:00 - 16:00    | Skizze                                            | Doppler                                  |
| 29.04.2020     | 15:00 - 17:00    | Interface, Variablen, Start                       | Schobesberger                            |
| 12.05.2020     | 16:00 - 19:00    | Logik des Spiels                                  | Mandel                                   |
| 13.05.2020     | 16:00 - 19:30    | Blöcke zum Spiel hinzugefügt                      | Siegl                                    |
| 25.05.2020     | 16:00 - 19:00    | An Collision gearbeitet                           | Doppler                                  |
| 25.05.2020     | 19:00 - 20:15    | Ein paar Bugs gefixt                              | Siegl                                    |
| 26.05.2020     | 13:00 - 15:00    | Wall-Collision                                    | Siegl                                    |
| 08.06.2020     | 18:00 - 20:00    | Interface & Menu                                  | Mandel                                   |
| 08.06.2020     | 19:00 - 21:00    | UML (Class Diagram)                               | Doppler                                  |
| 08.06.2020     | 16:00 - 20:00    | Menu - Bugs gefixt                                | Mandel, Schobesberger, Siegl             |
| 08.06.2020     | 20:00 - 21:15    | Bugs gefixt                                       | Mandel, Schobesberger, Siegl             |
| 15.06.2020     | 16:00 - 17:30    | Ausarbeitung der Bugs                             | Doppler, Schobesberger                   |
| 15.06.2020     | 18:00 - 21:00    | Präsentation                                      | Doppler                                  |