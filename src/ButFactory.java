import java.util.Scanner;

public class ButFactory {
    static But stworzBucik() {
        String typButa = "";
        boolean czyMeski;
        String typ = "";
        int rozmiar;
        String kolor;

        Scanner pobierz = new Scanner(System.in);
        System.out.print("Podaj typ buta (Gumofilce, Szpilki, Trampki): ");
        typButa = pobierz.next();
        System.out.print("Podaj czy typ męski tak/nie");
        typ = pobierz.next();

        switch (typ) {
            case "tak":
                czyMeski = true;
                break;
            case "nie":
                czyMeski = false;
                break;
            default:
                czyMeski = false;
        }
        System.out.print("Podaj rozmiar buta: ");
        rozmiar = pobierz.nextInt();
        System.out.print("Podaj kolor buta: ");
        kolor = pobierz.next();

        switch (typButa) {
            case "Gumofilce":
                return new Gumofilce(czyMeski, rozmiar, kolor);

            case "Szpilki":
                return new Szpilki(rozmiar, kolor);

            case "Trampki":
                return new Trampki(czyMeski, rozmiar, kolor);

            default:
                return null;
        }


    }
}
