import java.util.ArrayList;
import java.util.List;

public class Carriera 
{
    /*
     * Contiene le informazioni relative alla carriera di uno studente
     * quindi gli esami che ha superato con relativi voti e peso in CFU
     * Contiene inoltre la lista dei corsi a cui lo studente è iscritto, anche se non ha ancora 
     * sostenutto l'esame di quei determinati corsi
    */

    private List<Corso> corsiSuperati = new ArrayList<>();
    private List<Corso> corsiFrequentati = new ArrayList<>();

    //Metodi get e set
    public List<Corso> getCorsiFrequentati() {return this.corsiFrequentati;}
    public void setCorsiFrequentati(List<Corso> corsiFrequentati) {this.corsiFrequentati = corsiFrequentati;}
    public List<Corso> getcorsiSuperati() {return this.corsiSuperati;}
    public void setcorsiSuperati(List<Corso> corsiSuperati) {this.corsiSuperati = corsiSuperati;}

    /*
     * Aggiunge un'iscrizione ad un corso da parte di uno studente
     * @param c : corso che si vuole aggiungere alla lista dei corsi frequentati dallo studente   
     * @throws eccezione se il corso è già presente nella lista
    */
    public void aggiungiIscrizione(Corso c) throws Exception
    {
        if(!corsiFrequentati.contains(c))
            corsiFrequentati.add(c);
        else
            throw new Exception ("Lo studente sta già frequentando il corso selezionato");
    }

    /*
     * Aggiunge un corso superato dallo studente alla lista e lo rimuove dalla lista di quelli frequentati
     * in quanto è stato superato
     * @param c : corso da inserire nella sezione della carriera dello studente dedicata ai corsi superati, NON NULLO
     * @throws eccezione se il corso è già presente nella lista
    */
    public void aggiungiCorsoSuperato(Corso c) throws Exception
    {   
        if(corsiSuperati.contains(c))
            throw new Exception("Lo studente ha già superato l'esame di quel corso");
        else
        {
            corsiSuperati.add(c);
            rimuoviCorsoIscrizioni(c);
        }
            
    }

    /*
     * Rimuove il corso selezionato dalla lista delle iscrizioni
     * in quanto superato
     * @param c : corso da rimuovere dalla lista di quelli frequentati in quanto superato
     * @throws eccezione se il corso non si trova nella lista
     */
    public void rimuoviCorsoIscrizioni(Corso c) throws Exception
    {
        if(corsiFrequentati.contains(c))
        {
           corsiFrequentati.remove(c);
        }
        else
            throw new Exception("Corso non presente nella lista");
    }


    /*
     * Calcola le statisiche relative alla carriera di uno studente quindi la
     * somma dei CFU dei corsi superati dallo studente e media dei voti
     * @param s: studente di cui si vogliono calcolare le statistiche, NON NULLO 
     * @return : lista che contiene le statistiche calcolate, quindi media e sommaCFU
     */
    public List<Number> calcolaVotoMedio(Studente s)
    {
        int sommaCFU = 0, sommaVoti = 0;
        List<Number> listaStatistiche =  new ArrayList<>();
        Carriera c =  s.getCarr();

        //Iteratore per scorrere i corsi superati all'interno della carriera di s
        for( Corso x : c.getcorsiSuperati())
        {
            sommaCFU += x.getPesoCFU();
            sommaVoti += x.getVotoFinale();
        }

        listaStatistiche.add(sommaCFU);
        listaStatistiche.add(sommaVoti / c.getcorsiSuperati().size());

        return listaStatistiche;
    }
}
