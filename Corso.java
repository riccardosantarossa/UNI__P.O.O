import java.util.ArrayList;
import java.util.List;

public class Corso 
{
    private String materia;
    private List<Corso> corsiPrerequisiti;
    private int votoFinale, pesoCFU;


    //Metodi get e set
    
    //Prerequisiti
    public List<Corso> getCorsiPrerequisiti() {return this.corsiPrerequisiti;}
    public void setCorsiPrerequisiti(List<Corso> esamiPrerequisiti) {this.corsiPrerequisiti = esamiPrerequisiti;}
    
    //Materia
    public String getMateria() {return this.materia;}
    public void setMateria(String materia) {this.materia = materia;}
    
    //CFU
    public int getPesoCFU() { return this.pesoCFU;}
    public void setPesoCFU(int pesoCFU) {this.pesoCFU = pesoCFU;}
    
    //Voto
    public int getVotoFinale() { return this.votoFinale;}
    public void setVotoFinale(int votoFinale) {this.votoFinale = votoFinale;}

    /*
     * Costruttore con controlli sull'input, genera un'istanza di tipo Corso
     * @param m : materia soggetta del corso, stringa non vuota
     * @param vF : voto da attibuire, inizialmente 0 
     * @param pCFU : peso in CFU del corso 
     */
    public Corso(String m, int vF, int pCFU)
    {
        if(m.isEmpty())
          throw new IllegalArgumentException("Il nome della materia NON può essere vuoto");
        else
            this.materia = m;
        
        if(vF < 0)
            throw new IllegalArgumentException("Il voto NON può essere negativo");
        else
            this.votoFinale = vF;

        if(pCFU < 0)
            throw new IllegalArgumentException("Il peso in cfu NON può essere negativo");
        else
            this.pesoCFU = pCFU;

        this.corsiPrerequisiti = new ArrayList<>();
        
    }
    
}
