/*
The converter was created to automatic convert arrays into the necessary files containing words for the application 'Fiszki-polsko-norweskie-app'.
RefZero-2023
*/
package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Converter {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        //FROM: words_1_50.java
        String[][] tab1_50 = {
                {"1", "kot", "en katt"}, {"2", "pies", "en hund"}, {"3", "koń", "en hest"}, {"4", "mysz", "en/ei mus"}, {"5", "rekin", "en hai"}, {"6", "koza", "en/ei geit"}, {"7", "lew", "en/ei løve"}, {"8", "ryś", "en/ei gaupe"}, {"9", "świnia", "en gris"}, {"10", "małpa", "en/ei ape"},
                {"11", "jeleń", "en hjort"}, {"12", "lis", "en rev"}, {"13", "niedźwiedź", "en bjørn"}, {"14", "wilk", "en ulv "}, {"15", "krowa", "en/ei ku"}, {"16", "owca", "en sau"}, {"17", "ryba", "en fisk"}, {"18", "osioł", "et esel"}, {"19", "kaczka", "en/ei and"}, {"20", "wąż", "en slange"},
                {"21", "ptak", "en fugl"}, {"22", "wiewiórka", "en ekorn"}, {"23", "królik", "en kanin"}, {"24", "krokodyl", "en krokodille"}, {"25", "tygrys", "en tiger"}, {"26", "wół", "en okse"}, {"27", "kura", "en høne"}, {"28", "kogut", "en hane"}, {"29", "kurczak", "en kylling"}, {"30", "orzeł", "en/ei ørn"},
                {"31", "biały", "hvit"}, {"32", "czarny", "svart"}, {"33", "szary", "grå"}, {"34", "niebieski", "blå"}, {"35", "zielony", "grønn"}, {"36", "brązowy", "brun"}, {"37", "czerwony", "rød"}, {"38", "żółty", "gul"}, {"39", "różowy", "rosa"}, {"40", "pomarańczowy", "oransje"},
                {"41", "fioletowy", "lilla"}, {"42", "owoce", "frukt"}, {"43", "jabłko", "et eple"}, {"44", "pomarańcza", "en appelsin"}, {"45", "gruszka", "en/ei pære"}, {"46", "truskawka", "et jordbær"}, {"47", "malina", "et bringebær"}, {"48", "jagoda", "et blåbær"}, {"49", "śliwka", "en/ei plomme"}, {"50", "winogrono", "en/ei drue"}
        };
        saveListToFile(
                convertArrayToWordList(tab1_50, 0),
                mapper,
                new File("word_1_50.json"));

        //FROM: words_51_100.java
        String[][] tab51_100 = {
                {"1", "ja", "jeg"}, {"2", "ty", "du "}, {"3", "on", "han"}, {"4", "ona", "hun"}, {"5", "ono", "det"}, {"6", "on, ona", "den"}, {"7", "my", "vi "}, {"8", "wy", "dere"}, {"9", "oni, one", "de "}, {"10", "mnie, mi, mną", "meg"},
                {"11", "ciebie, ci, cię, tobie, tobą", "deg"}, {"12", "jego, jemu, nim", "ham, han"}, {"13", "jej, niej, ją, nią", "henne"}, {"14", "je, jego, jemu, nim", "det "}, {"15", "jego, jemu, nim, jej, niej, ją, nią", "den"}, {"16", "nas, nam, nami", "oss"}, {"17", "was, wam, wami", "dere"}, {"18", "ich, im, nim, nich", "dem"}, {"19", "kto?", "hvem?"}, {"20", "co?", "hva?"},
                {"21", "który?, jaki?", "hvilken?"}, {"22", "czyj?", "hvem sin?"}, {"23", "mój", "min"}, {"24", "twój", "din"}, {"25", "jego", "hans"}, {"26", "jej", "hannes"}, {"27", "jego, jej", "dens"}, {"28", "jego", "dets"}, {"29", "nasz", "vår"}, {"30", "wasz", "deres"},
                {"31", "ich", "deres"}, {"32", "moja", "mi "}, {"33", "twoja", "di"}, {"34", "nasza", "vår"}, {"35", "moje", "mitt"}, {"36", "twoje", "ditt"}, {"37", "nasze", "vårt"}, {"38", "moi, moje", "mine"}, {"39", "twoi, twoje", "dine"}, {"40", "nasi, nasze", "våre"},
                {"41", "swój", "sin"}, {"42", "swoja", "si "}, {"43", "swoje", "sitt"}, {"44", "swoi, swoje", "sine"}, {"45", "gdzie?", "hvor?"}, {"46", "kiedy?", "når?"}, {"47", "jak?, jaki?, jaka?, w jaki sposób?", "hvordan?"}, {"48", "który?, która?, które?, jaki?, jaka?, jakie?", "hvilken?"}, {"49", "dlaczego?", "hvorfor?"}, {"50", "pytać", "spørre"}
        };
        saveListToFile(
                convertArrayToWordList(tab51_100, 1),
                mapper,
                new File("word_51_100.json"));

        //FROM: words_101_150.java
        String[][] tab101_150 = {
                {"1", "polecać", "anbefale / anbefalte / anbefalt "}, {"2", "żałować", "angre / angret / angret"}, {"3", "pracować", "arbeide / arbeidet / arbeidet "}, {"4", "kończyć, dokończyć, zakończyć", "avslutte / avsluttet / avsluttet"}, {"5", "przerywać, przeszkadzać", "avbryte / avbrøt / avbrutt"}, {"6", "reklamować, głosić", "avertere / averterte / avertert "}, {"7", "kąpać się", "bade / badet / badet"}, {"8", "piec", "bake / bakte / bakt"}, {"9", "pukać, stukać, trzepać", "banke / banket / banket"}, {"10", "golić (seg - się)", "barbere / barberte / barbert"},
                {"11", "prosić, błagać", "be (om) / ba (om) / bedt (om)"}, {"12", "ograniczać", "begrense / begrenset / begrenset"}, {"13", "pojmować, rozumieć", "begripe / begre(i)p / begrepet"}, {"14", "rozpoczynać", "begynne / begynte / begynt"}, {"15", "przepraszać", "beklage / beklaget / beklaget"}, {"16", "potwierdzać, poświadczać", "bekrefte / bekreftet / bekreftet"}, {"17", "pokonywać", "beseire / beseiret / beseiret"}, {"18", "opisywać", "beskrive / beskrev / beskrevet"}, {"19", "decydować", "bestemme / bestemte / bestemt"}, {"20", "zamawiać", "bestille / bestilte / bestilt"},
                {"21", "zdać (egamin, test, itp.)", "bestå / besto / bestått"}, {"22", "odpowiadać", "besvare / besvarte / besvart"}, {"23", "odwiedzać, uczęszczać", "besøke / besøkte / besøkt"}, {"24", "płacić", "betale / betalte / betalt "}, {"25", "znaczyć", "bety / betydde / betydd"}, {"26", "wiązać", "binde / bandt / bundet"}, {"27", "gryźć", "bite / bet / bitt"}, {"28", "stawać się", "bli / ble / blitt"}, {"29", "wiać", "blåse / blåste / blåst"}, {"30", "mieszkać", "bo / bodde / bodd"},
                {"31", "łamać", "brekke / brakk / brukket"}, {"32", "palić (nie w odniesieniu do palenia nikotyny)", "brenne / brente / brent"}, {"33", "przynosić", "bringe / brakte / brakt"}, {"34", "pękać", "briste / brast / bristet"}, {"35", "używać, stosować", "bruke / brukte / brukt"}, {"36", "troszczyć się o..., zalezeć na...", "bry seg om / brydde seg om / brydd seg om"}, {"37", "zbić, rozbić, łamać", "bryte / brøt / brutt"}, {"38", "hałasować", "bråke / bråket / bråket"}, {"39", "oferować, zapraszać", "by / bydde / bydd"}, {"40", "budować", "bygge / bygde / bygd"},
                {"41", "nosić", "bære / bar / båret"}, {"42", "tańczyć", "danse / danset / danset"}, {"43", "zakryć, przykryć, nakryć", "dekke / dekket / dekket "}, {"44", "spadać", "dette / datt / dettet"}, {"45", "dyskutować", "diskutere / diskuterte / diskutert"}, {"46", "wyjeżdżać, udawać się", "dra / dro / dratt"}, {"47", "pić", "drikke / drakk / drukket"}, {"48", "brać prysznic", "dusje / dusjet / dusjet"}, {"49", "posiadać", "eie / eide / eid"}, {"50", "kochać", "elske / elsket / elsket"}
        };
        saveListToFile(
                convertArrayToWordList(tab101_150, 2),
                mapper,
                new File("word_101_150.json"));

        //FROM: words_151_200.java
        String[][] tab151_200 = {
                {"1", "kończyć", "ende / endte / endt"}, {"2", "jeść", "ete / åt / ett "}, {"3", "upaść, spadać", "falle / falt / falt "}, {"4", "znajdować, znaleźć", "finne / fant / funnet"}, {"5", "usunąć", "fjerne / fjernet / fjernet"}, {"6", "latać", "fly / fløy / fløyet"}, {"7", "przesunąć, przeprowadzić", "flytte / flyttet / flyttet"}, {"8", "zmienić", "forandre / forandret / forandret"}, {"9", "przygotować", "forberede / forberedte / forberedt"}, {"10", "zdarzyć się, mieć miejsce", "foregå / foregikk / foregått"},
                {"11", "proponować", "foreslå / foreslo / foreslått"}, {"12", "woleć", "foretrekke / foretrakk / foretrukket"}, {"13", "wytłumaczyć, wyjaśnić", "forklare / forklarte / forklart"}, {"14", "zakłócać, przeszkadzać", "forstyrre / forstyrret / forstyrret"}, {"15", "rozumieć", "forstå / forstod / forstått"}, {"16", "spieszyć się", "forte seg / fortet seg / fortet seg"}, {"17", "fotografować", "fotografere / fotograferte / fotografert"}, {"18", "bać się, obawiać się", "frykte / fryktet / fryktet"}, {"19", "marznąć, zamarzać", "fryse / frøs / frosset"}, {"20", "wypełniać", "fylle ut / fylte ut / fylt ut "},
                {"21", "czuć (seg - się)", "føle / følte / følt "}, {"22", "dostawać", "få / fikk / fått"}, {"23", "dawać", "gi / gav / gitt"}, {"24", "powtarzać", "gjenta / gjentok / gjentatt "}, {"25", "robić", "gjøre / gjør / gjorde / gjort"}, {"26", "zapominać", "glemme / glemte / glemt"}, {"27", "kopać", "grave / gravde / gravd"}, {"28", "chwytać, łapać", "gripe / grep / grepet"}, {"29", "iść", "gå / gikk / gått"}, {"30", "mieć", "ha / hadde / hatt"},
                {"31", "robić zakupy", "handle / handlet / handlet"}, {"32", "wisieć", "henge / hengte / hengt"}, {"33", "przynieść", "hente / hentet / hentet"}, {"34", "nazywać się", "hete / hette / hett"}, {"35", "pozdrawiać, witać", "hilse / hilste / hilst"}, {"36", "blokować, tarasować", "hindre / hindret / hindret"}, {"37", "pomagać", "hjelpe / hjalp / hjulpet"}, {"38", "trzymać", "holde / holdt / holdt"}, {"39", "skakać", "hoppe / hoppet / hoppet"}, {"40", "pamiętać", "huske / husket / husket"},
                {"41", "słyszeć", "høre / hørte / hørt"}, {"42", "mieć nadzieję", "håpe / håpet / håpet"}, {"43", "interesować się", "interessere / innteresserte / innteressert"}, {"44", "pracować", "jobbe / jobbet / jobbet"}, {"45", "biegać, uprawiać jogging", "jogge / jogget / jogget"}, {"46", "nazywać", "kalle / kalte / kalt"}, {"47", "rzucać", "kaste / kastet / kastet"}, {"48", "patrzeć, zerkać", "kikke / kikket / kikket"}, {"49", "znać", "kjenne / kjente / kjent"}, {"50", "kupować", "kjøpe / kjøpte / kjøpt"}
        };
        saveListToFile(
                convertArrayToWordList(tab151_200, 3),
                mapper,
                new File("word_151_200.json"));

        //FROM: words_201_250.java
        String[][] tab201_250 = {
                {"1", "kierować, jechać samochodem", "kjøre / kjørte / kjørt"}, {"2", "ubierać (się), rozbierać (się)", "kle / kledde / kledd"}, {"3", "zawiązać, związać, przywiązać", "knytte / knyttet / knyttet"}, {"4", "gotować", "koke / kokte / kokt"}, {"5", "przyjść, pójść", "komme / kom / kommet"}, {"6", "kontaktować się", "kontakte / kontaktet / kontaktet"}, {"7", "kłócić się", "krangle / kranglet / kranglet"}, {"8", "krytykować", "kritisere / kritiserte / kritisert"}, {"9", "móc, umieć", "kunne / kunne / kunnet"}, {"10", "ałować", "kysse / kysset / kysset"},
                {"11", "pozwalać", "la / lot / latt"}, {"12", "robić, przygotowywać", "lage / laget / laget "}, {"13", "śmiać się", "le / lo / ledd"}, {"14", "kłaść", "legge / la / lagt"}, {"15", "wynajmować, wypożyczać", "leie / leide / leid"}, {"16", "bawić się", "leke / lekte / lekt"}, {"17", "czytać", "lese / leste / lest"}, {"18", "szukać", "lete / lette / lett"}, {"19", "żyć", "leve / levde / levd"}, {"20", "leżeć", "ligge / lå / ligget"},
                {"21", "lubić", "like / likte / likt"}, {"22", "zamykać", "lukke / lukket / lukket"}, {"23", "pachnieć, wąchać", "lukte / luktet / luktet"}, {"24", "słuchać", "lytte / lyttet / lyttet"}, {"25", "kłamać", "lyve / løy / løyet "}, {"26", "uczyć", "lære / lærte / lært"}, {"27", "biegać", "løpe / løp / løpt"}, {"28", "pożyczać", "låne / lånte / lånt"}, {"29", "zamykać na klucz", "låse / låste / låst"}, {"30", "malować", "male / malte / malt "},
                {"31", "mieć na myśli, uważać", "mene / mente / ment"}, {"32", "zauważać, zaznaczać", "merke / merket / merket"}, {"33", "gubić, tracić", "miste / mistet / mistet"}, {"34", "spotykać", "møte / møtte / møtt"}, {"35", "musieć", "måtte / måtte / måttet"}, {"36", "przelać , przenieść", "overføre / overførte / overført"}, {"37", "pakować", "pakke / pakket / pakket"}, {"38", "parkować", "parkere / parkerte / parkert"}, {"39", "opiekować się, dbać", "passe / passet / passet"}, {"40", "wskazywać", "peke / pekte / pekt "},
                {"41", "planować", "planlegge / planla / planlagt"}, {"42", "rozmawiać", "prate / pratet / pratet "}, {"43", "próbować", "prøve / prøvde / prøvd"}, {"44", "czyścić", "pusse / pusset / pusset"}, {"45", "oddychać", "puste / pustet / pustet"}, {"46", "kłaść", "putte / puttet / puttet"}, {"47", "czyścić", "rense / renset / renset"}, {"48", "naprawiać, reperować", "reparere / reparerte / reparert"}, {"49", "jeździć konno", "ri / red / ridd"}, {"50", "sprzątać", "rydde / ryddet / ryddet"}
        };
        saveListToFile(
                convertArrayToWordList(tab201_250, 4),
                mapper,
                new File("word_201_250.json"));

        //FROM: words_251_300.java
        String[][] tab251_300 = {
                {"1", "palić papierosy, dymić", "røyke / røykte / røykt"}, {"2", "zbierać, pozbierać", "samle / samlet / samlet"}, {"3", "widzieć, zobaczyć", "se / så / sett"}, {"4", "wygrać, zwyciężyć", "seire / seiret / seiret "}, {"5", "sprzedawać", "selge / solgte / solgt"}, {"6", "wysyłać", "sende / sendte / sendt"}, {"7", "podpisywać", "signere / signerte / signert"}, {"8", "siedzieć", "sitte / satt / sittet"}, {"9", "kroić", "skjære / skar / skåret"}, {"10", "krzyczeć", "skrike / skrek / skreket"},
                {"11", "pisać", "skrive / skrev / skrevet"}, {"12", "pchać, przesuwać", "skyve / skjøv / skjøvet"}, {"13", "kończyć", "slutte / sluttet / sluttet"}, {"14", "bić, uderzać", "slå / slo / slått"}, {"15", "smakować", "smake / smakte / smakt"}, {"16", "uśmiechać się", "smile / smilte / smilt"}, {"17", "rozmawiać", "snakke / snakket / snakket"}, {"18", "spać", "sove / sov / sovet"}, {"19", "oszczędzać", "spare / sparte / spart"}, {"20", "kopać", "sparke / sparket / sparket"},
                {"21", "grać", "spille / spilte / spilt "}, {"22", "jeść", "spise / spiste / spist"}, {"23", "biec", "springe / sprang / sprunget "}, {"24", "pytać", "spørre / spurte / spurt "}, {"25", "zaczynać, rozpoczynać", "starte / startet / startet"}, {"26", "zaufać", "stole på / stolte på / stolt på"}, {"27", "zatrzymać się, przerwać", "stoppe / stoppet / stoppet"}, {"28", "stać", "stå / sto/stod / stått "}, {"29", "odpowiadać", "svare / svarte / svart"}, {"30", "pływać", "svømme / svømte / svømt"},
                {"31", "jeździć na rowerze", "sykle / syklet / syklet"}, {"32", "uważać", "synes / syntes / synes"}, {"33", "brać", "ta / tok / tatt"}, {"34", "dziękować", "takke / takket / takket"}, {"35", "przegrać", "tape / tapte / tapt"}, {"36", "rysować", "tegne / tegnet / tegnet "}, {"37", "myśleć", "tenke / tenkte / tenkt "}, {"38", "pozwolić, zezwolić", "tillate / tillot / tillatt"}, {"39", "spotykać", "treffe / traff / truffet"}, {"40", "trenować", "trene / trente / trent"},
                {"41", "potrzebować", "trenge / trengte / trengt"}, {"42", "przepraszać", "unnskylde / unnskyldte / unnskyldt"}, {"43", "wskazywać", "utpeke / utpekte / utpekt"}, {"44", "grzać", "varme / varmet / varmet"}, {"45", "chcieć", "ville / ville / villet"}, {"46", "wiedzieć", "vite / visste / visst"}, {"47", "być", "være / var / vært"}, {"48", "niszczyć, psuć", "ødelegge / ødela / ødelagt"}, {"49", "ćwiczyć", "øve / øvde / øvd"}, {"50", "otwierać", "åpne / åpnet / åpnet"}
        };
        saveListToFile(
                convertArrayToWordList(tab251_300, 5),
                mapper,
                new File("word_251_300.json"));

        //FROM: words_301_350.java
        String[][] tab301_350 = {
                {"1", "jeden", "en"}, {"2", "dwa", "to"}, {"3", "trzy", "tre"}, {"4", "cztery", "fire"}, {"5", "pięć", "fem"}, {"6", "sześć", "seks"}, {"7", "siedem", "sju / syv"}, {"8", "osiem", "åtte"}, {"9", "dziewięć", "ni"}, {"10", "dziesięć", "ti"},
                {"11", "jedenaście", "elleve"}, {"12", "dwanaście", "tolv"}, {"13", "trzynaście", "tretten"}, {"14", "czternaście", "fjorten"}, {"15", "piętnaście", "femten"}, {"16", "szesnaście", "seksten"}, {"17", "siedemnaście", "sytten"}, {"18", "osiemnaście", "atten"}, {"19", "dziewiętnaście", "nitten"}, {"20", "dwadzieścia", "tjue"},
                {"21", "dwadzieścia jeden", "tjueen"}, {"22", "dwadzieścia dwa", "tjueto"}, {"23", "trzydzieści", "tretti"}, {"24", "trzydzieści jeden", "trettien"}, {"25", "czterdzieści", "førti"}, {"26", "pięćdziesiąt", "femti"}, {"27", "sześćset", "seksti"}, {"28", "siedemdziesiąt", "sytti"}, {"29", "osiemdziesiąt", "åtti"}, {"30", "dziewiećdziesiąt", "nitti"},
                {"31", "sto", "hundre"}, {"32", "sto jeden", "hundre og en"}, {"33", "dwieście", "to hundre"}, {"34", "tysiąc", "tusen"}, {"35", "dwa tysiące", "to tusen"}, {"36", "dziesięć tysięcy", "ti tusen"}, {"37", "sto tysięcy", "hundre tusen"}, {"38", "milion", "en million"}, {"39", "osiemset piećdziesiąt sześć", "åtte hundre og femtiseks"}, {"40", "pierwszy", "første"},
                {"41", "drugi", "andre"}, {"42", "trzeci", "tredje"}, {"43", "czwarty", "fjerde"}, {"44", "piąty", "femte"}, {"45", "szósty", "sjette"}, {"46", "siódmy", "sjuende / syvende"}, {"47", "ósmy", "åttende"}, {"48", "jedenasty", "ellevte"}, {"49", "trzynasty", "trettende"}, {"50", "trzydziesty", "trettiende"}
        };
        saveListToFile(
                convertArrayToWordList(tab301_350, 6),
                mapper,
                new File("word_301_350.json"));

        //FROM: words_351_400.java
        String[][] tab351_400 = {
                {"1", "całkiwicie, zupełnie", "aldeles"}, {"2", "najbardziej", "aller"}, {"3", "zbyt, za bardzo", "altfor"}, {"4", "tylko", "bare"}, {"5", "zupełnie", "fullstendig"}, {"6", "całkiem", "ganske"}, {"7", "zupełnie", "helt"}, {"8", "prawie", "nesten"}, {"9", "normalnie", "vanlig"}, {"10", "bardzo", "veldig"},
                {"11", "cały", "hel"}, {"12", "w środku", "inne"}, {"13", "tutaj", "her"}, {"14", "na górze", "oppe "}, {"15", "na zewnątrz", "utte"}, {"16", "nie ma go", "han er borte"}, {"17", "na dole", "nede"}, {"18", "tam", "der"}, {"19", "stąd", "herfra"}, {"20", "stamtąd", "derfra"},
                {"21", "ostrze", "et blad"}, {"22", "deska", "et brett"}, {"23", "młotek", "en hammer"}, {"24", "miotła", "en kost"}, {"25", "szczotka", "en børste"}, {"26", "wiadro", "ei bøtte"}, {"27", "łańcuch", "et kjede"}, {"28", "szufelka", "et feiebrett"}, {"29", "piła łańcuchowa", "ei motorsag"}, {"30", "piła tarczowa", "ei sirkelsag"},
                {"31", "dłuto", "en meisel"}, {"32", "wiertarka", "en boremaskin"}, {"33", "przerwa", "en pause"}, {"34", "koniec", "en slutt"}, {"35", "pośpiech", "et rush"}, {"36", "kwadrat", "et kvadrat"}, {"37", "trójkąt", "et triangel"}, {"38", "trapez", "et trapes"}, {"39", "koło", "en sirkel"}, {"40", "sześcian", "en kube"},
                {"41", "poziomica", "et vaterpass"}, {"42", "gwóżdż", "en spiker"}, {"43", "śrubokręt", "en skrutrekker"}, {"44", "pędzel", "en pensel"}, {"45", "skrzynka na narzędzia", "en/ei verktøykasse"}, {"46", "kombinerki", "en universaltang"}, {"47", "piła ręczna", "en håndsag"}, {"48", "drabina", "en stige"}, {"49", "kleszcze", "en/ei tang"}, {"50", "taśma miernicza", "et målebånd"}
        };
        saveListToFile(
                convertArrayToWordList(tab351_400, 7),
                mapper,
                new File("word_351_400.json"));

        //FROM: words_401_450.java
        String[][] tab401_450 = {
                {"1", "poniedziałek", "mandag"}, {"2", "wtorek", "tirsdag"}, {"3", "środa", "onsdag"}, {"4", "czwartek", "torsdag"}, {"5", "piątek", "fredag"}, {"6", "sobota", "lørdag"}, {"7", "niedziela", "søndag"}, {"8", "rok", "et år"}, {"9", "miesiąc", "en måned"}, {"10", "dzień", "en dag"},
                {"11", "noc", "ei natt"}, {"12", "godzina", "en time"}, {"13", "minuta", "et minutt"}, {"14", "zawsze", "alltid"}, {"15", "codziennie", "hver dag"}, {"16", "zazwyczaj", "vanligvis"}, {"17", "często", "ofte"}, {"18", "czasami", "av og till / iblant"}, {"19", "rzadko", "sjelden"}, {"20", "nigdy", "aldri"},
                {"21", "dzisiaj", "i dag"}, {"22", "wczoraj", "i går"}, {"23", "jutro", "i morgen"}, {"24", "w tym roku", "dette året"}, {"25", "w zeszłym / przyszłym roku", "i fjor / neste år"}, {"26", "w tym miesiącu", "denne månaden"}, {"27", "Która jest godzina?", "Hvor mye er klokka?"}, {"28", "Jest 10", "Klokka er ti / Den er ti "}, {"29", "rano", "om morgen"}, {"30", "wieczorem / dziś wieczorem", "om kvelden / i klveld"},
                {"31", "w środku dnia / w południe", "midt på dagen"}, {"32", "po południu", "om ettermiddagen"}, {"33", "data", "en dato"}, {"34", "styczeń", "januar"}, {"35", "luty", "februar"}, {"36", "marzec", "mars"}, {"37", "kwiecień", "april"}, {"38", "maj", "mai"}, {"39", "czerwiec", "juni"}, {"40", "lipiec", "juli"},
                {"41", "sierpień", "august"}, {"42", "wrzesień", "september"}, {"43", "pażdziernik", "oktober"}, {"44", "listopad", "november"}, {"45", "grudzień", "desember"}, {"46", "urodziny", "en bursdag"}, {"47", "imieniny", "en navnedag"}, {"48", "Boże Narodzenie", "Jul"}, {"49", "Sylwester", "Nyttårsaften"}, {"50", "Wielkanoc", "Påske"}
        };
        saveListToFile(
                convertArrayToWordList(tab401_450, 8),
                mapper,
                new File("word_401_450.json"));

        //FROM: words_451_500.java
        String[][] tab451_500 = {
                {"1", "świeży", "fersk"}, {"2", "inteligentny", "inteligent"}, {"3", "blond", "lys"}, {"4", "późno", "sent"}, {"5", "surowy, srogi", "streng"}, {"6", "cichy", "stille"}, {"7", "główny", "hoved-"}, {"8", "ładny", "fin"}, {"9", "taki sam", "samme"}, {"10", "wysoki", "høy"},
                {"11", "zajęty", "opptatt"}, {"12", "młody", "ung"}, {"13", "twardy", "hard"}, {"14", "szybko", "fort"}, {"15", "stary", "gammel"}, {"16", "wolny(o miejscu)", "ledig"}, {"17", "nowy", "ny "}, {"18", "gruby", "tykk"}, {"19", "miekki", "myk"}, {"20", "niski", "lav"},
                {"21", "ważny", "viktig"}, {"22", "możliwy", "mulig"}, {"23", "przygotowany", "forberedt"}, {"24", "nowoczesny", "moderne"}, {"25", "cierpliwy", "tålmodig"}, {"26", "miły", "snill"}, {"27", "przyjazny", "vennlig"}, {"28", "sympatyczny", "sympatisk"}, {"29", "leniwy", "lat"}, {"30", "pilny", "flink"},
                {"31", "głupi", "dum"}, {"32", "mądry", "klok"}, {"33", "trudny", "vanskelig"}, {"34", "długo", "lenge"}, {"35", "pyszny, doskonały", "nydelig"}, {"36", "gorzki", "bitter"}, {"37", "słodki", "søt"}, {"38", "głośny", "høy"}, {"39", "razem", "sammen"}, {"40", "następny", "neste"},
                {"41", "bez", "uten"}, {"42", "powoli", "sakte"}, {"43", "łatwy", "lett"}, {"44", "wcześnie", "tidlig"}, {"45", "całkiem", "ganske"}, {"46", "chudy", "tynn"}, {"47", "mały, mała, małe", "liten, lita, lite"}, {"48", "czasami", "av og til"}, {"49", "już", "allerede"}, {"50", "dla", "til"}
        };
        saveListToFile(
                convertArrayToWordList(tab451_500, 9),
                mapper,
                new File("word_451_500.json"));

        //FROM: words_501_550.java
        String[][] tab501_550 = {
                {"1", "zdrowie", "ei helse"}, {"2", "kasa", "ei kasse"}, {"3", "mysz", "ei mus"}, {"4", "śmieci", "ei soppel"}, {"5", "nożyczki", "ei saks"}, {"6", "kot", "ei katt"}, {"7", "strona", "ei side"}, {"8", "książka", "ei bok"}, {"9", "gazeta", "ei avis"}, {"10", "noc", "ei natt"},
                {"11", "ciasto", "ei kake"}, {"12", "zegar", "ei klokke"}, {"13", "drzwi", "ei dør"}, {"14", "klase", "ei klasse"}, {"15", "włosy", "et hår"}, {"16", "salon", "ei stue"}, {"17", "prom", "ei ferje"}, {"18", "wóz", "ei vogn"}, {"19", "mazak, pisak", "en tusj"}, {"20", "most", "en bro"},
                {"21", "drewno", "et tre"}, {"22", "serce", "et hjerte"}, {"23", "ucho", "et øre"}, {"24", "adres", "ei adresse"}, {"25", "język", "ei tunge"}, {"26", "regał", "ei hylle"}, {"27", "ciocia", "ei tante"}, {"28", "port", "ei havn"}, {"29", "pociąg", "et tog"}, {"30", "samolot", "et fly"},
                {"31", "telewizor", "en tv-apparat"}, {"32", "twarz", "et ansikt"}, {"33", "stacja", "en stasjon"}, {"34", "lampa", "ei lampe"}, {"35", "głowa", "et hode"}, {"36", "ząb", "ei tann"}, {"37", "szyja, gardło", "en hals"}, {"38", "podłoga", "et gulv"}, {"39", "pokój", "et rom"}, {"40", "pokój dziecięcy", "et barnerom"},
                {"41", "kuchnia", "ei kjøkken"}, {"42", "dom", "et hjem"}, {"43", "łazienka", "et bad"}, {"44", "toaleta", "et toalett"}, {"45", "piwo", "et øl"}, {"46", "statek", "et skip"}, {"47", "żona", "ei kone"}, {"48", "długopis", "en penn"}, {"49", "fotel", "en lanestol"}, {"50", "oczywiście", "selvfølgelig"}
        };
        saveListToFile(
                convertArrayToWordList(tab501_550, 10),
                mapper,
                new File("word_501_550.json"));

        //FROM: words_551_600.java
        String[][] tab551_600 = {
                {"1", "brzuch", "en mage"}, {"2", "skóra", "en hud"}, {"3", "winda", "en heis"}, {"4", "mieszkanie", "en leilighet"}, {"5", "sofa, kanapa", "en sofa"}, {"6", "korytarz", "en gang"}, {"7", "łokieć", "en albue"}, {"8", "łożko", "ei seng"}, {"9", "chleb", "et brød"}, {"10", "problem", "et problem"},
                {"11", "prezent", "en gave"}, {"12", "prawda", "sannhet"}, {"13", "stolica", "en hovedstad"}, {"14", "budynek", "en bygning"}, {"15", "zeszyt", "et hefte"}, {"16", "dywan, koc", "et teppe"}, {"17", "radio", "en radio"}, {"18", "wiadomość", "en nyhet"}, {"19", "komputer", "en datamaskin"}, {"20", "przystanek", "en holdeplass"},
                {"21", "szafa", "et skap"}, {"22", "okno", "et vindu"}, {"23", "lusto", "et speil"}, {"24", "masło", "et smør"}, {"25", "jajko", "et egg"}, {"26", "woda", "et vann"}, {"27", "drzewo", "et tre"}, {"28", "list", "et brev"}, {"29", "tort", "et bløtkake"}, {"30", "tablica", "ei tavle"},
                {"31", "zadanie domowe", "ei lekse"}, {"32", "ulica", "ei gate"}, {"33", "patelnia", "ei stekepanne"}, {"34", "czarownica", "ei heks"}, {"35", "kosciół", "ei kirke"}, {"36", "czas wolny", "ei fritid"}, {"37", "dziewczyna", "ei jente"}, {"38", "przewodnik", "ei reisebok"}, {"39", "Ziemia", "ei jord"}, {"40", "ręka", "en hånd"},
                {"41", "czas", "ei tid"}, {"42", "kiełbasa", "ei pølse"}, {"43", "zawód", "et yrke"}, {"44", "jedzenie", "en mat"}, {"45", "niż, od", "enn"}, {"46", "stopa", "en fot"}, {"47", "palec", "en finger"}, {"48", "krzesło", "en stol"}, {"49", "moment, chwila", "en øyeblikk"}, {"50", "tramwaj", "en trikk"}
        };
        saveListToFile(
                convertArrayToWordList(tab551_600, 11),
                mapper,
                new File("word_551_600.json"));
    }

    public static List<Word> convertArrayToWordList(String[][] tabStart_End, Integer offset) {
        List<Word> wordList = new LinkedList<>();
        for (int i = 0; i < tabStart_End.length; i++) {
//            // When there is a parameterless constructor
//            Word word = new Word();
//            for (int j = 0; j < tabStart_End[i].length; j++)
//                switch (j) {
//                    case 0 -> word.setId(Integer.parseInt(tabStart_End[i][j]) + 50 * offset);
//                    case 1 -> word.setPolish(tabStart_End[i][j]);
//                    case 2 -> word.setNorwegian(tabStart_End[i][j]);
//                    default -> throw new ArrayIndexOutOfBoundsException();
//                }
//            wordList.add(word);
//        }
            //If there is a parameter constructor
            int j = 0;
            // The offset is used to number the word accordingly
            Word word = new Word(Integer.parseInt(tabStart_End[i][j]) + 50 * offset,
                    tabStart_End[i][j + 1],
                    tabStart_End[i][j + 2]);
            wordList.add(word);
        }
        return wordList;
    }

    public static void saveListToFile(List<?> list, ObjectMapper mapper, File file) throws IOException {
        mapper.writerWithDefaultPrettyPrinter().writeValue(file, list);
    }
}