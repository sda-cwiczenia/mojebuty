public class Trampki extends But implements Pralne, Sznurowalne {


    Trampki(boolean czyMeskie, int rozmiar, String kolor) {
        super(czyMeskie, rozmiar, kolor);
    }

    @Override
    public void zaloz() {
        super.zaloz();
        System.out.println("Trampki są ubrane");
    }




    @Override
    public void zamknij() {
        czyZamkniete = true;
    }
}
