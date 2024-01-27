import java.util.ArrayList;

public class API
{
    public static void main(String[] args) {
        ObjFactory f = new ObjFactory();
        RegistroVaccinazioni registro = f.creaRegistro();
        Paziente p1 = f.creaUnPaziente("Giovanni", "Rossi", 57);
        registro.AggiungiPaziente(p1);
<<<<<<< HEAD
        Patologia pat1 = f.creaPatologia("EpatiteC");
        pat1.AggiungiFarmaco(f.creaFarmaco("FarmacoEpatiteC", 1, 4,pat1,3,10));
        try {
            p1.getLibretto().vaccinazioniEffettuate.add(f.creaUnaVaccinazione(pat1,2003, p1));
=======
        Patologia pat1 = f.creaPatologia("EpatiteC",new ArrayList<Farmaco>());
        pat1.AggiungiFarmaco(f.creaFarmaco("FarmacoEpatiteC", 1, 4));
        try {
            p1.getLibretto().vaccinazioniEffettuate.add(f.creaUnaVaccinazione(pat1,"2013", p1));
>>>>>>> 068026310ecb3dd37cd06599b852e87e9f078f74
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
<<<<<<< HEAD
        registro.elencaPersoneVaccinate();
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println(registro.copertura("Giovanni","Rossi","EpatiteC"));
=======


>>>>>>> 068026310ecb3dd37cd06599b852e87e9f078f74
    }

}