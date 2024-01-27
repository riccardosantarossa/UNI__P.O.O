import java.util.ArrayList;
import java.util.List;

public class RegistroVaccinazioni 
{
    /*
     * Classe che rappresenta il registro delle vaccinazioni regionali
     * Con questa classe si possono aggiungere pazienti che hanno ricevuto la loro vaccinazione 
     * oppure ricevere un report di tutte le persone che sono state vaccinate fino a quel momento
    */

    List <Paziente> pazienti = new ArrayList<Paziente>();

    /*
     * Metodo che permette di aggiungere un paziente al registro di quelli vaccinati
     * @param p: paziente da aggiungere alla lista, NON NULLO 
     */
    public void aggiungiPaziente(Paziente p)
    {
        pazienti.add(p);
    }

    /*
     * Funzione che restituisce la copertura vaccinale per un determinato paziente
     * Se la copertura è ancora valida non sarà necessario rivaccinare, altrimenti
     * viene restituito un messaggio per notificare la mancanza di copertura per quella determinata patologia
     * @param nome: nome del paziente da ricercare
     * @param cognome: cognome del paziente da ricercare
     * @param pat: patologia di cui controllare la copertura vaccinale
     * @return messaggio di notifica a seconda dello stato della copertura
     */
    public String copertura(String nome, String cognome, String pat)
    {
            
        for(Paziente p : pazienti)
        {
            if(p.getNome().equals(nome) && p.getCognome().equals(cognome))
            {
                for(Vaccinazione v : p.getLibretto().getVaccinazioniEffettuate())
                {
                    if(v.getFarmacoUsato().getPatologiaCurata().getNomePatoligia().equals(pat) && (2024 - v.getDataVaccinazione())>v.getFarmacoUsato().getDurata())
                        return "La durata della copertura di "+v.getFarmacoUsato().getNome()+" è di "+v.getFarmacoUsato().getDurata()+" anni quindi è necessario che il paziente "+nome+" "+cognome+" effettui un richiamo, dato che l'ultima dose è del "+v.getDataVaccinazione();
                }
                
            }
        }
        return "Non è necessario effettuare un' altra dose";
    }

    /*
    * Metodo che stampa la lista dei pazienti presenti nel registro e i loro relativi vaccini
    */
    public void elencaPersoneVaccinate()
    {
        for(Paziente p  : pazienti )
        {
            System.out.println(p.getNome()+" "+p.getCognome());
            for( Vaccinazione v : p.getLibretto().getVaccinazioniEffettuate())
            {
                System.out.println(v.getFarmacoUsato().getNome()+" "+v.getFarmacoUsato().getPatologiaCurata().getNomePatoligia()+" "+v.getDataVaccinazione());
            }
        }
    }
    

}
