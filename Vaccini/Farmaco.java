

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
<<<<<<< HEAD
    private int dosaggioMin;
    private int dosaggioMax;
=======
    private float dosaggioMin;
    private float dosaggioMax;
>>>>>>> 068026310ecb3dd37cd06599b852e87e9f078f74
    private List<Farmaco> compatibilità;
    private int etaMinima;
    private int durata;

    public int getDurata() {
        return this.durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

<<<<<<< HEAD
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
=======
    public float getDosaggioMin() {
        return this.dosaggioMin;
    }

    public void setDosaggioMin(float dosaggioMin) {
        this.dosaggioMin = dosaggioMin;
    }

    public float getDosaggioMax() {
        return this.dosaggioMax;
    }

    public void setDosaggioMax(float dosaggioMax) {
>>>>>>> 068026310ecb3dd37cd06599b852e87e9f078f74
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
<<<<<<< HEAD
    public Farmaco(String n, int dmin, int dmax, int d, Patologia pat, int etaMinima)
=======
    public Farmaco(String n, float dmin, float dmax, int d)
>>>>>>> 068026310ecb3dd37cd06599b852e87e9f078f74
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

        
<<<<<<< HEAD
       durata = d;     
       compatibilità = new ArrayList<Farmaco>();
       patologiaCurata = pat;
       this.etaMinima = etaMinima;
=======
            
       compatibilità = new ArrayList<Farmaco>();
    }

    public void AggiungiFarmacoNonCompatibile(Farmaco f)
    {
        compatibilità.add(f);
>>>>>>> 068026310ecb3dd37cd06599b852e87e9f078f74
    }

    public void AggiungiFarmacoNonCompatibile(Farmaco f)
    {
        compatibilità.add(f);
    }

    
}
