import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Administrateur extends Utilisateurs {

     private List<Cours> listeCours;
    private String motDePasse;


    public Administrateur(String nom, String prenom, int tel,String email) {
        super(nom, prenom, tel, email);
        this.listeCours = new ArrayList<>();

    }

    public String getNomUtilisateur() {
        return nom;
    }
    
    public void setNomUtilisateur(String nomUtilisateur) {
        this.nom = nomUtilisateur;
    }
    
    public String getMotDePasse() {
        return motDePasse;
    }
    
    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    //authentification administrateurs
    public void creeCompte() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nom de l'administrateurs :");
        nom = sc.next();
        System.out.println("Prénom de l'administrateurs :");
        prenom = sc.next();
        System.out.println("email de l'administrateurs :");
        prenom = sc.next();
        
    }


    // Méthode pour ajouter un nouvel étudiant
    public void ajouterEtudiant() {
        Etudiant nouvelEtudiant = Etudiant.ajouterEtudiant();
    }

    // Méthode pour supprimer un étudiant
    public void supprimerEtudiant(String nomEtudiant) {
        Etudiant etudiantASupprimer = rechercherEtudiantParNom(nomEtudiant);

        if (etudiantASupprimer != null) {
            System.out.println("L'étudiant a été supprimé.");
        } else {
            System.out.println("L'étudiant n'a pas été trouvé.");
        }
    }

    // Méthode pour rechercher un étudiant par nom
    private Etudiant rechercherEtudiantParNom(String nomEtudiant) {
        
        return null;
    }


    public void creerCours(String nom, String description) {
        Cours nouveauCours = new Cours(nom, description);
        listeCours.add(nouveauCours);
        System.out.println("le cours a ete cree cree");
    }

    // Méthode pour modifier un cours
    public static void modifierCours(Cours cours, String nouveauNom, String nouvelleDescription) {
        if (cours != null) {
            cours.setNom(nouveauNom);
            cours.setDescription(nouvelleDescription);
            System.out.println("Le cours a été modifié.");
        } else {
            System.out.println("Le cours n'existe pas.");
        }
    }

    public static String getPrenom() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPrenom'");
    }

    public static String getEmail() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEmail'");
    }

    public static Cours rechercherCoursParNom(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'rechercherCoursParNom'");
    }

    public void supprimerCours(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'supprimerCours'");
    }

    public String getNom() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNom'");
    }
}
