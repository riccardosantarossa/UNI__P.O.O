
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
    private int dataVaccinazione;
    private Paziente pazienteVaccinato;
    private int dosaggioIniettato;

    public Farmaco getFarmacoUsato() {
        return this.farmacoUsato;
    }

    public void setFarmacoUsato(Farmaco farmacoUsato) {
        this.farmacoUsato = farmacoUsato;
    }

<<<<<<< HEAD
    public int getDataVaccinazione() {
        return this.dataVaccinazione;
    }

    public void setDataVaccinazione(int dataVaccinazione) {
=======
    public String getDataVaccinazione() {
        return this.dataVaccinazione;
    }

    public void setDataVaccinazione(String dataVaccinazione) {
>>>>>>> 068026310ecb3dd37cd06599b852e87e9f078f74
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

<<<<<<< HEAD
    public void configuraRegolaDosaggio(Paziente p, Farmaco f)
    {
        if (p.getEta()<= 6) 
            dosaggioIniettato = f.getDosaggioMin();
        else
            dosaggioIniettato = f.getDosaggioMax();


    }

    public Vaccinazione(Patologia pat, Paziente p, int data) throws Exception
    {
        farmacoUsato = pat.getCura().get(0);
        if (!checkRegola(farmacoUsato, p))
=======
    public Vaccinazione(Patologia pat, Paziente p, String data) throws Exception
    {
        farmacoUsato = pat.getCura().get(0);
        if (!checkRegola(farmacoUsato, pazienteVaccinato))
>>>>>>> 068026310ecb3dd37cd06599b852e87e9f078f74
            throw new Exception("I no vax non sono graditi ");

        else{
            
<<<<<<< HEAD
            configuraRegolaDosaggio(p, farmacoUsato);
            dataVaccinazione = data;
            pazienteVaccinato = p;

=======
            dataVaccinazione = data;
            pazienteVaccinato = pazienteVaccinato;
>>>>>>> 068026310ecb3dd37cd06599b852e87e9f078f74
        }


            
        
    }


<<<<<<< HEAD
=======
  
>>>>>>> 068026310ecb3dd37cd06599b852e87e9f078f74
}