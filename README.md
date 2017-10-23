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

## Ausführen der Applikation

Bevor die Applikation ausgeführt werden kann muss sich zuerst eine lauffähige Maven-Version auf dem PC befinden. 
Eine Anleitung zur Installation finden Sie [hier](https://maven.apache.org/install.html).

Wenn Maven eingerichtet ist, kann die Source Datei aus der neuesten Version des Realeses heruntergeladen werden.
Die `.jar` wird dann durch den Buidltool Maven aus dem Kotlin Code der vorliegenden Version kompiliert und erst daduch
auch für Personen nutzbar, die nicht über Kotlin verfügen. 


Folgende Schritte sind nach dem herunterladen durchzuführen:

1. In Windows Powershell navigieren Sie über den Befehl `cd "DateiPfad"` hin zu Ihrer heruntergeladenen `pom.xml` Datei.     

Als Beispiel (wenn sich die `pom.xml` in THProjectX befinden würde): `cd D:\Info\THProjectX`

2. Anschließend führen Sie in der Kommandozeile den Befehl `mvn clean install` aus um die Kotlin Datei über das Buildtool Maven zu kompilieren.

3. Nun wird ein ein neuer Ordner "Target" erstellt worden sein, der die `.jar` Datei enthält.
In dem vorliegendem Beispiel heist diese Datei `THBingen-1.0-SNAPSHOT.jar`
