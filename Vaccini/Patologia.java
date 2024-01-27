
import java.util.ArrayList;
import java.util.List;

public class Patologia 
{
    /*
     * Rappresenta la patologia che va curata.
     * Della patologia si rappresenta il nome , con una descrizione dei sintomi
     * e la lista dei farmaci (uno o più) necessari per curarla.
     */

     private String nome;
     private List<Farmaco> faramciPerVaccino;

     public List<Farmaco> getCura() {
         return this.faramciPerVaccino;
     }

     public void setCura(List<Farmaco> faramciPerVaccino) {
         this.faramciPerVaccino = faramciPerVaccino;
     }

     public String getNomePatoligia() {
        return this.nome;
    }

     public Patologia(String n)
     {
        if(n.isEmpty())
            throw new IllegalArgumentException("Inserire un nome non vuoto");
        else
            this.nome = n;

        faramciPerVaccino = new ArrayList<Farmaco>();
        
     }

     public void AggiungiFarmaco(Farmaco f){
        faramciPerVaccino.add(f);
     }
}
