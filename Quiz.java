public class Quiz 
{
    /* 
    * Classe che rappresenta il tipo di esame a risposta chiusa quindi  
    * con un numero di domande fisso e a risposts vera o falsa   
    * Gli esami di questo tipo vengono corretti automaticamente
    * dall'apposito metodo per la correzione
    */    

    private int numeroDomande;

    //METODI GET E SET 

    //Domande
    public int getNumeroDomande() {return this.numeroDomande;}
    public void setNumeroDomande(int numeroDomande) {this.numeroDomande = numeroDomande;}

}

