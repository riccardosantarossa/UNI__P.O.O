import java.util.ArrayList;

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
    public void setCarr(Carriera carr) { this.carr = carr;}
    
    //Matricola
    public int getNumMatricola() {return this.numMatricola;}
    public void setNumMatricola(int numMatricola) {this.numMatricola = numMatricola;}

    //Nome
    public String getNome() {return this.nome;}
    public void setNome(String nome) {this.nome = nome;}

    //Cognome
    public String getCognome() {return this.cognome;}
    public void setCognome(String cognome) {this.cognome = cognome;}

    /*
     * Crea un'istanza di studente e contemporaneamente valida i dati
     * @param nM : numero di matricola, INTERO
     * @param n : nome dello studente, STRINGA
     * @param cn : cognome dello studente, STRINGA
     */
    public Studente(int nM, String n, String cn)
    {
        if(nM > 0)
            this.numMatricola = nM;
        else
            throw new IllegalArgumentException("Numero di matricola inserito NON VALIDO");

        if(n.isEmpty() || cn.isEmpty())
            throw new IllegalArgumentException("Inserire un nome e un cognome NON VUOTI");
        else
        {
            this.nome = n;
            this.cognome = cn;
        }

        this.carr = new Carriera();
    }
}