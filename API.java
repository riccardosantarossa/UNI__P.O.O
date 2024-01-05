import java.util.ArrayList;
import java.util.List;

public class API 
{
    
    public static void main(String[] args) 
    {
        ObjFactory f = new ObjFactory();
        
        //Creazione degli studenti
        Studente s1 = f.creaStudente(001, "Giovanni", "Rossi");
        Studente s2 = f.creaStudente(002, "Antonio", "Calabro");

       //System.out.format("STUDENTE 1: \nMatricola: %d \n Nome: %s \n Cognome: %s \n", s1.getNumMatricola(), s1.getNome(), s1.getCognome());
       //System.out.format("STUDENTE 2: \nMatricola: %d \n Nome: %s \n Cognome: %s \n", s2.getNumMatricola(), s2.getNome(), s2.getCognome());
    
       //Creazione di un corso con prerequisiti
       List<Corso> preLogica = new ArrayList<Corso>();
       Corso anaMat = f.creaCorso("Analisi matematica", null, 12);
       Corso matDis = f.creaCorso("Matematica discreta", null, 12);
       preLogica.add(anaMat);
       preLogica.add(matDis);
       Corso logMat = f.creaCorso("Logica", preLogica, 6);

       //Iscrizione degli studenti ai corsi
       Carriera carGio = s1.getCarr();
       try 
       {
        carGio.aggiungiIscrizione(anaMat);
        carGio.aggiungiIscrizione(matDis);
        carGio.aggiungiIscrizione(logMat);
       } 
       catch (Exception e) {e.printStackTrace();}

       try 
       {
        carGio.aggiungiCorsoSuperato(anaMat);
        carGio.aggiungiCorsoSuperato(matDis);
       } 
       catch (Exception e) {e.printStackTrace();}
    
       s1.setCarr(carGio);

       //Creazione di un appello
       Appello esameLogica = f.creaAppello(logMat, "17/02/2024", tipoAppello.presenza, tipoProva.finale);
       esameLogica.iscrivi(s1, esameLogica);

    }


}
