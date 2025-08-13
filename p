<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<project>
    <projectId>10116</projectId>
    <projectKey>P50</projectKey>
    <exportDate>2025-08-13 17:49:20 UTC</exportDate>
    <folders>
        <folder fullPath="Certyfikaty" index="6"/>
    </folders>
    <testCases>
        <testCase id="246837096" key="P50-T111">
            <attachments/>
            <confluencePageLinks/>
            <createdBy>TomaszStelmach</createdBy>
            <createdOn>2025-07-07 16:14:56 UTC</createdOn>
            <customFields/>
            <folder><![CDATA[Certyfikaty]]></folder>
            <issues/>
            <labels/>
            <name><![CDATA[Wyłączanie generowania certyfikatu]]></name>
            <owner>712020:ebd03abd-a59d-4309-8760-a707768cc8a3</owner>
            <precondition><![CDATA[1. Zalogować się na stronie https://mmrmqpr585.publigo.onl/wp-login.php<br>jako menedżer publigo.<br>Przeglądarka Chrome.]]></precondition>
            <priority><![CDATA[Normal]]></priority>
            <status><![CDATA[Approved]]></status>
            <parameters/>
            <testDataWrapper/>
            <testScript type="steps">
                <steps>
                    <step index="0">
                        <customFields/>
                        <description><![CDATA[Z menu gł&oacute;wnego wybierz pozycję &bdquo;Kursy&rdquo;]]></description>
                        <expectedResult><![CDATA[Widoczne okno z utworzonymi kursami, zakładka &bdquo;Kursy&rdquo;]]></expectedResult>
                    </step>
                    <step index="1">
                        <customFields/>
                        <description><![CDATA[Kliknij trzy kropki z prawej strony kursu &bdquo;Kurs Test 2&rdquo;]]></description>
                        <expectedResult><![CDATA[Widoczne okno z możliwością wyboru opcji]]></expectedResult>
                    </step>
                    <step index="2">
                        <customFields/>
                        <description><![CDATA[Kliknij przycisk: &bdquo;Edytuj&rdquo;]]></description>
                        <expectedResult><![CDATA[Otwarcie okna edycji kursu]]></expectedResult>
                    </step>
                    <step index="3">
                        <customFields/>
                        <description><![CDATA[Na dole strony w panelu ,,Certyfikacja&quot; kliknij zaznaczony na zielono checkbox]]></description>
                        <expectedResult><![CDATA[Pole checkbox zostaje odznaczone, generowanie certyfikatu dla tego kursu zostaje wyłączone, pojawia się komunikat ,,Zapisano!&quot;]]></expectedResult>
                    </step>
                </steps>
            </testScript>
        </testCase>
        <testCase id="246837107" key="P50-T112">
            <attachments/>
            <confluencePageLinks/>
            <createdBy>TomaszStelmach</createdBy>
            <createdOn>2025-07-07 16:14:56 UTC</createdOn>
            <customFields/>
            <folder><![CDATA[Certyfikaty]]></folder>
            <issues/>
            <labels/>
            <name><![CDATA[Włączanie generowania certyfikatu]]></name>
            <owner>712020:ebd03abd-a59d-4309-8760-a707768cc8a3</owner>
            <precondition><![CDATA[1. Zalogować się na stronie https://mmrmqpr585.publigo.onl/wp-login.php<br>jako menedżer publigo.<br>Przeglądarka Chrome.]]></precondition>
            <priority><![CDATA[Normal]]></priority>
            <status><![CDATA[Approved]]></status>
            <parameters/>
            <testDataWrapper/>
            <testScript type="steps">
                <steps>
                    <step index="0">
                        <customFields/>
                        <description><![CDATA[Z menu gł&oacute;wnego wybierz pozycję &bdquo;Kursy&rdquo;]]></description>
                        <expectedResult><![CDATA[Widoczne okno z utworzonymi kursami, zakładka &bdquo;Kursy&rdquo;]]></expectedResult>
                    </step>
                    <step index="1">
                        <customFields/>
                        <description><![CDATA[Kliknij trzy kropki z prawej strony kursu &bdquo;Kurs Test 2&rdquo;]]></description>
                        <expectedResult><![CDATA[Widoczne okno z możliwością wyboru opcji]]></expectedResult>
                    </step>
                    <step index="2">
                        <customFields/>
                        <description><![CDATA[Kliknij przycisk: &bdquo;Edytuj&rdquo;]]></description>
                        <expectedResult><![CDATA[Otwarcie okna edycji kursu]]></expectedResult>
                    </step>
                    <step index="3">
                        <customFields/>
                        <description><![CDATA[Na dole strony w panelu ,,Certyfikacja&quot; kliknij zaznaczony na szaro checkbox]]></description>
                        <expectedResult><![CDATA[Pole checkbox odznaczone, generowanie certyfikatu dla tego kursu zostaje włączone, pojawia się komunikat ,,Zapisano!&quot;]]></expectedResult>
                    </step>
                </steps>
            </testScript>
        </testCase>
        <testCase id="246837108" key="P50-T113">
            <attachments/>
            <confluencePageLinks/>
            <createdBy>TomaszStelmach</createdBy>
            <createdOn>2025-07-07 16:14:56 UTC</createdOn>
            <customFields/>
            <folder><![CDATA[Certyfikaty]]></folder>
            <issues/>
            <labels/>
            <name><![CDATA[Tworzenie numeracji certyfikatu]]></name>
            <owner>712020:ebd03abd-a59d-4309-8760-a707768cc8a3</owner>
            <precondition><![CDATA[1. Zalogować się na stronie https://mmrmqpr585.publigo.onl/wp-login.php<br> jako menedżer publigo.<br>Przeglądarka Chrome.]]></precondition>
            <priority><![CDATA[Normal]]></priority>
            <status><![CDATA[Approved]]></status>
            <parameters/>
            <testDataWrapper/>
            <testScript type="steps">
                <steps>
                    <step index="0">
                        <customFields/>
                        <description><![CDATA[Z menu gł&oacute;wnego wybierz pozycję &bdquo;Kursy&rdquo;]]></description>
                        <expectedResult><![CDATA[Widoczne okno z utworzonymi kursami, zakładka &bdquo;Kursy&rdquo;]]></expectedResult>
                    </step>
                    <step index="1">
                        <customFields/>
                        <description><![CDATA[Kliknij trzy kropki z prawej strony kursu &bdquo;Kurs Test 2&rdquo;]]></description>
                        <expectedResult><![CDATA[Widoczne okno z możliwością wyboru opcji]]></expectedResult>
                    </step>
                    <step index="2">
                        <customFields/>
                        <description><![CDATA[Kliknij przycisk: &bdquo;Edytuj&rdquo;]]></description>
                        <expectedResult><![CDATA[Otwarcie okna edycji kursu]]></expectedResult>
                    </step>
                    <step index="3">
                        <customFields/>
                        <description><![CDATA[Na dole strony w panelu ,,Certyfikacja&quot; kliknij ,,Konfiguruj&quot;]]></description>
                        <expectedResult><![CDATA[Otwarcie okna z możliwością edycji certyfikatu]]></expectedResult>
                    </step>
                    <step index="4">
                        <customFields/>
                        <description><![CDATA[Kliknij zaznaczony na szaro checkbox ,,Włącz numerację certyfikat&oacute;w&quot;]]></description>
                        <expectedResult><![CDATA[Chechbox zaznaczony, włączono możliwość dodawania numeracji certyfikat&oacute;w]]></expectedResult>
                    </step>
                    <step index="5">
                        <customFields/>
                        <description><![CDATA[W polu ,,Wzorzec numeracji&quot; wpisz ,,MN/X/YYYY&quot;]]></description>
                        <expectedResult><![CDATA[Uzupełniono wzorzec numeracji certyfikat&oacute;w]]></expectedResult>
                    </step>
                    <step index="6">
                        <customFields/>
                        <description><![CDATA[Na dole okna edycji certyfikatu kliknij ,,Zapisz&quot;]]></description>
                        <expectedResult><![CDATA[Zapisano zmiany numeracji certyfikatu, pojawia się komunikat ,,Ustawienia zostały zapisane!&quot;]]></expectedResult>
                    </step>
                </steps>
            </testScript>
        </testCase>
        <testCase id="246837109" key="P50-T114">
            <attachments/>
            <confluencePageLinks/>
            <createdBy>TomaszStelmach</createdBy>
            <createdOn>2025-07-07 16:14:56 UTC</createdOn>
            <customFields/>
            <folder><![CDATA[Certyfikaty]]></folder>
            <issues/>
            <labels/>
            <name><![CDATA[Tworzenie własnego certyfikatu]]></name>
            <owner>712020:ebd03abd-a59d-4309-8760-a707768cc8a3</owner>
            <precondition><![CDATA[1. Zalogować się na stronie https://mmrmqpr585.publigo.onl/wp-login.php<br>jako menedżer publigo.<br>Przeglądarka Chrome.]]></precondition>
            <priority><![CDATA[Normal]]></priority>
            <status><![CDATA[Approved]]></status>
            <parameters/>
            <testDataWrapper/>
            <testScript type="steps">
                <steps>
                    <step index="0">
                        <customFields/>
                        <description><![CDATA[Z menu gł&oacute;wnego wybierz pozycję &bdquo;Ustawienia&rdquo;]]></description>
                        <expectedResult><![CDATA[Otwarcie okna z ustawieniami]]></expectedResult>
                    </step>
                    <step index="1">
                        <customFields/>
                        <description><![CDATA[Z menu ustawień wybierz pozycję &bdquo;Certyfikaty&rdquo;]]></description>
                        <expectedResult><![CDATA[Otwarcie okna z ustawieniami certyfikat&oacute;w]]></expectedResult>
                    </step>
                    <step index="2">
                        <customFields/>
                        <description><![CDATA[Na dole okna kliknij &bdquo;Dodaj nowy&rdquo;]]></description>
                        <expectedResult><![CDATA[Przeniesienie do okna edycji własnego certyfikatu]]></expectedResult>
                    </step>
                    <step index="3">
                        <customFields/>
                        <description><![CDATA[W polu ,,Nazwa szablonu certyfikatu&quot; wpisz ,,własny certyfikat MN&quot;]]></description>
                        <expectedResult><![CDATA[Ustawiono nazwę certyfikatu]]></expectedResult>
                    </step>
                    <step index="4">
                        <customFields/>
                        <description><![CDATA[Kliknij &bdquo;Zmień pozycję&rdquo;]]></description>
                        <expectedResult><![CDATA[Pozycja widoku certyfikatu zmieniona na poziomą]]></expectedResult>
                    </step>
                    <step index="5">
                        <customFields/>
                        <description><![CDATA[W pozycji ,,Pola dodatkowe&quot; kliknij ,,Wybierz tło&quot;]]></description>
                        <expectedResult><![CDATA[Otwarcie okna ,,Media&quot; z możliwością wyboru pliku]]></expectedResult>
                    </step>
                    <step index="6">
                        <customFields/>
                        <description><![CDATA[Kliknij w ,,+&quot; obok napisu ,,Wciśnij / aby wybrać blok&quot;]]></description>
                        <expectedResult><![CDATA[Otwarcie okna z możliwością wyboru czynności]]></expectedResult>
                    </step>
                    <step index="7">
                        <customFields/>
                        <description><![CDATA[W zakładce ,,Wybierz pliki&quot; naciśnij ,,Wybierz pliki&quot;]]></description>
                        <expectedResult><![CDATA[Otwarcie folderu do wyboru pliku]]></expectedResult>
                    </step>
                    <step index="8">
                        <customFields/>
                        <description><![CDATA[Wybierz z folderu plik png, kt&oacute;ry chcesz użyć jako tło certyfikatu]]></description>
                        <expectedResult><![CDATA[Ustawiono wybrane tło]]></expectedResult>
                    </step>
                    <step index="9">
                        <customFields/>
                        <description><![CDATA[W polu ,,Tytuł&quot; wpisz ,,własny certyfikat MN&quot;]]></description>
                        <expectedResult><![CDATA[Dodano tytuł tworzonego certyfikatu]]></expectedResult>
                    </step>
                    <step index="10">
                        <customFields/>
                        <description><![CDATA[Na dole okna kliknij ,, Zapisz&quot;]]></description>
                        <expectedResult><![CDATA[Zapisano utworzony szablon certyfikatu]]></expectedResult>
                    </step>
                    <step index="11">
                        <customFields/>
                        <description><![CDATA[W pozycji ,,Pola dynamiczne&quot; kliknij ,,Numer certyfikatu&quot;]]></description>
                        <expectedResult><![CDATA[Otwarcie przykładowego okna dynamicznego z numerem certyfikatu]]></expectedResult>
                    </step>
                    <step index="12">
                        <customFields/>
                        <description><![CDATA[Ustaw dynamiczne okno z numerem certyfikatu w lewym g&oacute;rym rogu certyfikatu]]></description>
                        <expectedResult><![CDATA[Ustawiono pozycję numeru certyfikatu]]></expectedResult>
                    </step>
                    <step index="13">
                        <customFields/>
                        <description><![CDATA[W pozycji ,,Pola dynamiczne&quot; kliknij ,,Nazwa kursu&quot;]]></description>
                        <expectedResult><![CDATA[Otwarcie przykładowego okna dynamicznego z nazwą kursu]]></expectedResult>
                    </step>
                    <step index="14">
                        <customFields/>
                        <description><![CDATA[Ustaw dynamiczne okno z przykładową nazwą kursu na środku certyfikatu]]></description>
                        <expectedResult><![CDATA[Ustawiono pozycję nazwy kursu na certyfikacie]]></expectedResult>
                    </step>
                    <step index="15">
                        <customFields/>
                        <description><![CDATA[W pozycji ,,Pola dynamiczne&quot; kliknij ,,Imię i nazwisko szkoleniowca&quot;]]></description>
                        <expectedResult><![CDATA[Otwarcie przykładowego okna dynamicznego z nazwiskiem szkoleniowca]]></expectedResult>
                    </step>
                    <step index="16">
                        <customFields/>
                        <description><![CDATA[Ustaw dynamiczne okno z przykładowym nazwiskiem szkoleniowca na środku certyfikatu pod tytułem kursu]]></description>
                        <expectedResult><![CDATA[Ustawiono pozycję nazwiska szkoleniowca na certyfikacie]]></expectedResult>
                    </step>
                    <step index="17">
                        <customFields/>
                        <description><![CDATA[W pozycji ,,Pola dynamiczne&quot; kliknij ,,Imię i nazwisko kursanta&quot;]]></description>
                        <expectedResult><![CDATA[Otwarcie przykładowego okna dynamicznego z nazwiskiem kursanta]]></expectedResult>
                    </step>
                    <step index="18">
                        <customFields/>
                        <description><![CDATA[Ustaw dynamiczne okno z przykładowym nazwiskiem kursanta w lewym dolnym rogu certyfikatu]]></description>
                        <expectedResult><![CDATA[Ustawiono pozycję nazwiska kursanta na certyfikacie]]></expectedResult>
                    </step>
                    <step index="19">
                        <customFields/>
                        <description><![CDATA[W pozycji ,,Pola dynamiczne&quot; kliknij ,,Data wygenerowania certyfikatu&quot;]]></description>
                        <expectedResult><![CDATA[Otwarcie przykładowego okna dynamicznego z przykładową datą]]></expectedResult>
                    </step>
                    <step index="20">
                        <customFields/>
                        <description><![CDATA[Ustaw dynamiczne okno z przykładową datą w prawym dolnym rogu certyfikatu]]></description>
                        <expectedResult><![CDATA[Ustawiono pozycję daty wygenerowania certyfikatu]]></expectedResult>
                    </step>
                    <step index="21">
                        <customFields/>
                        <description><![CDATA[W prawym g&oacute;rym rogu strony kliknij ,,Zapisz&quot;]]></description>
                        <expectedResult><![CDATA[Zapisano ustawienia generowanego certyfikatu, certyfikat jest gotowy do użycia]]></expectedResult>
                    </step>
                </steps>
            </testScript>
        </testCase>
        <testCase id="246837110" key="P50-T115">
            <attachments/>
            <confluencePageLinks/>
            <createdBy>TomaszStelmach</createdBy>
            <createdOn>2025-07-07 16:14:56 UTC</createdOn>
            <customFields/>
            <folder><![CDATA[Certyfikaty]]></folder>
            <issues/>
            <labels/>
            <name><![CDATA[Wybór szablonu certyfikatu]]></name>
            <owner>712020:ebd03abd-a59d-4309-8760-a707768cc8a3</owner>
            <precondition><![CDATA[1. Zalogować się na stronie https://mmrmqpr585.publigo.onl/wp-login.php<br> jako menedżer publigo.<br>Przeglądarka Chrome.]]></precondition>
            <priority><![CDATA[Normal]]></priority>
            <status><![CDATA[Approved]]></status>
            <parameters/>
            <testDataWrapper/>
            <testScript type="steps">
                <steps>
                    <step index="0">
                        <customFields/>
                        <description><![CDATA[Z menu gł&oacute;wnego wybierz pozycję &bdquo;Kursy&rdquo;]]></description>
                        <expectedResult><![CDATA[Widoczne okno z utworzonymi kursami, zakładka &bdquo;Kursy&rdquo;]]></expectedResult>
                    </step>
                    <step index="1">
                        <customFields/>
                        <description><![CDATA[Kliknij trzy kropki z prawej strony kursu &bdquo;Kurs Test 2&rdquo;]]></description>
                        <expectedResult><![CDATA[Widoczne okno z możliwością wyboru opcji]]></expectedResult>
                    </step>
                    <step index="2">
                        <customFields/>
                        <description><![CDATA[Kliknij przycisk: &bdquo;Edytuj&rdquo;]]></description>
                        <expectedResult><![CDATA[Otwarcie okna edycji kursu]]></expectedResult>
                    </step>
                    <step index="3">
                        <customFields/>
                        <description><![CDATA[Na dole strony w panelu ,,Certyfikacja&quot; kliknij ,,Konfiguruj&quot;]]></description>
                        <expectedResult><![CDATA[Otwarcie okna z możliwością edycji certyfikatu]]></expectedResult>
                    </step>
                    <step index="4">
                        <customFields/>
                        <description><![CDATA[Z rozwiniętej listy przy polu ,,Wybierz szablon certyfikatu&quot; wybierz ,,własny certyfikat MN&quot;]]></description>
                        <expectedResult><![CDATA[Wybrano szablon certyfikatu]]></expectedResult>
                    </step>
                    <step index="5">
                        <customFields/>
                        <description><![CDATA[Na dole okna edycji certyfikatu kliknij ,,Zapisz&quot;]]></description>
                        <expectedResult><![CDATA[Zapisano zmiany numeracji certyfikatu, pojawia się komunikat ,,Ustawienia zostały zapisane!&quot;]]></expectedResult>
                    </step>
                </steps>
            </testScript>
        </testCase>
        <testCase id="246837111" key="P50-T116">
            <attachments/>
            <confluencePageLinks/>
            <createdBy>TomaszStelmach</createdBy>
            <createdOn>2025-07-07 16:14:56 UTC</createdOn>
            <customFields/>
            <folder><![CDATA[Certyfikaty]]></folder>
            <issues/>
            <labels/>
            <name><![CDATA[Podgląd certyfikatu]]></name>
            <owner>712020:ebd03abd-a59d-4309-8760-a707768cc8a3</owner>
            <precondition><![CDATA[1. Zalogować się na stronie https://mmrmqpr585.publigo.onl/wp-login.php<br> jako menedżer publigo.<br>Przeglądarka Chrome.]]></precondition>
            <priority><![CDATA[Normal]]></priority>
            <status><![CDATA[Approved]]></status>
            <parameters/>
            <testDataWrapper/>
            <testScript type="steps">
                <steps>
                    <step index="0">
                        <customFields/>
                        <description><![CDATA[Z menu gł&oacute;wnego wybierz pozycję &bdquo;Kursy&rdquo;]]></description>
                        <expectedResult><![CDATA[Widoczne okno z utworzonymi kursami, zakładka &bdquo;Kursy&rdquo;]]></expectedResult>
                    </step>
                    <step index="1">
                        <customFields/>
                        <description><![CDATA[Kliknij trzy kropki z prawej strony kursu &bdquo;Kurs Test 2&rdquo;]]></description>
                        <expectedResult><![CDATA[Widoczne okno z możliwością wyboru opcji]]></expectedResult>
                    </step>
                    <step index="2">
                        <customFields/>
                        <description><![CDATA[Kliknij przycisk: &bdquo;Panel kursu&rdquo;]]></description>
                        <expectedResult><![CDATA[Otwarcie okna panelu kursu]]></expectedResult>
                    </step>
                    <step index="3">
                        <customFields/>
                        <description><![CDATA[W prawym g&oacute;rnym rogu strony kliknij &bdquo;Moje certyfikaty test&rdquo;]]></description>
                        <expectedResult><![CDATA[Otwarcie okna ,,Moje ceryfikaty&quot;]]></expectedResult>
                    </step>
                    <step index="4">
                        <customFields/>
                        <description><![CDATA[Kliknij w link ,,Kurs Test 2&quot;]]></description>
                        <expectedResult><![CDATA[Otwarcie okna generowania certyfikatu, certyfikat zostaje automatycznie pobrany i otwarty]]></expectedResult>
                    </step>
                </steps>
            </testScript>
        </testCase>
        <testCase id="246837113" key="P50-T117">
            <attachments/>
            <confluencePageLinks/>
            <createdBy>TomaszStelmach</createdBy>
            <createdOn>2025-07-07 16:14:56 UTC</createdOn>
            <customFields/>
            <folder><![CDATA[Certyfikaty]]></folder>
            <issues/>
            <labels/>
            <name><![CDATA[Pobieranie certyfikatu]]></name>
            <owner>712020:ebd03abd-a59d-4309-8760-a707768cc8a3</owner>
            <precondition><![CDATA[1. Zalogować się na stronie https://mmrmqpr585.publigo.onl/wp-login.php<br> jako menedżer publigo.<br>Przeglądarka Chrome.]]></precondition>
            <priority><![CDATA[Normal]]></priority>
            <status><![CDATA[Approved]]></status>
            <parameters/>
            <testDataWrapper/>
            <testScript type="steps">
                <steps>
                    <step index="0">
                        <customFields/>
                        <description><![CDATA[Z menu gł&oacute;wnego wybierz pozycję &bdquo;Certyfikaty&rdquo;]]></description>
                        <expectedResult><![CDATA[Widoczne okno z wydanymi certyfikatami, zakładka ,,Certyfikaty&quot;]]></expectedResult>
                    </step>
                    <step index="1">
                        <customFields/>
                        <description><![CDATA[Kliknij trzy kropki z prawej strony kursu &bdquo;Kurs Test 2&rdquo;]]></description>
                        <expectedResult><![CDATA[Widoczne okno z możliwością wyboru opcji]]></expectedResult>
                    </step>
                    <step index="2">
                        <customFields/>
                        <description><![CDATA[Kliknij przycisk: &bdquo;Pobierz&rdquo;]]></description>
                        <expectedResult><![CDATA[Pobranie pliku z certyfikatem]]></expectedResult>
                    </step>
                    <step index="3">
                        <customFields/>
                        <description><![CDATA[Otw&oacute;rz pobrany certyfikat]]></description>
                        <expectedResult><![CDATA[Otwarcie okna z wygenerowanym certyfikatem]]></expectedResult>
                    </step>
                </steps>
            </testScript>
        </testCase>
        <testCase id="246837114" key="P50-T118">
            <attachments/>
            <confluencePageLinks/>
            <createdBy>TomaszStelmach</createdBy>
            <createdOn>2025-07-07 16:14:56 UTC</createdOn>
            <customFields/>
            <folder><![CDATA[Certyfikaty]]></folder>
            <issues/>
            <labels/>
            <name><![CDATA[Dodawanie certyfikatu]]></name>
            <owner>712020:ebd03abd-a59d-4309-8760-a707768cc8a3</owner>
            <precondition><![CDATA[1. Zalogować się na stronie https://mmrmqpr585.publigo.onl/wp-login.php<br>jako menedżer publigo.<br>Przeglądarka Chrome.]]></precondition>
            <priority><![CDATA[Normal]]></priority>
            <status><![CDATA[Approved]]></status>
            <parameters/>
            <testDataWrapper/>
            <testScript type="steps">
                <steps>
                    <step index="0">
                        <customFields/>
                        <description><![CDATA[Z menu gł&oacute;wnego wybierz pozycję &bdquo;Ustawienia&rdquo;]]></description>
                        <expectedResult><![CDATA[Otwarcie okna z ustawieniami]]></expectedResult>
                    </step>
                    <step index="1">
                        <customFields/>
                        <description><![CDATA[Pod zakładką ,,Ustawienia&quot; kliknij pozycję &bdquo;Menu&rdquo;]]></description>
                        <expectedResult><![CDATA[Otwarcie okna z ustawieniami, zakładka ,,Menu&quot;]]></expectedResult>
                    </step>
                    <step index="2">
                        <customFields/>
                        <description><![CDATA[W panelu &bdquo;Dodaj element menu&rdquo; rozwiń pozycję ,,Własne odnośniki&quot;]]></description>
                        <expectedResult><![CDATA[Rozwinięcie okna ,,Własne odnośniki&quot;]]></expectedResult>
                    </step>
                    <step index="3">
                        <customFields/>
                        <description><![CDATA[W oknie ,,Adres URL&quot; wklej link do certyfikatu]]></description>
                        <expectedResult><![CDATA[Uzupełniono link do certyfikatu]]></expectedResult>
                    </step>
                    <step index="4">
                        <customFields/>
                        <description><![CDATA[W oknie ,,Treść odnośnika&quot; wpisz ,,Certyfikat Kurs Test 2&quot;]]></description>
                        <expectedResult><![CDATA[Uzupełniono treść linku do certyfikatu]]></expectedResult>
                    </step>
                    <step index="5">
                        <customFields/>
                        <description><![CDATA[Kliknij przycisk ,,Dodaj do menu&quot;]]></description>
                        <expectedResult><![CDATA[Dodano odnośnik do struktury menu]]></expectedResult>
                    </step>
                    <step index="6">
                        <customFields/>
                        <description><![CDATA[Na dole okna ,,Struktura menu&quot; kliknij przycisk ,,Zapisz menu&quot;]]></description>
                        <expectedResult><![CDATA[Zapisano zmiany w menu]]></expectedResult>
                    </step>
                </steps>
            </testScript>
        </testCase>
    </testCases>
</project>
