public class Internet extends Document {
     String url;

    // Constructeur avec paramètre pour initialiser l'URL
    public Internet(String titre, String url) {
        super(titre);
        this.url = url;
    }

    // Redéfinition de la méthode affiche pour afficher l'URL
    @Override
    public void affiche() {
        super.affiche();
        System.out.println("URL: " + url);
    }
}
