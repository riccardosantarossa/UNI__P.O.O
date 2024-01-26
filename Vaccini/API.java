import java.util.ArrayList;

public class API
{
    public static void main(String[] args) {
        ObjFactory f = new ObjFactory();
        RegistroVaccinazioni registro = f.creaRegistro();
        Paziente p1 = f.creaUnPaziente("Giovanni", "Rossi", 57);
        registro.AggiungiPaziente(p1);
        Patologia pat1 = f.creaPatologia("EpatiteC",new ArrayList<Farmaco>());
        pat1.AggiungiFarmaco(f.creaFarmaco("FarmacoEpatiteC", 1, 4));
        try {
            p1.getLibretto().vaccinazioniEffettuate.add(f.creaUnaVaccinazione(pat1,"2013", p1));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }

}