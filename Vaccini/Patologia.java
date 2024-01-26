
import java.util.List;

public class Patologia 
{
    /*
     * Rappresenta la patologia che va curata.
     * Della patologia si rappresenta il nome , con una descrizione dei sintomi
     * e la lista dei farmaci (uno o più) necessari per curarla.
     */

     private String nome;
     private List<Farmaco> cura;

     public List<Farmaco> getCura() {
         return this.cura;
     }

     public void setCura(List<Farmaco> cura) {
         this.cura = cura;
     }

     public Patologia(String n, List<Farmaco> lF)
     {
        if(n.isEmpty())
            throw new IllegalArgumentException("Inserire un nome non vuoto");
        else
            this.nome = n;

        if(lF == null)
            throw new IllegalArgumentException("Elemento nullo");
        else
            this.cura = lF;
     }

     public void AggiungiFarmaco(Farmaco f){
        cura.add(f);
     }
}
