

public class API
{
    public static void main(String[] args) {
        ObjFactory f = new ObjFactory();
        RegistroVaccinazioni registro = f.creaRegistro();
        Paziente p1 = f.creaUnPaziente("Giovanni", "Rossi", 57);
        registro.aggiungiPaziente(p1);
        Patologia pat1 = f.creaPatologia("EpatiteC");
        pat1.AggiungiFarmaco(f.creaFarmaco("FarmacoEpatiteC", 1, 4,pat1,3,10));
        try {
            p1.getLibretto().getVaccinazioniEffettuate().add(f.creaUnaVaccinazione(pat1,2003, p1));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        registro.elencaPersoneVaccinate();
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println(registro.copertura("Giovanni","Rossi","EpatiteC"));
    }

}