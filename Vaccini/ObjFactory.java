import java.util.ArrayList;
import java.util.List;

public class ObjFactory {

    public Paziente creaUnPaziente(String n, String cn, int eta)
    {
        return new Paziente(n,cn,eta);
    }

    public Vaccinazione creaUnaVaccinazione(Patologia pat, int data, Paziente p) throws Exception
    {
        return new Vaccinazione(pat, p, data);
    }

    public RegistroVaccinazioni creaRegistro()
    {
        return new RegistroVaccinazioni();

    }

    public Patologia creaPatologia(String nome)
    {
        return new Patologia(nome);

    }

    public Farmaco creaFarmaco(String nome, int dmin, int dmax, Patologia pat, int durata, int etaMin)
    {
        return new Farmaco(nome,dmin,dmax,durata,pat, etaMin); 

    }

   
    
}
