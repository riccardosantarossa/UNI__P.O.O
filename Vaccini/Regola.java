package Vaccini;


public interface Regola
{
    /*
     * Definisce un'interfaccia comune per tutte le regole
     * Ogni volta che si esegue una vaccinazione sarà necessario verificare 
     * che tutte le regole stabilite per quella patologia vengano rispettate
     */

    /*
     * Metodo di test generico per tutte le regole, applicabile ad un paziente
     * Test di questo tipo sono ad esempio sull'età minima o sulle coperture vaccinali
     * @param p: paziente da testare
     */
    public boolean test(Paziente p);

    /*
     * Metodo di test generico per i farmaci
     * Test di questo tipo sono ad esempio quelli sulla compatibilità dei farmaci
     * @param f: farmaco da testare
     */
    public boolean test(Farmaco f);
}
