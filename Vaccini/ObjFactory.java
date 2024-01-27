

public class ObjFactory 
{
    /*
     * Classe che utilizza il design pattern factory per creare istanze di tutti
     * gli oggetti di dominio presenti nello scenario
    */

    /*
     * Metodo che crea l'istanza di un paziente mediante il suo costruttore
     * La validità dei parametri viene stabilita all'interno del costruttore di Paziente
     * @param n: nome del paziente
     * @param cn: cognome del paziente
     * @param eta: età del paziente
     * @return istanza di Paziente con dati validi
     */
    public Paziente creaUnPaziente(String n, String cn, int eta)
    {
        return new Paziente(n,cn,eta);
    }

   
    /*
     * Metodo che crea l'istanza di una vaccinazione mediante il suo costruttore
     * La validità dei parametri viene stabilita all'interno del costruttore di Vaccinazione
     * @param pat: patologia che la vaccinazione cura
     * @param data: anno in cui la vaccinazione viene effettuata
     * @param p: paziente che si sottopone alla vaccinazione
     * return istanza di Vaccinazione con dati validi
     */
    public Vaccinazione creaUnaVaccinazione(Patologia pat, int data, Paziente p) throws Exception
    {
        return new Vaccinazione(pat, p, data);
    }

    /*
     * Crea un'istanza del registro vaccinazioni regionale
     * @return istanza del registro vaccinazioni
     */
    public RegistroVaccinazioni creaRegistro()
    {
        return new RegistroVaccinazioni();

    }

    /*
     * Crea un'istanza di patologia mediante il suo costruttore
     * @param nome: nome della patologia
     * @return istanza di patologia con dati validi
     */
    public Patologia creaPatologia(String nome)
    {
        return new Patologia(nome);

    }

    /*
     * Crea un'istanza di farmaco con il suo costruttore
     * @param nome: nome del farmaco
     * @param dmin: dosaggio minimo del farmaco
     * @param dmax: dosaggio masssimo del farmaco 
     * @param pat: patologia che il farmaco cura
     * @param durata: durata della copertura farmaceutica
     * @param etaMin: età minima per la somministrazione del farmaco
     * @return istanza di farmaco con parametri controllati dal costruttore
     */
    public Farmaco creaFarmaco(String nome, int dmin, int dmax, Patologia pat, int durata, int etaMin)
    {
        return new Farmaco(nome,dmin,dmax,durata,pat, etaMin); 

    }

   
    
}
