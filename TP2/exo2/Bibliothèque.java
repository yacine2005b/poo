public class Bibliothèque {
    private Document[] documents;

    // Constructeur pour créer un tableau de documents
    public Bibliothèque(int tailleMaximale) {
        documents = new Document[tailleMaximale];
    }

    // Méthode pour ajouter un document à la bibliothèque
    public void ajouter(Document d) {
        for (int i = 0; i < documents.length; i++) {
            if (documents[i] == null) {
                documents[i] = d;
                break;
            }
        }
    }

    // Méthode pour afficher le contenu de la bibliothèque
    public void listing() {
        System.out.println("Contenu de la bibliothèque :");
        for (Document d : documents) {
            if (d != null) {
                d.affiche();
                System.out.println();
            }
        }
    }
}