
public class Studente
{

    /*
     * Rappresenta l'anagragfica dello studente
     * e la sua carriera universitaria
     */

    private int numMatricola;
    private String nome, cognome;
    private Carriera carr;

    //Metodi get e set CON CONTROLLI SULL'INPUT

    //Carriera
    public Carriera getCarr() {return this.carr;}
    public void setCarr(Carriera carr) throws Exception
    {
        if(carr != null) 
            this.carr = carr;
        else
            throw new Exception("Inserito argomento nullo");
    }
    
    //Matricola
    public int getNumMatricola() {return this.numMatricola;}
    public void setNumMatricola(int numMatricola) throws Exception
    {
        if(numMatricola > 0)
            this.numMatricola = numMatricola;
        else
            throw new Exception("Numero di matricola inserito NON VALIDO");
    }

    //Nome
    public String getNome() {return this.nome;}
    public void setNome(String nome) throws Exception
    {
        if(nome != "")
            this.nome = nome;
        else
            throw new Exception("Inserire un nome NON VUOTO");
    }

    //Cognome
    public String getCognome() {return this.cognome;}
    public void setCognome(String cognome) throws Exception
    {
         if(cognome != "")
            this.cognome = cognome;
        else
            throw new Exception("Inserire un cognome NON VUOTO");
    }
}