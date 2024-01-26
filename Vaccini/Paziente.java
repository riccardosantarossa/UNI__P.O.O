

import java.util.List;

public class Paziente 
{
    /*
     * Classe che rappresenta un paziente che verrà sottoposto
     * ad una o più vaccinazioni
     * La classe contiene le informazione anagrafiche della persona come età, nome e cognome
     * e lo storico delle vaccinazioni a cui la persona è stata sottoposta nel tempo
     * La classe persona contiene anche informazioni sulle patologie di cui la persona
     * soffre, che verranno trattate in maniera differente a seconda della tipologia 
     */

    //Anagrafica
    private String nome;
    private String cognome;
    private int eta;

    private List<Patologia> patologie;
    private List<Vaccinazione> storicoVaccinazioni;

    //Getter e setter

    //Patologia
    public List<Patologia> getPatologie() {return this.patologie;}
    public void setPatologie(List<Patologia> patologie) {this.patologie = patologie;}

    //Età
    public int getEta() {return this.eta;}


    //Costruttore con controllo dell'input
    public Paziente(String n, String cn, int eta, List<Patologia> lp, List<Vaccinazione> lv)
    {
        if(n.isEmpty() || cn.isEmpty())
            throw new IllegalArgumentException("Inserire nome e cognome validi");
        else
        {
            this.nome = n;
            this.cognome = cn;
        }
            
        if(eta < 0)
            throw new IllegalArgumentException("Inserire un'età non negativa");
        else
            this.eta = eta;

        if(lp == null || lv == null)
            throw new IllegalArgumentException("Liste nulle");
        else
        {
            this.patologie = lp;
            this.storicoVaccinazioni = lv;
        }
        
    }
   

    
}
