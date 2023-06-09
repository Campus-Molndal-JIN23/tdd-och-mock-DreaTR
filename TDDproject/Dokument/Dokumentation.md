# Projektrapport: 
Inlämningsuppgift i Test-Driven Development (TDD)

## Gruppen
..
### Ert namn
Andrea Torres

### Medlemmar i gruppen
..
# Beskrivning av projektet
Vi skulle skapa en webbaplikation som hämtar väderprognoser för en stad. 
Applikationen har en WeatherService klass som anropar en extern tjänst 
och returnerar en prognos baserat på en specifik plats. En serie av tester 
till klassen WeatherService utförs med JUnit och Mock objekt. Till projektet 
ska en testrapport skrivas som beskriver testerna och deras resultat i detalj.

## Vem har gjort vad
..
### Vad ni har gjort
..
### Arbetet och dess genomförande
Jag klonade repository från Github, skapade fyra klasser i javadokument, Main, 
Weather, WeatherApi samt WeatherService. När klasserna var färdiga 
genererade jag från WeatherService klassen test så att WeatherServiceTest 
klass skapdes i testdokument. Där skapades olika test typer för att sedan köras.

### Vad som varit svårt
Projektet skulle inte ha en riktig API för att hämmta data, utan vi
skulle bara skapa en mock av den befintliga APIt. Jag hade svårt att förstå 
samt hur jag skulle tillämpa det som kod i början. 

### Beskriv lite olika lösningar du gjort
Skapdee ny mapp för både WeatherService projektet och test delen för 
bättre package struktur 

### Beskriv något som var besvärligt att få till
Från början hade jag andra klasser som användes med en interface klass, 
men då kunde jag inte köra test klassen pga att den och andra klasser inte
kunde referera till interface klassen. Lyckades aldrig lösa felet.

### Beskriv om du fått byta lösning och varför i sådana fall
Eftersom jag inte kunde problemet med interface klassen skrev jag om ny kod
utan att ha med en inteface denna gång. Då gick det mycket bättre.

# Slutsatser
## Vad gick bra
Testrapporten

### Vad gick dåligt
Interface

### Vad har du lärt dig
Hur man kan skriva kod på olika sätt samt hur man kan "låtsas" använda API.
Även om jag hade svårt för interface så fick jag lite input på hur det funkar.
Dock behöver jag öva mer på det.

### Vad hade ni gjort annorlunda om ni gjort om projektet
Skrivit enklare kod utan att lägga till interface. 

### Vilka möjligheter ser du med de kunskaper du fått under kursen.
Förbättrad kodkvalitet, effektivare testning, kvalitetsverktyg och metoder m.m.

