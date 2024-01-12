public class Quiz 
{
    /* 
    * Classe che rappresenta il tipo di esame a risposta chiusa quindi  
    * con un numero di domande fisso e a risposta vera o falsa   
    * Gli esami di questo tipo vengono corretti automaticamente
    * dall'apposito metodo per la correzione
    */    

    private int numeroDomande;

    //METODI GET E SET 

    //Domande
    public int getNumeroDomande() {return this.numeroDomande;}
    public void setNumeroDomande(int numeroDomande) {this.numeroDomande = numeroDomande;}

    /* 
    * Valuta il risultato di un quiz e restituisce il voto su una scala in trentesimi
    * @param numeroRisposteCorrette : numero di risposte esatte date dallo studente >=0
    * @return voto : voto calcolato in trentesimi
    */
    public int valuta(int numeroRisposteCorrette)
    {
        int voto = (int) (numeroRisposteCorrette / numeroDomande) * 30;
        return voto;
    }

}

