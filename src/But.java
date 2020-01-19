public abstract class But implements ButInterfejs {
    boolean czyUbrany;
    String kolor;
    int rozmiar;
    boolean czyMeskie;
    boolean czyZamkniete;
    boolean czyCzysty;
    int iloscUbranButow;

    But(boolean czyMeskie, int rozmiar, String kolor) {
        czyUbrany = false;
        this.czyMeskie = czyMeskie;
        this.rozmiar = rozmiar;
        this.kolor = kolor;
        czyZamkniete = false;
        czyCzysty = true;
        iloscUbranButow = 0;
    }

    But() {
    }

    @Override
    public void zdejmij() {
        czyUbrany = false;
    }

    public void zaloz() {
        czyUbrany = true;
        iloscUbranButow++;
    }

    public void wypierz() {
        if (this instanceof Pralne) {
            if (czyUbrany == false) {
                czyCzysty = true;
                iloscUbranButow = 0;
            } else System.out.println("But jest aktualnie przymierzany nie można go teraz wyprać");
        } else System.out.println("Ten rodzaj butów nie może być prany");
    }

}
