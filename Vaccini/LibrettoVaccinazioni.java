import java.util.ArrayList;
import java.util.List;

public class LibrettoVaccinazioni {

    List<Vaccinazione> vaccinazioniEffettuate = new ArrayList<Vaccinazione>();

    public void aggiungVaccinazione(Vaccinazione v)
    {
        vaccinazioniEffettuate.add(v);
    }

    
}
