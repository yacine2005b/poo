public class Document {
    String titre;
    static int nombreDeDocuments = 0;

    // Constructeur par défaut
    public Document() {
        nombreDeDocuments++;
    }

    // Constructeur avec un paramètre pour initialiser les attributs
    public Document(String titre) {
        this.titre = titre;
        nombreDeDocuments++;
    }

    // Méthode pour afficher les détails du document
    public void affiche() {
        System.out.println("Titre: " + titre);
    }

    // Getter pour le nombre de documents créés
    public static int getNombreDeDocuments() {
        return nombreDeDocuments;
    }
}