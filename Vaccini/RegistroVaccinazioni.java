import java.util.ArrayList;
import java.util.List;

public class RegistroVaccinazioni 
{
    List <Paziente> pazienti = new ArrayList<Paziente>();

    public void AggiungiPaziente(Paziente p){
        pazienti.add(p);
    }
    
}
