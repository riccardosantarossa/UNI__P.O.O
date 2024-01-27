
public class Regola
{

    /*
     * Classe che rappresenta le regole di idoneità per le vaccinazioni
     * COn i metodi di questa classe si controlla se una vaccinazione è fattibile
     * ovvero se rispetta i vincoli di età, compatibilità e intervallo di copertura
     * offerti dal farmaco che si intende utilizzare per la vaccinazione
     */

    /*
     * Metodo che controlla dell'età del paziente permette di utilizzare un 
     * determinato farmaco per una vaccinazione
     * @param p: paziente di cui si vuole controllare l'età
     * @param f: farmaco che si vuole utilizzare per la vaccinazione
     * @return vero se il paziente ha un'età in linea con quella minima del farmaco, falso altrimenti
     */
    public boolean etaFarmaco(Paziente p, Farmaco f)
    {
      return (p.getEta() > f.getEtaMinima());      
    }
    
    /*
     * Metodo che controlla se il farmaco che si intende utilizzare
     * è compatibile con tutti gli altri farmaci che sono stati somministrati
     * al paziente in vaccinazioni passate
     * @param p: paziente di cui si vogliono conoscere i farmaci utilizzati nel passato
     * @param f: farmaco di cui si vuole controllare la compatibilità
     * @return vero se al paziente non sono stati somministrati farmaci incompatibili con f, falso altrimenti
     */
    public boolean controllaCompatibilita(Paziente p, Farmaco f)
    { 

        for(Vaccinazione v : p.getLibretto().getVaccinazioniEffettuate())
        {
            for(Farmaco farm : f.getCompatibilità())
            {
                if (v.getFarmacoUsato().equals(farm)) 
                    return false;    
            }
        }

        return true;
        
    }

    /*
     * Metodo che controlla se il paziente possiede ancora, o meno, una copertura
     * farmacologica per un determinato farmaco
     * @param p: paziente sul quale si vuole effettuare il controllo
     * @param f: farmaco di cui si vuole controllare la copertura
     */
    public boolean controllaIntervallo(Paziente p, Farmaco f)
    {
        //TODO
       // p.getLibretto().vaccinazioniEffettuate.stream().filter()
       return true;
        

    }

}
