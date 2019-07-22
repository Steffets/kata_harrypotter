#Kata: Harry Potter
###Beschreibung:

Ein Buchhändler hat sich ein neues Rabattsystem für Harry Potter Bücher einfallen lassen. Sie sollen dieses Rabattsystem implementieren und für den Kunden immer das günstigste Angebot berechnen.

###Aufgabe:
Ein Buch kostet 8€ und es gibt aktuell nur 5 verschiedene Bände.
Beim Kauf von 2 unterschiedlichen Büchern gibt es einen Rabatt von 5%, bei 3 10%, bei 4 20% und bei 5  gibt es 25%  auf diese Bücher.
Kauft ein Kunden Bücher mehrfach, kosten diese regulär 8€, außer sie ergeben ein neues Rabattset.
Sie sollen dem Kunden das günstigste Angebot berechnen.

###Hinweis:
Wenn man zum Beispiel 4 Bücher mit 3 unterschiedlichen Titeln kauft, bekommt man 10% für die 2 Bücher die ein Set bilden aber das vierte Buch kostet immernoch 8 EUR.

Eingabe: 2 x Band 1, 2 x Band 2, 2 x Band 3, 1 x Band 4 und 1 x Band 5.
Rechnung: (4 * 8) - 20% [Band 1, Band 2, Band 3, Band 4]
+ (4 * 8) - 20% [Band 1, Band 2, Band 3, Band 5]
= 25.6 * 2
= 51.20
Ausgabe: Das günstigste Angebot für den Kunden ist 51,20€!


**Erweiterung**:
Mittlerweile  sind zwei neue Bände erschienen und der Buchhändler möchte weiterhin das alte Rabattsystem behalten aber es soll zusätzlich auch mit einem neuen Rabattsystem funktionieren.  2 Bücher = 5%, 3 Bücher = 10%, 4 Bücher = 15%, 5 = 20%, 6 = 25% und 7 = 30%.
