class prodavnica
{
    String naziv;
    String sediste;
    String delatnost;
    String duzina_rada;
    String kontakt;
    int maticni_broj;
    int PIB;
}

    Prodavnica()
    {
        naziv = "Haso Trade";
        sediste = "Vesela Doljina";
        delatnost = "SUR";
        duzina_rada = "24 godina";
        kontakt = "+38649000000";
        int maticni_broj = 1879968877
        int PIB = 2244;
    }

    Prodavnica(String naziv, String sediste, String delatnost, String duzina_rada, String kontakt, int maticni_broj, int PIB){
{
    this.naziv = naziv;
    this.sediste = sediste;
    this.delatnost = delatnost;
    this.duzina_rada = duzina_rada;
    this.kontakt = kontakt;
    this.maticni_broj = maticni_broj;
    this.PIB = PIB;
}

public String delatnost()
{
    return this.delatnost;
}
    
public int novoOtvorena()
{
    if (duzina_rada > 0 && duzina_rada == 1) return 1;
}

void ispis()
{
    System.out.println("Prodavnica: " + naziv + ", sediste: " + sediste + "\n Delatnost: " + delatnost + ", duzina_rada: " + duzina_rada + ", kontakt: " + kontakt + ", maticni_broj: " + maticni_broj + ", PIB: " + PIB + ")

}



}

class ProdavnicaTehnike extends Prodavnica
{
    int dnevni_prihod;
    int broj_zaposlenih;

    ProdavnicaTehnike(String naziv, String sediste, String delatnost, int duzina_rada, String kontakt,  int maticni_broj, int PIB)
    {
        super();
    }

    void ispisIznad()
    if (dnevni_prihod >= 60000)
    ispis();
  }
}

public class Grupa1_Kolokvijum
{
    public static void main(String[] args)
    Scanner unos = new Scanner(System.in):

    Prodavnica P1 = new Prodavnica ("ukus","Vesela Doljina","SUR","35","+38649000000","214108414"."60000");
    Prodavnica P2 = new Prodavnica ("Haso Trade"," Vesela Doljina")
}