public class Gumofilce extends But implements Nieprzemakalne, Pralne {

    Gumofilce(boolean czyMeskie, int rozmiar, String kolor) {
        super(czyMeskie, rozmiar, kolor);
    }

    @Override
    public void zamocz() {
        System.out.println("Sprawdzanie nieprzemakalności wykonane");
    }

    @Override
    public void zaloz() {
        super.zaloz();
        System.out.println("Gumofilce są ubrane");
    }

}
