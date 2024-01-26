

import java.util.List;

public class Farmaco 
{
    /*
    * Rappresenta un farmaco che può essere utilizzato per la cura di una 
    * determinata patologia. 
    * Di ogni farmaco viene rappresentato il nome e il dosaggio
    * in modo da poter vedere con chiarezza a che tipologia di persone può
    * essere somministrato
    */    

    private String nome;
    private Patologia patologiaCurata;
    private float dosaggio;
    private List<Farmaco> compatibilità;

    //Costruttore con controllo sull'input
    public Farmaco(String n, float d, List<Farmaco> lF)
    {   
        if(n.isEmpty())
            throw new IllegalArgumentException("Inserire un nome non vuoto");
        else
            this.nome = n;

        if(d < 0)
            throw new IllegalArgumentException("Inserire un dosaggio valido");
        else
            this.dosaggio = d;

        if(lF == null)
            throw new IllegalArgumentException("Elemento nullo");
        else
            this.compatibilità = lF;
    }
}
