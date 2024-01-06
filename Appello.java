import java.util.ArrayList;
import java.util.List;

public class Appello 
{

    /*
     * Classe volta a gestire gli appelli degli esami dell'ateneo
     * Permette di creare appelli per un certo Corso in una certa data e di determinata 
     * tipologia, se in presenza o in remoto
    */

    private Corso corsodiRiferimento;
    private String data;
    private List<Studente> studIscritti = new ArrayList<>();
    private tipoAppello tipo;
    private tipoProva modEsame;
    private tipoDomandeCompito tipoDomande;

    //METODI GET E SET
    
    //Corso 
    public Corso getCorsodiRiferimento() {return this.corsodiRiferimento;}
    public void setCorsodiRiferimento(Corso corsodiRiferimento) {this.corsodiRiferimento = corsodiRiferimento;}

    //Data
    public String getData() {return this.data;}
    public void setData(String data) {this.data = data;}

    //Tipo
    public tipoAppello getTipo() {return this.tipo;}
    public void setTipo(tipoAppello tipo) {this.tipo = tipo;}

    //Medodo di esame
    public tipoProva getModEsame() {return this.modEsame;}
    public void setModEsame(tipoProva modEsame) {this.modEsame = modEsame;}

    //Tipo di domande
    public tipoDomandeCompito getTipoDomande() {return this.tipoDomande;}
    public void setTipoDomande(tipoDomandeCompito tipoDomande) {this.tipoDomande = tipoDomande;}

    /*
     * Controlla se lo studente ha superato i prerequisiti per un corsodiRiferimento
     * attraverso la sua carriera
     * @param carr : carriera di uno studente (esami superati e voti relativi)
     * @param c : corso del quale si vuole controllare se lo studente ha i prerequisiti
     */
    public boolean controlloPrerequisiti(Carriera carr, Corso c) throws Exception
    {
        List<Corso> pre = c.getCorsiPrerequisiti();

        if(carr.getcorsiSuperati().containsAll(pre))
            return true;
        else    
            throw new Exception("Lo studente non ha tutti i prerequisiti necessari");
    }

    /* 
     * Iscrive uno studente all'appello se possiede tutti i requisiti
     * @param s : studente idoneo ad essere iscritto (in regola con tasse e prerequisiti)
     * @param a : appello di un corso
    */
    public void iscrivi(Studente s, Appello a)
    {
        try 
        {
            if(controlloPrerequisiti(s.getCarr(), a.getCorsodiRiferimento()))
                a.studIscritti.add(s);
          
        } catch (Exception e) {e.printStackTrace();}
    }
}
