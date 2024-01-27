
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

    //Getter e setter

    //Farmaco
    public Farmaco getFarmacoUsato() {return this.farmacoUsato;}
    public void setFarmacoUsato(Farmaco farmacoUsato) {this.farmacoUsato = farmacoUsato;}

    //Data
    public int getDataVaccinazione() {return this.dataVaccinazione;}
    public void setDataVaccinazione(int dataVaccinazione) {this.dataVaccinazione = dataVaccinazione;}

    //Paziente
    public Paziente getPazienteVaccinato() {return this.pazienteVaccinato;}
    public void setPazienteVaccinato(Paziente pazienteVaccinato) {this.pazienteVaccinato = pazienteVaccinato;}

    /*
     * Metodo che controlla se il farmaco che si desidere utilizzare sul paziente rispetta tutte le regole,
     * quindi quella sull'età, sulla compatibilità e sull'intervallo di copertura 
     * @param f: farmaco da controllare
     * @param p: paziente sul quale si vogliono testare le regole
     * @return vero se il paziente rispetta tutti i requisiti (contemporaneamente) per poter prendere il farmaco, falso altrimenti
     */
    public boolean checkRegola(Farmaco f, Paziente p)
    {
       Regola check = new Regola();

       return(check.controllaCompatibilita(p, f) && check.controllaIntervallo(p, f) && check.etaFarmaco(p, f));

    }

    /*
     * Metodo che permette di configurare il dosaggio di un farmaco a seconda dell'età di un paziente
     * @param p: paziente di cui si vuole conoscere l'età
     * @param f: farmaco di cui si determinerà il dosaggio da utilizzare
     */
    public void configuraRegolaDosaggio(Paziente p, Farmaco f)
    {
        if (p.getEta() <= 6) 
            dosaggioIniettato = f.getDosaggioMin();
        else
            dosaggioIniettato = f.getDosaggioMax();
    }

    //Costruttore 
    public Vaccinazione(Patologia pat, Paziente p, int data) throws Exception
    {
        farmacoUsato = pat.getCura().get(0);
        if (!checkRegola(farmacoUsato, p))
            throw new Exception("La vaccinazione non è fattibile");
        else
        {  
            configuraRegolaDosaggio(p, farmacoUsato);
            this.dataVaccinazione = data;
            this.pazienteVaccinato = p;
        } 
    }


}