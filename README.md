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

`java -jar THBingen-2.0-SNAPSHOT-jar-with-dependencies.jar`

Mit Release 2.0 wird eine simple Kapazitätssimulation erstellt. Das Programm ließt einen Fahrplan, als .csv Datei ein. Aus der Importdatei werden die "Zug-ID" und das gewünsche Segment ausgelesen. Das Zugnetzwerk besteht aus 5 Segmenten, die wiedrum je einer Kapazität für 3 Züge haben. Überschreitet die Anzahl der Zuganfragen die verfügbare Kapazität eines der einzelnen Segmete, entsteht ein Stau. Alle Züge mit identischem Segment und einer Kapazitätsüberschreitung, verspäten sich. Die Ergebnisse der Kapazitätsübeprfung werden in einer Output-Datei im .csv Format ausgegeben.   
