AdapterPaternDemo

Inleiding: Het Adapter-ontwerppatroon maakt interactie mogelijk tussen interfaces die normaal niet compatibel zouden zijn. Het werkt als een brug tussen twee onverenigbare interfaces. Dit patroon betrekt een enkele klasse, de Adapter, die de interactie tussen de bestaande code en een externe library of systeem verzorgt. In ons scenario wordt het gebruikt om een mediaspeler te laten werken met verschillende mediabestandsformaten.

Uitwerking: Deel Gedeeltelijke Code: Volledige definities voor MediaPlayer en AdvancedMediaPlayer interfaces. Gedeeltelijke implementaties voor VlcPlayer en Mp4Player (wij wissen en laten studenten enkele methoden voltooien). Barebone voor MediaAdapter (studenten moeten de adapterlogica voltooien, die wij eerder hebben gewist). Gedeeltelijke implementatie van AudioPlayer (vooral het deel waarin wordt besloten welk formaat wordt aangevraagd en hoe MediaAdapter te gebruiken. Die onderdelen moeten wij ook nog wissen). Taken voor Studenten: Voltooi die delen van de VlcPlayer en Mp4Player klassen die wij gewist hebben. Implementeer de adapterlogica in MediaAdapter die wij gewist hebben. Voltooi, daar wij wij code gewist hebben, de AudioPlayer klasse om MediaAdapter correct te gebruiken. Optionele Uitdaging: Breid het project uit om extra mediaformaten te ondersteunen. Schrijf JUnit-tests om de functionaliteit te valideren.