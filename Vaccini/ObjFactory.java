import java.util.ArrayList;
import java.util.List;

public class ObjFactory {

    public Paziente creaUnPaziente(String n, String cn, int eta)
    {
        return new Paziente(n,cn,eta);
    }

<<<<<<< HEAD
    public Vaccinazione creaUnaVaccinazione(Patologia pat, int data, Paziente p) throws Exception
=======
    public Vaccinazione creaUnaVaccinazione(Patologia pat, String data, Paziente p) throws Exception
>>>>>>> 068026310ecb3dd37cd06599b852e87e9f078f74
    {
        return new Vaccinazione(pat, p, data);
    }

    public RegistroVaccinazioni creaRegistro()
    {
        return new RegistroVaccinazioni();

    }

<<<<<<< HEAD
    public Patologia creaPatologia(String nome)
    {
        return new Patologia(nome);

    }

    public Farmaco creaFarmaco(String nome, int dmin, int dmax, Patologia pat, int durata, int etaMin)
    {
        return new Farmaco(nome,dmin,dmax,durata,pat, etaMin); 
=======
    public Patologia creaPatologia(String nome, List lf)
    {
        return new Patologia(nome, lf);

    }

    public Farmaco creaFarmaco(String nome, float dmin, float dmax)
    {
        return new Farmaco(nome,dmin,dmax); 
>>>>>>> 068026310ecb3dd37cd06599b852e87e9f078f74

    }

   
    
}
