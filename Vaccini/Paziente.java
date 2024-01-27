

public class Paziente 
{
    /*
     * Classe che rappresenta un paziente che verrà sottoposto
     * ad una o più vaccinazioni
     * La classe contiene le informazione anagrafiche della persona come età, nome e cognome
     * e lo storico delle vaccinazioni a cui la persona è stata sottoposta nel tempo
     * La classe persona contiene anche informazioni sulle patologie di cui la persona
     * soffre, che verranno trattate in maniera differente a seconda della tipologia 
     */

    //Anagrafica
    private String nome;
    private String cognome;
    private int eta;
    private LibrettoVaccinazioni libretto;

    public LibrettoVaccinazioni getLibretto() {
        return this.libretto;
    }

    public void setLibretto(LibrettoVaccinazioni libretto) {
        this.libretto = libretto;
    }

    //Getter e setter
   
    //Età
    public int getEta() {return this.eta;}

    public String getNome() {return this.nome;}
    public String getCognome() {return this.cognome;}


    //Costruttore con controllo dell'input
    public Paziente(String n, String cn, int eta)
    {
        if(n.isEmpty() || cn.isEmpty())
            throw new IllegalArgumentException("Inserire nome e cognome validi");
        else
        {
            this.nome = n;
            this.cognome = cn;
        }
            
        if(eta < 0)
            throw new IllegalArgumentException("Inserire un'età non negativa");
        else
            this.eta = eta;

        this.libretto = new LibrettoVaccinazioni();
        
    }
   

    
}
