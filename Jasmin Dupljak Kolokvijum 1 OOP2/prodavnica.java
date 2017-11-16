
class Prodavnica {
    String Naziv;
    String Sediste;
    int PIB;
    int JMBG;
    String Delatnost;
    String DuzinaRada;
    String Kontakt;
   
    Public Prodavnica () {

        Naziv="Termal";
        Sediste="Novi Pazar";
        PIB=12323121;
        JMBG=1231212;
        Delatnost="Maloprodaja";
        DuzinaRada="Deset sati";
        Kontakt="broj";
    }

    Public Prodavnica (String Naziv,String Sediste,int PIB,int JMBG,String Delatnost,String DuzinaRada,String Kontakt) {
        this.Naziv=Naziv;
        this.Sediste=Sediste;
        this.PIB=PIB;
        this.JMBG=JMBG;
        this.Delatnost=Delatnost;
        this.DuzinaRada=DuzinaRada;
        this.Kontakt=Kontakt;
    }
     public void sediste_prodavnice() { 
        if (Sediste=="Novi Pazar") {
            System.out.println("Prodavnica je iz Novog Pazara");
        }
    
    }
    public void  PromenaGodine(){
       
       if (DuzinaRada >1){
           DuzinaRada+=1;
       }

    }
     public void ispis(){
        system.out.println("Prodavnica:"+Naziv+",Sediste:"+Sediste+"\n Delatnost:"+Delatnost+"Duzina rada:"+DuzinaRada+",Kontakt:"+Kontakt+",PIB:"+PIB,"JMBG"+JMBG);
        
    }
    
    }
    class ProdavnicaTehnike extends Prodavnica{
        int dnevni_prihod;
        int broj_zaposlenih;
    
    
    ProdavnicaTehnike(String Naziv,String Sediste,int DuzinaRada,string Kontakt,int JMBG,int PIB){
        super();
        this.broj_zaposlenih = broj_zaposlenih;
        this.dnevni_prihod = dnevni_prihod;
    }

        ProdavnicaTehnike() {
            dnevni_prihod = 47800;
        }
        ProdavnicaTehnike(int dnevni_prihod){
            this.dnevni_prihod = dnevni_prihod;
        }

        public void ispispodataka() {
            System.out.println("Broj zaposlenih" + broj_zaposlenih + "sa dnevnim prihodom" + dnevni_prihod);
        }
    }

class Test {
        public static void main (String[]args){
            
            Prodavnica P1=new Prodavnica("Nana","Novi Pazar","Sur",32,"+1232132131",1231231,24121);
            Prodavnia P2=new Prodavnica ("Mama","Novi Pazar","SUR",34,"+123213213",12321231,3333);
            ProdavnicaTehnike P3=new ProdavnicaTehnike ("Jaklja","Novi Pazar","PT",33,"+3333333","123333444",23233);
            P1.sediste_prodavnice();
            P2.ispis();
            P3.sediste_prodavnice();
            P3.ispis();
        }
    }





