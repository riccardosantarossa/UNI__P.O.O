package Vaccini;


public class RegolaEtàMinima implements Regola
{
    /*
     * Classe che implementa la regola riguardante l'età minima 
     * La classe prevede un metodo test che controlla se l'età minima 
     * per la somministrazione del farmaco è rispettata
    */

    private int etaMinima;

    public RegolaEtàMinima(int e)
    {
        if(e < 0)
            throw new IllegalArgumentException("Età inserita non valida");
        else 
            this.etaMinima = e;
    }

    /*
     * Metodo che controlla se il paziente rispetta i requisiti di età
     * richiesti dalla vaccinazione
     * @param p: paziente su cui eseguire i test
    */
    public boolean test(Paziente p)
    {
       int e = p.getEta();
       return e < etaMinima;
    }

    //Non implementato in quanto non necessario
    public boolean test(Farmaco f) {return true;}

}
