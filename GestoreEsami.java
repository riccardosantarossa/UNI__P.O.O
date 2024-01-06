public class GestoreEsami 
{

    /*
     * Classe che gestisce le operazioni di iscrizione e valutazione
     * agli esami
     */


     //Non so se mettere qui l'iscrizione all'appello


    /*
     * Valuta il risultato di un quiz e restituisce il voto su una scala in trentesimi
     * @param q : quiiz che si intende valutare
     * @param numeroRisposteCorrette : numero di risposte esatte date dallo studente >=0
     * @return voto : voto calcolato in trentesimi
     */
    public int valutaQuiz(Quiz q, int numeroRisposteCorrette)
    {
        int domande = q.getNumeroDomande();
        int voto;

        voto = (int) (numeroRisposteCorrette / domande) * 30;
        
        return voto;
    }

    

    /*
    * Memorizza il voto ottenuto da uno studente in un quiz e lo salva nella carriera
    * come un corso superato se il voto supera il 18, con tutti i suoi attributi, rimuove il corso superato da quelli frequentati
    * @param s : studente a cui si vuole valutare l'esame
    * @param a : appello CON COMPITO STILE QUIZ che si intende valutare
    * @param v : voto da salvare nella carriera
    * @return l'esame valutato da inserire in carriera
    */
    public Corso valutaAppello(Studente s, Appello a, int v) throws Exception
    {
        
        if(a.getTipoDomande() != tipoDomandeCompito.domandeChiuse)
            throw new Exception("L'esame deve esssere valutato dal docente");
        else if(v < 18)
             throw new Exception("L'esame risulta insufficiente");
        else
        {
            //Costruisco il corso superato
            Corso corsoSuperato = new Corso();
            corsoSuperato.setMateria(a.getCorsodiRiferimento().getMateria());
            corsoSuperato.setPesoCFU(a.getCorsodiRiferimento().getPesoCFU());
            corsoSuperato.setVotoFinale(v);

            return corsoSuperato;
        } 
            
    }


}
