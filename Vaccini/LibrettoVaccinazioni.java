import java.util.ArrayList;
import java.util.List;

public class LibrettoVaccinazioni 
{

    /*
     * Classe che rappresenta il libretto vaccinale di ogni paziente 
     * ovvero tutte le vaccinaizione che la persona ha effettuato con relative 
     * date, farmaco utilizzato e copertura vaccinale (attributi di vaccinazione)
    */

    private List<Vaccinazione> vaccinazioniEffettuate;

    //Getter e setter
    
    public List<Vaccinazione> getVaccinazioniEffettuate() {return this.vaccinazioniEffettuate;}
    public void setVaccinazioniEffettuate(List<Vaccinazione> vaccinazioniEffettuate) {this.vaccinazioniEffettuate = vaccinazioniEffettuate;}

    //Coatruttore
    public LibrettoVaccinazioni()
    {
        this.vaccinazioniEffettuate = new ArrayList<Vaccinazione>();
    }

    /*
     * Metodo che permettere di aggiungere al libretto di vaccinazione di un paziente
     * la vaccinazione che egli ha effettuato
     * @param v: vaccinazione valida effettuata da un paziente
     */
    public void aggiungVaccinazione(Vaccinazione v)
    {
        vaccinazioniEffettuate.add(v);
    }

    
}
