import java.util.ArrayList;
import java.util.List;

public class ObjFactory {

    public Paziente creaUnPaziente(String n, String cn, int eta)
    {
        return new Paziente(n,cn,eta);
    }

    public Vaccinazione creaUnaVaccinazione(Patologia pat, String data, Paziente p) throws Exception
    {
        return new Vaccinazione(pat, p, data);
    }

    public RegistroVaccinazioni creaRegistro()
    {
        return new RegistroVaccinazioni();

    }

    public Patologia creaPatologia(String nome, List lf)
    {
        return new Patologia(nome, lf);

    }

    public Farmaco creaFarmaco(String nome, float dmin, float dmax)
    {
        return new Farmaco(nome,dmin,dmax); 

    }

   
    
}
