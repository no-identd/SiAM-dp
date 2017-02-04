Robert Ne�elrath
robert.nesselrath@dfki.de

Workspace f�r die Entwicklung der Dialog Plattform
---------------------------------------------------------------

Bei der Entwicklung werden OSGi und das Eclipse Modeling Framework verwendet. Daher ist es ratsam, die entsprechende Eclipse Modeling Tools Distribution als Entwicklungsumgebung zu verwenden. 
Download unter: http://www.eclipse.org/downloads/ => Modeling Tools => Plattform ausw�hlen.

Um sicherzustellen, dass die relativen Pfade richtig aufgel�st werden, sollte der Eclipse-Workspace ins das Verzeichnis "development" gelegt werden. Die Projekte werden wie folgt hinzugef�gt:
- File -> Import -> General -> Existing Projects into Workspace
- Als Verzeichnis das "development"-Verzeichnis (workspace) ausw�hlen
- folgende Projekte ausw�hlen und importieren (runtime-version)
	de.dfki.iui.mmds.app_example
	de.dfki.iui.mmds.app_example.model
	de.dfki.iui.mmds.core
	de.dfki.iui.mmds.core.model
	de.dfki.iui.mmds.dialogue
	de.dfki.iui.mmds.io.html
	de.dfki.iui.mmds.io.rest.registry
	de.dfki.iui.mmds.scxml
	de.dfki.iui.mmds.scxml.edit
	de.dfki.iui.mmds.scxml.engine
	de.dfki.iui.mmds.speech_recognition
	de.dfki.iui.mmds.speech_recognition.nuance
	de.dfki.iui.mmds.targetplatform

Das Projekt ist gegen die Target Plattform im Verzeichnis DialoguePlatform\targetplatform entwickelt. Dies wird in Eclipse wie folgt eingestellt:
- Window => Preferences
- Plugin-Development => Target Platform
- de.dfki.iui.iui.mmds.targetplatform f�r die korrekte Plattform ausw�hlen
- mit H�kchen aktivieren
- OK
- Abwarten bis Projekte kompiliert wurden
- de.dfki.iui.mmds.app_example �ffnen
- DialoguePlatform(shared).launch starten

If there are unresolved references, you can edit the runtime configuration and, under OSGi Framework > DialoguePlatform(shared), uncheck everything,
then check only the "app_example", then click "Add required bundles", and "Apply".
If you are receiving an exception that indicates a wrong workspace directory, make sure the bundle "org.eclipse.com.resources" is not checked in the
run configuration.


Verwendung des zentralen Loggings
----------------------------------------------------------------
F�r einen Bundle�bergreifenden Logging-Dienst wird Pax-Logging verwendet. Diese library ersetzt/simuliert die Logdienste diverser Anbieter:
- JDK Logging API support.
- Avalon Logger API support.
- SLF4J API support.
- Knopflerfish Log service support.
- Tomcat Juli API support.
- log4J API support

Lognachrichten dieser APIs werden abgefangen und �ber den OSGi LogService an eine Log4j Backendimplementierung weitergeleitet. 
Eine zentrale Konfiguration des log4j-Services ist �ber die org.ops4j.pax.logging.properties-Datei im core-Bundle unter confadmin/services m�glich. Diese wird �ber den OSGi-eigenen ConfAdmin-Service initialisiert.
In Targetplattform sowie classpath eines Bundles darf keine Originalimplementierung eines Logdienstes vorhanden sein. Stattdessen wird im Manifest das Bundle org.ops4j.pax.logging.pax-logging-api eingebunden.
