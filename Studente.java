
public class Studente
{

    /*
     * Rappresenta l'anagragfica dello studente
     * e la sua carriera universitaria
     */

    private int numMatricola;
    private String nome, cognome;
    private Carriera carr;

    //Metodi get e set 

    //Carriera
    public Carriera getCarr() {return this.carr;}
    public void setCarr(Carriera carr) {this.carr = carr;}
    
    //Matricola
    public int getNumMatricola() {return this.numMatricola;}
    public void setNumMatricola(int numMatricola) {this.numMatricola = numMatricola;}

    //Nome
    public String getNome() {return this.nome;}
    public void setNome(String nome) {this.nome = nome;}

    //Cognome
    public String getCognome() {return this.cognome;}
    public void setCognome(String cognome) {this.cognome = cognome;}
}