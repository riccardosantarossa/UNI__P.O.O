import java.util.ArrayList;
import java.util.List;

public class Corso 
{
    private String materia;
    private List<Corso> corsiPrerequisiti = new ArrayList<>();
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

    
}
