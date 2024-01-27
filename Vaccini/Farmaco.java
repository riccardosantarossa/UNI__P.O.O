

import java.util.ArrayList;
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
    private int dosaggioMin;
    private int dosaggioMax;
    private List<Farmaco> compatibilità;
    private int etaMinima;
    private int durata;

    public int getDurata() {
        return this.durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public int getDosaggioMin() {
        return this.dosaggioMin;
    }

    public void setDosaggioMin(int dosaggioMin) {
        this.dosaggioMin = dosaggioMin;
    }

    public int getDosaggioMax() {
        return this.dosaggioMax;
    }

    public void setDosaggioMax(int dosaggioMax) {
        this.dosaggioMax = dosaggioMax;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Patologia getPatologiaCurata() {
        return this.patologiaCurata;
    }

    public void setPatologiaCurata(Patologia patologiaCurata) {
        this.patologiaCurata = patologiaCurata;
    }

    public List<Farmaco> getCompatibilità() {
        return this.compatibilità;
    }


    public int getEtaMinima() {
        return this.etaMinima;
    }

    public void setEtaMinima(int etaMinima) {
        this.etaMinima = etaMinima;
    }


    //Costruttore con controllo sull'input
    public Farmaco(String n, int dmin, int dmax, int d, Patologia pat, int etaMinima)
    {   
        if(n.isEmpty())
            throw new IllegalArgumentException("Inserire un nome non vuoto");
        else
            this.nome = n;

        if(dmax < 0 || dmin < 0)
            throw new IllegalArgumentException("Inserire un dosaggio valido");
        else
        {
            this.dosaggioMin = dmin;
            this.dosaggioMax = dmax;
        }

        
       durata = d;     
       compatibilità = new ArrayList<Farmaco>();
       patologiaCurata = pat;
       this.etaMinima = etaMinima;
    }

    public void AggiungiFarmacoNonCompatibile(Farmaco f)
    {
        compatibilità.add(f);
    }

    
}
