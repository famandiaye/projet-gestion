import javax.swing.JOptionPane;

public class Test {

    public static void main(String[] args) {
        // Création d'un administrateur
        Administrateur monsieur = new Administrateur("Monsieur", "Ndiaye", 123456789, null);

        // Afficher les informations de l'administrateur
        JOptionPane.showMessageDialog(null, "Informations de l'administrateur :");
        JOptionPane.showMessageDialog(null, "Nom : " + monsieur.getNom());
        JOptionPane.showMessageDialog(null, "Prénom : " + monsieur.getPrenom());
        JOptionPane.showMessageDialog(null, "Email : " + monsieur.getEmail());

        // Création d'un nouvel étudiant
        Etudiant etudiant = new Etudiant(2002, "Ndiaye", "Khadidiattou", 783628332, "khadi.ndiaye@gmail.com");

        // Afficher les informations de l'étudiant
        JOptionPane.showMessageDialog(null, "Informations de l'étudiant :");
        JOptionPane.showMessageDialog(null, "Nom : " + etudiant.getNom());
        JOptionPane.showMessageDialog(null, "Prénom : " + etudiant.getPrenom());
        JOptionPane.showMessageDialog(null, "Date de naissance : " + etudiant.getDatenais());
        JOptionPane.showMessageDialog(null, "Téléphone : " + etudiant.getTelephone());
        JOptionPane.showMessageDialog(null, "Email : " + etudiant.getEmail());
        
        // Modification d'un étudiant
        etudiant.modifierEtudiant("Fama", "Ndiaye", 987654321, "fama.ndiaye@gmail.com");

        // Afficher les nouvelles informations de l'étudiant
        JOptionPane.showMessageDialog(null, "Nouvelles informations de l'étudiant :");
        JOptionPane.showMessageDialog(null, "Nom : " + etudiant.getNom());
        JOptionPane.showMessageDialog(null, "Prénom : " + etudiant.getPrenom());
        JOptionPane.showMessageDialog(null, "Date de naissance : " + etudiant.getDatenais());
        JOptionPane.showMessageDialog(null, "Téléphone : " + etudiant.getTelephone());
        JOptionPane.showMessageDialog(null, "Email : " + etudiant.getEmail());

        // Création de cours
        JOptionPane.showMessageDialog(null, "Création de cours :");
        monsieur.creerCours("Mathématiques", "Cours  de mathématiques");

      

        // Suppression d'un cours
        JOptionPane.showMessageDialog(null, "Suppression du cours de Mathématiques :");
        monsieur.supprimerCours("Mathématiques");

        

        // Consultation des notes de l'étudiant
        JOptionPane.showMessageDialog(null, "Consultation des notes de l'étudiant :");
        etudiant.consulterNotes();
    }
}
