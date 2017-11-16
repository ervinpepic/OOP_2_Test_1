class Prodavnica
{
    String naziv;
    String sediste;
    String delatnost;
    int duzina_rada;
    String kontakt;
    int maticni_broj;
    int PIB;

    Prodavnica()
    {
        naziv = "Mek Drajf";
        sediste = "Novi Pazar";
        delatnost = "SUR";
        duzina_rada = 17;
        kontakt = "mekdrajf@live.com";
        int maticni_broj = 4827279;
        int PIB = 1111;
    }

    Prodavnica(String naziv, String sediste, String delatnost, int duzina_rada, String kontakt, int maticni_broj, int PIB)
    {
        this.naziv = naziv;
        this.sediste = sediste;
        this.delatnost = delatnost;
        this.duzina_rada = duzina_rada;
        this.kontakt = kontakt;
        this.maticni_broj = maticni_broj;
        this.PIB = PIB;
    }

    public String delatnostRadnje()
    {
        return this.delatnost;
    }

    public int novoOtvorena()
    {
        if (duzina_rada > 0 && duzina_rada == 1) return 1;
        else return 0;
    }

    void ispis()
    {
        System.out.println("Prodavnica: " + naziv + ", sediste: " + sediste + "\n Delatnost: " + delatnost + ", sa duzinom rada od " + duzina_rada + "\n Kontakt: " + kontakt + "\n Maticni broj: " + maticni_broj + ", PIB: " + PIB);
    }



}

class ProdavnicaTehnike extends Prodavnica
{
    int dnevni_prihod;
    int broj_zaposlenih;
    
    ProdavnicaTehnike(String naziv, String sediste, int duzina_rada, String kontakt, int maticni_broj, int PIB, int broj_zaposlenih, int dnevni_prihod)
    {
        super();
        this.broj_zaposlenih = broj_zaposlenih;
        this.dnevni_prihod = 28200;
    }
    

    void ispisIznad()
    {
        if (dnevni_prihod > 50000){

         System.out.println("Radnja: " + naziv + "sa sedistem u " + sediste + "u, radi vec " + duzina_rada + " godina.\n Kontakt: " + kontakt + ", maticni broj: " + maticni_broj + " i PIB: " + PIB + "\n Ima ukupno zaposlenih " + broj_zaposlenih + " radnika i dnevni prihod: " + dnevni_prihod);

        }
    }
}

public class Grupa1_Kolokvijum
{
    public static void main(String[] args) 
    {
        Prodavnica P1 = new Prodavnica("Ukus", "Novi Pazar", "SUR", 35, "+381644545005", 27178983, 6111);
        Prodavnica P2 = new Prodavnica("Mek Drajf", "Novi Pazar", "SUR", 100, "+381644545001", 1919582, 2149);
        ProdavnicaTehnike P3 = new ProdavnicaTehnike("WinWin", "Beograd", 12, "winwin@gmail.com", 871289, 8853, 37,93710);
        P2.delatnostRadnje();
        if (P1.novoOtvorena() == 0) 
        System.out.println("Radnja je tek otvorena");
        else
        System.out.println("Radnja radi vec duze vrijeme");
        P2.ispis();
        P3.ispisIznad();
        
    }
}