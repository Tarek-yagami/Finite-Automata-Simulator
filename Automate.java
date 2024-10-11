import java.util.Arrays;
public class Automate {
    private String[] Etats;           // Etats
    private String Etat_Initiale;     // Etat Initiale
    private String[] Etat_Final;      // Etat Final
    private String[][] Transition;    // Table de transition
    private String Alphabet;          // Alphabet 
    
    // Constructor to initialize the Automate with different configurations
    public Automate(String[] Etats, String Etat_Initiale, String[] Etat_Final, String[][] Transition, String Alphabet) {
        this.Etats = Etats;
        this.Etat_Initiale = Etat_Initiale;
        this.Etat_Final = Etat_Final;
        this.Transition = Transition;
        this.Alphabet = Alphabet;
    }
    public String EtatSuivant(String etat,char c){
        
        return Transition[Arrays.asList(Etats).indexOf(etat)][Alphabet.indexOf(c)];
    }
    public boolean isAccepted(String input) {
        String EtatCourant = Etat_Initiale; // État initial

        for (char c : input.toCharArray()) {
            EtatCourant = EtatSuivant(EtatCourant, c);
        }
        // Accepter si nous terminons dans un etat final
        return Arrays.asList(Etat_Final).contains(EtatCourant);
    }
     

}
