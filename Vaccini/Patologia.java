
import java.util.ArrayList;
import java.util.List;

public class Patologia 
{
    /*
     * Rappresenta la patologia che va curata.
     * Della patologia si rappresenta il nome , e la lista dei farmaci (uno o più) necessari per curarla.
     * Si possono aggiungere farmaci nella lista dei possibili trattamente mediante il metodo apposito,
     * tali farmaci saranno utilizzabili come vaccino 
     */

    private String nome;
    private List<Farmaco> faramciPerVaccino;

    //Getter e setter
    public List<Farmaco> getCura() {return this.faramciPerVaccino; }
    public void setCura(List<Farmaco> faramciPerVaccino) { this.faramciPerVaccino = faramciPerVaccino;}

    public String getNomePatoligia() {return this.nome;}

    //Costruttore con controllo dell'input
    public Patologia(String n)
    {
        if(n.isEmpty())
            throw new IllegalArgumentException("Inserire un nome non vuoto");
        else
            this.nome = n;

        this.faramciPerVaccino = new ArrayList<Farmaco>();
    }

    /*
     * Aggiunge un farmaco alla lista di farmaci utilizzabili come vaccino per 
     * la patologia in questione
     * @param f: farmaco da aggiungere alla lista
     */
    public void AggiungiFarmaco(Farmaco f)
    {
        faramciPerVaccino.add(f);
    }


}
