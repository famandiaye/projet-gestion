import java.util.Scanner;

public class Etudiant extends Utilisateurs {

    private int datenais;
    private double[] notes;

    // Constructeur
    public Etudiant(int datenais, String nom, String prenom, int tel, String email) {
        super(nom, prenom, tel, email);
        this.datenais = datenais;
        this.notes = new double[5];
    }

    public void setNom(String nouveauNom) {
        this.nom = nouveauNom;
    }
    
    public void setPrenom(String nouveauPrenom) {
        this.prenom = nouveauPrenom;
    }
    
    public void setTelephone(int nouveauTelephone) {
        this.tel = nouveauTelephone;
    }
    
    public void setEmail(String nouvelleEmail) {
        this.email = nouvelleEmail;
    }
    

    // Création d'un compte
    public void creeCompte() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nom de l'étudiant :");
        nom = sc.next();
        System.out.println("Prénom de l'étudiant :");
        prenom = sc.next();
        System.out.println("Date de naissance de l'étudiant :");
        datenais = sc.nextInt();
        System.out.println("Numéro de téléphone de l'étudiant :");
        tel = sc.nextInt();
        System.out.println("Email de l'étudiant :");
        email = sc.next();
    }

    // Modification d'un étudiant
    public void modifierEtudiant(String nouveauNom, String nouveauPrenom, int nouveauTelephone, String nouvelleEmail) {
        
        Etudiant etudiant = rechercherEtudiantParNom(nom);
        

        // Vérifier si l'étudiant a été trouvé
        if (etudiant != null) {
            etudiant.setNom(nouveauNom);
            etudiant.setPrenom(nouveauPrenom);
            etudiant.setTelephone(nouveauTelephone);
            etudiant.setEmail(nouvelleEmail);

            
            mettreAJourEtudiant(etudiant);
        } else {
            
            System.out.println("Étudiant non trouvé.");
        }
    }

    // Mettre à jour l'étudiant
    private void mettreAJourEtudiant(Etudiant etudiant) {
        
    }

    // Rechercher un étudiant par son nom
    private Etudiant rechercherEtudiantParNom(String nom) {
        
        return null;
    }

    // Consulter les notes
    public void consulterNotes() {
        for (int i = 0; i < notes.length; i++) {
            System.out.println("afficher les notes");
        }
    }

    public static Etudiant ajouterEtudiant() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ajouterEtudiant'");
    }

    public String getNom() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNom'");
    }

    public String getDatenais() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDatenais'");
    }

    public String getTelephone() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTelephone'");
    }

    public String getEmail() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEmail'");
    }

    public String getPrenom() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPrenom'");
    }
}
