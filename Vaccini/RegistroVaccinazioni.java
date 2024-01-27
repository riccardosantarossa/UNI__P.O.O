import java.util.ArrayList;
import java.util.List;

public class RegistroVaccinazioni 
{
    List <Paziente> pazienti = new ArrayList<Paziente>();

    public void AggiungiPaziente(Paziente p){
        pazienti.add(p);
    }
<<<<<<< HEAD
    public String copertura(String nome, String cognome, String pat){
            
        for(Paziente p : pazienti)
        {
            if(p.getNome().equals(nome) && p.getCognome().equals(cognome))
            {
                for(Vaccinazione v : p.getLibretto().vaccinazioniEffettuate)
                {
                    if(v.getFarmacoUsato().getPatologiaCurata().getNomePatoligia().equals(pat) && (2024 - v.getDataVaccinazione())>v.getFarmacoUsato().getDurata())
                        return "La durata della copertura di "+v.getFarmacoUsato().getNome()+" è di "+v.getFarmacoUsato().getDurata()+" anni quindi è necessario che il paziente "+nome+" "+cognome+" effettui un richiamo, dato che l'ultima dose è del "+v.getDataVaccinazione();
                }
                
            }
        }
        return "Non è necessario effettuare un' altra dose";
    }

    /*
     Stampa la lista dei pazienti presenti nel registro e i loro relativi vaccini
     */
    public void elencaPersoneVaccinate(){
        for(Paziente p  : pazienti )
        {
            System.out.println(p.getNome()+" "+p.getCognome());
            for( Vaccinazione v : p.getLibretto().vaccinazioniEffettuate){
                System.out.println(v.getFarmacoUsato().getNome()+" "+v.getFarmacoUsato().getPatologiaCurata().getNomePatoligia()+" "+v.getDataVaccinazione());
            }
        }
    }
    

=======
    
>>>>>>> 068026310ecb3dd37cd06599b852e87e9f078f74
}
