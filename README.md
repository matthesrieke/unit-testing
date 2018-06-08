# KSwe SoSe 2018 - Unit Testing

Für verschiedene Methoden von Klassen sollen Unit Tests erstellt werden. Als
Testing-Framework soll JUnit zum Einsatz kommen

Die Klassen und Methoden sind zum Teil bereits vorhanden. Die Test-Klassen
sind ebenfalls bereits vorhanden, jedoch fehlt die Funktionalität der Tests.


## Aufgabe

Zunächst muss JUnit als Abhängigkeit zum Projekt hinzugefügt werden (--> 
Test-Scope!). Implementier dann für folgende Klassen die entsprechenden Test:

* `BubbleSort`
* `Line`

Die Klasse `Polygon` verfügt über eine leere Methode `calculateLength()`.
Entwickle die entsprechende Funktionalität (Umfang des Polygons) mit Hilfe
von Test-Driven Development in der Klassen `PolygonTest`. Achte bei den Testfällen
darauf, dass die Polygone geschlossen sein sollen (letzer Punkt = erster Punkt).
