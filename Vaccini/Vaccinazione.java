
import java.util.ArrayList;
import java.util.List;

public class Vaccinazione 
{
    /*
     * Classe che contiene le informazioni sull'operazione di vaccinazione
     * Di ogni vaccinazione si conosce il paziente a cui si fa, la tipologia 
     * di farmaco utilizzata, la data di esecuzione.
     * Ogni vaccinazione sarà salvata in un registro delle vaccinazioni
     * necessario per poter tenere traccia delle somministrazioni fatte alla popolazione
     * da parte della regione 
    */
    
    private Farmaco farmacoUsato;
    private String dataVaccinazione;
    private Paziente pazienteVaccinato;


    /*
     * Metodo che controlla se tutti i prerequisiti per la vaccinazione vengono rispettati
     * @param p: paziente che si vuole vaccinare
     * @param f: farmaco usato nella vaccinazione
     */
    public void vaccina(Paziente p, Farmaco f)
    {
        List<Patologia> lP = p.getPatologie();
        List<Farmaco> lF = new ArrayList<>();

        for(Patologia pat : lP)
        {
            lF.add(pat.)
        }
    }
}