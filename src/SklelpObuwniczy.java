import java.util.ArrayList;
import java.util.List;

public class SklelpObuwniczy {
    public static void main(String[] args) {
        But vansy = new Trampki(true, 42, "czerwony");
        But kopciuszek = new Szpilki(38, "pudrowy");
        But nagrzyby = new Gumofilce(true, 43, "czarny");
        But mojBut = ButFactory.stworzBucik();

        List<But> listaButow = new ArrayList<>();
        listaButow.add(vansy);
        listaButow.add(kopciuszek);
        listaButow.add(nagrzyby);
        listaButow.add(mojBut);

        for ( But but : listaButow) {
            System.out.println("-------------------------");
            System.out.println("Typ buta: "+but.getClass().getName());
            System.out.println("Czy męskie: "+but.czyMeskie);
            System.out.println("Rozmiar: "+but.rozmiar);
            System.out.println("Kolor: "+but.kolor);
        }

    }
}
