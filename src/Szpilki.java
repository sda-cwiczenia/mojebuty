public class Szpilki extends But {

    Szpilki(boolean czyMeskie, int rozmiar, String kolor) {
        super(czyMeskie, rozmiar, kolor);
            }
    Szpilki(int rozmiar, String kolor) {
        czyUbrany = false;
        this.rozmiar = rozmiar;
        this.kolor = kolor;
        czyZamkniete = false;
        czyCzysty = true;
        iloscUbranButow = 0;
        czyMeskie = false;
    }

}
