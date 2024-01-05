

public class GestoreEsami 
{

    /*
     * Classe che gestisce le operazioni di iscrizione e valutazione
     * agli esami
     */


     //Non so se mettere qui l'iscrizione all'appello


    /*
    * Memorizza il voto ottenuto da uno studente e lo salva nella carriera
    * come un corso superato, con tutti i suoi attributi, rimuove il corso superato da quelli frequentati
    * @param s : studente a cui si vuole valutare l'esame
    * @param a : appello che si intende valutare
    * @param v : voto da salvare nella carriera
    * @return l'esame valutato da inserire in carriera
    */
    public Corso valutaCorso(Studente s, Appello a, int v)
    {
        
        //Costruisco il corso superato
        Corso corsoSuperato = new Corso();
        corsoSuperato.setMateria(a.getCorsodiRiferimento().getMateria());
        corsoSuperato.setPesoCFU(a.getCorsodiRiferimento().getPesoCFU());
        corsoSuperato.setVotoFinale(v);

        return corsoSuperato;
    }


}
