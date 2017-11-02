# THProjectX

Dieses Projekt beinhaltet die Ausführung der [Aufgabenstellungen](https://olat.vcrp.de/auth/RepositoryEntry/1676804160/CourseNode/96508359362599) des Informatik Modules 2017 der TH Bingen.


## Autoren

Im Team sind:

- [Felix](https://github.com/FlixsTHB)

- [Robin](https://github.com/RobinGoetz)

- [Matthias](https://github.com/Matze93)

- [Sven](https://github.com/zvenon)


Die Vorlesung des Kurses und Moderation/Überwachung der Ausführung führt [Nicolai Parlog](https://github.com/nicolaiparlog).


## Sprache(Language)

Der Code wird in Englisch verfasst. Die Konversationen auf Github sowie die Kommentare im Code werden in Deutsch geschrieben.

English: The code is written in English. Conversations on Github and Comments (code) are written in German.

 

## License & copyright

Lizensiert unter [MIT License](LICENSE)

copyright: THBingen Github 

## Code of Conduct

Der [Verhaltenskodex](CodeOfConduct) für Open-Source-Communities wird beachtet und respektiert.

## Wichtige Hinweise

Mergen: Auf dem Masterbranch nur nach Freigabe durch Betreuer Nicolai Parlog!

CSV:Die Notierung der gewünschen Segmente fängt bei 0 an (statt wie gewohnt bei 1). In der Importtabelle müssen die     gewünschten Segmente mit einer Zahl von 0 - 4 vemerkt werden.

## Ausführen der Applikation

Laden Sie sich die Datei in "Release" herunter. Um die Anwendung zu starten öffnen Sie Ihr PowerShell und begeben sich in den Ordner, in dem die `jar-file` enthalten ist.
Nun geben Sie folgenden Befehl ein:

`java -jar THBingen-2.1-jar-with-dependencies.jar`

Mit Release 2.1 wird eine simple Kapazitätssimulation erstellt. Das Programm ließt einen Fahrplan, als .csv Datei ein. Aus der Importdatei werden die "Zug-ID" und das gewünsche Segment ausgelesen. Das Zugnetzwerk besteht aus 5 Segmenten, die wiedrum je einer Kapazität für 3 Züge haben. Überschreitet die Anzahl der Zuganfragen die verfügbare Kapazität eines der einzelnen Segmete, entsteht ein Stau. Alle Züge mit identischem Segment und einer Kapazitätsüberschreitung, verspäten sich. Die Ergebnisse der Kapazitätsübeprfung werden in einer Output-Datei im .csv Format ausgegeben. 

## Projektabschluss - Dokumentation Fortschritt Milestone 3 "Extend Simulation By Making It More Configurable"

Abgeschlossene Releases: 2 
Auf dem Masterbranch befinden sich alle Programmfortschritte inklusive folgender gelöster Problemstellungen von Milestone 3: 

1. Die Anzahl der Segmente ist konfigurierbar. 

2. Kapazität der Segmente ist konfigurierbar.

3. Es verspäten sich nur so viele Züge, wie die Kapazität eines Segments überschreiten. Alle anderen Züge haben freie Fahrt. Die Auswahl welche Züge sich verspäten wird jedoch nicht randomisiert. 

4. Aufgrund missverstandener Aufgabenstellung wird nicht die segmentspezifische Gesamtkapazität sowie die verbleibende Kapazität pro Segment ausgegeben, sondern es wird im Code die Gesamtkapazität des Netzwerks (total capacity) sowie die verbleibende Kapazität aller Segmente ausgegeben.

Alle Ergebnisse werden in einer CSV und-/oder der Konsole ausgegeben. Scenario- und External-Funktion wurden dazu jeweils entsprechend geupdated. 

