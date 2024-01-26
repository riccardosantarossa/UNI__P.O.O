
import java.util.ArrayList;
import java.util.List;

public class Vaccinazione 
{
    /*
     * Classe che contiene le informazioni sull'operazione di vaccinazione
     * Di ogni vaccinazione si conosce il paziente a cui si fa, la tipologia 
     * di farmaco utilizzata, la data di esecuzione.
     * Ogni vaccinazione sarà salvata in un registro delle vaccinazioni
     * necessario per poter tenere traccia delle somministrazioni fatte alla popolazione
     * da parte della regione 
    */
    
    private Farmaco farmacoUsato;
    private String dataVaccinazione;
    private Paziente pazienteVaccinato;

    public Farmaco getFarmacoUsato() {
        return this.farmacoUsato;
    }

    public void setFarmacoUsato(Farmaco farmacoUsato) {
        this.farmacoUsato = farmacoUsato;
    }

    public String getDataVaccinazione() {
        return this.dataVaccinazione;
    }

    public void setDataVaccinazione(String dataVaccinazione) {
        this.dataVaccinazione = dataVaccinazione;
    }

    public Paziente getPazienteVaccinato() {
        return this.pazienteVaccinato;
    }

    public void setPazienteVaccinato(Paziente pazienteVaccinato) {
        this.pazienteVaccinato = pazienteVaccinato;
    }

    public boolean checkRegola(Farmaco f, Paziente p){
        Regola check = new Regola();

       return(check.controllaCompatibilita(p, f) && check.controllaIntervallo(p, f) && check.etaFarmaco(p, f));

    }

    public Vaccinazione(Patologia pat, Paziente p, String data) throws Exception
    {
        farmacoUsato = pat.getCura().get(0);
        if (!checkRegola(farmacoUsato, pazienteVaccinato))
            throw new Exception("I no vax non sono graditi ");

        else{
            
            dataVaccinazione = data;
            pazienteVaccinato = pazienteVaccinato;
        }


            
        
    }


  
}