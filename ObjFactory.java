import java.util.List;

public class ObjFactory 
{
    /*
     * Istanzia un oggetto di tipo studente con dati VALIDI
     * @param mat: numero di matricola
     * @param n: nome dello studente
     * @param cn: cognome dello studente
     * @return istanza di studente utilizzabile per altri scopi
     */
    public Studente creaStudente(int mat, String n, String cn)
    {
        return new Studente(mat, n, cn);
    }

    /*
     * Istanzia un oggetto di tipo Corso
     * @param corso: nome del corso 
     * @param pre: lista degli esami prerequisiti, NULL se l'Corso non ne ha
     * @param peso: intero, peso del corso in CFU
     * @return istanza di un Corso del corso passato come parametro con i prerequisiti scelti
    */
    public Corso creaCorso(String m, List<Corso> pre, int peso)
    {
        return new Corso(m, 0, peso);
    }

    /*
     * Istanzia un oggetto di tipo appello, che può essere a domande aperte o chiuse
     * @param e: Corso di cui l'appello è 
     * @param d: data dell'appello
     * @param stud: studenti iscritti all'appello
     * @param t : tipologia di appello, se remoto o in presenza
     * @param tp : prova parziale o finale
     * @param td : specifica se l'appello è a domande chiuse o aperte
     * @return istanza di un appello del corso passato come parametro con data e studente iscritto
     */
    public Appello creaAppello(Corso c, String d, tipoAppello t, tipoProva tp, tipoDomandeCompito td)
    {
       return new Appello(c, d, t, tp, td);
    }
}
