import java.util.List;

public class ObjFactory 
{
    /*
     * Istanzia un oggetto di tipo studente
     * @param mat: numero di matricola
     * @param n: nome dello studente
     * @param cn: cognome dello studente
     * @return istanza di studente utilizzabile per altri scopi
     */
    public Studente creaStudente(int mat, String n, String cn)
    {
        Studente s = new Studente();
        s.setNumMatricola(mat);
        s.setNome(n);
        s.setCognome(cn);
        s.setCarr(new Carriera());

        return s;
    }

    /*
     * Istanzia un oggetto di tipo Corso
     * @param corso: nome del corso 
     * @param requisiti: lista degli esami prerequisiti, NULL se l'Corso non ne ha
     * @return istanza di un Corso del corso passato come parametro con i prerequisiti scelti
    */
    public Corso creaCorso(String m, List<Corso> pre, int peso)
    {
        Corso c = new Corso();
        c.setMateria(m);
        c.setCorsiPrerequisiti(pre);
        c.setPesoCFU(peso);

        return c;

    }

    /*
     * Istanzia un oggetto di tipo appello
     * @param e: Corso di cui l'appello è 
     * @param d: data dell'appello
     * @param stud: studenti iscritti all'appello
     * @return istanza di un appello del corso passato come parametro con data e studente iscritto
     */
    public Appello creaAppello(Corso c, String d, tipoAppello t, tipoProva tp)
    {
       Appello a = new Appello();
       a.setCorsodiRiferimento(c);
       a.setData(d);
       a.setTipo(t);
       a.setModEsame(tp);

       return a;
    }
}
