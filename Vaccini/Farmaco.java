

import java.util.ArrayList;
import java.util.List;

public class Farmaco 
{
    /*
    * Rappresenta un farmaco che può essere utilizzato per la cura di una 
    * determinata patologia. 
    * Di ogni farmaco viene rappresentato il nome con relativo dosaggio massimo e minimo
    * che può essere somministrato e l'età minima di somministrazione.
    * Di un farmaco si rappresentano anche la lista di farmaci compatibili per future vaccomazopmo
    */    

    private String nome;
    private Patologia patologiaCurata;
    private int dosaggioMin;
    private int dosaggioMax;
    private List<Farmaco> compatibilità;
    private int etaMinima;
    private int durata;

    //Getter e setter

    //Durata della coperture
    public int getDurata() {return this.durata;}
    public void setDurata(int durata) {this.durata = durata;}

    //Dosaggio
    public int getDosaggioMin() {return this.dosaggioMin;}
    public void setDosaggioMin(int dosaggioMin) {this.dosaggioMin = dosaggioMin;}
    public int getDosaggioMax() {return this.dosaggioMax;}
    public void setDosaggioMax(int dosaggioMax) {this.dosaggioMax = dosaggioMax;}

    //Nome del farmaco
    public String getNome() {return this.nome;}
    public void setNome(String nome) {this.nome = nome;}

    //Patologia curata
    public Patologia getPatologiaCurata() { return this.patologiaCurata;}
    public void setPatologiaCurata(Patologia patologiaCurata) {this.patologiaCurata = patologiaCurata;}

    //Farmaci compatibili 
    public List<Farmaco> getCompatibilità() {return this.compatibilità;}

    //Età minima
    public int getEtaMinima() {return this.etaMinima;}
    public void setEtaMinima(int etaMinima) {this.etaMinima = etaMinima;}


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
       
        if(d < 0)
            throw new IllegalArgumentException("Inserire una durata valida"); 
        else
            this.durata = d;
        
        if(pat == null)
            throw new IllegalArgumentException("Oggetto patologia nullo");
        else
            this.patologiaCurata = pat;


        if(etaMinima < 0)
            throw new IllegalArgumentException("Inserire un'et' minima valida"); 
        else
            this.etaMinima = etaMinima;

        this.compatibilità = new ArrayList<Farmaco>();
    }

    /*
     * Metodo che permette di aggiungere un farmaco non compatibile alla lista
     * di incompatibilità, per evitare vaccinazioni errate nel futuro
     * @param f: farmaco da aggiungere alla lista, NON NULLO
     */
    public void AggiungiFarmacoNonCompatibile(Farmaco f)
    {
        compatibilità.add(f);
    }

    
}
