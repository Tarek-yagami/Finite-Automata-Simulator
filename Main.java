import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] EtatsL2 = {"S0", "S1", "S2", "S3"};
        String Etat_InitialeL2 = "S0";
        String[] Etat_FinalL2 = {"S0","S1","S2"};
        String[][] TransitionL2 = {
            {"S1","S0"}, //S0 0:S1 1:S0
            {"S2","S0"}, //S1 0:S2 1:S0 
            {"S2","S3"}, //S2 0:S2 1:S3
            {"S3","S3"} // S3 
        };
        String AlphabetL2 = "01";
        String[] EtatsL1 = {"PP", "PI", "IP", "II"};
        String [][] TransitionL1 = {
        {"IP","PI"}, //PP 0:IP 1:PI
        {"II","PP"}, //PI 0:II 1:PP
        {"PP","II"}, //IP 0:PP 1:II
        {"PI","IP"}  //II 0:PI 1:IP
        
        };
        String Etat_InitialeL1 = "PP";
        String[] Etat_FinalL1 = {"PI"};
        String AlphabetL1 = "01";
        Scanner scanner = new Scanner(System.in);
        
         // Demander à l'utilisateur de choisir l'automate
        System.out.println("Choisissez l'automate à utiliser : ");
        System.out.println("1. Automate L1");
        System.out.println("2. Automate L2");
        int choix = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Entrez une chaîne de 0 et 1 : ");
        String input = scanner.nextLine();
        // Création d'une instance de l'automate en fonction du choix
        Automate automate;
        if (choix == 1) {
            // Utiliser Automate L1
            automate = new Automate(EtatsL1, Etat_InitialeL1, Etat_FinalL1, TransitionL1, AlphabetL1);
            System.out.println("Vous avez choisi l'Automate L1.");

        } else if (choix == 2) {
            // Utiliser Automate L2
            automate = new Automate(EtatsL2, Etat_InitialeL2, Etat_FinalL2, TransitionL2, AlphabetL2);
            System.out.println("Vous avez choisi l'Automate L2.");
        } else {
            System.out.println("Choix invalide.");
            scanner.close();
            return;
        }

        boolean isAccepted = automate.isAccepted(input);
        System.out.println("La chaîne est " + (isAccepted ? "acceptée." : "non acceptée."));
        scanner.close();
    }
}
