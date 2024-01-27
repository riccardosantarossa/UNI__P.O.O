import java.util.List;

public class Regola
{
    public boolean etaFarmaco(Paziente p, Farmaco f)
    {
<<<<<<< HEAD
      return (p.getEta() > f.getEtaMinima());      
=======
      return (p.getEta() < f.getEtaMinima());      
>>>>>>> 068026310ecb3dd37cd06599b852e87e9f078f74
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
<<<<<<< HEAD
        //TODO
=======
>>>>>>> 068026310ecb3dd37cd06599b852e87e9f078f74
        //controlla se l'intervallo è valido
       // p.getLibretto().vaccinazioniEffettuate.stream().filter()
       return true;
        

    }

}
