

public class Regola
{
    public boolean etaFarmaco(Paziente p, Farmaco f)
    {
      return (p.getEta() > f.getEtaMinima());      
    }
    
    public boolean controllaCompatibilita(Paziente p, Farmaco f){ 

        for(Vaccinazione v : p.getLibretto().vaccinazioniEffettuate)
        {
            for(Farmaco farm : f.getCompatibilità())
            {
                if (v.getFarmacoUsato().equals(farm)) {

                    return false;
                    
                }
            }
        }

        return true;
        
    }

    public boolean controllaIntervallo(Paziente p, Farmaco f)
    {
        //TODO
        //controlla se l'intervallo è valido
       // p.getLibretto().vaccinazioniEffettuate.stream().filter()
       return true;
        

    }

}
