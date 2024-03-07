public class Etudiant {
    int matricule;
    String nom;
    String spécialité;

    // Constructeur avec deux paramètres pour initialiser le matricule et le nom
    public Etudiant(int m, String n) {
        matricule = m;
        nom = n;
    }

    // Constructeur avec trois paramètres pour initialiser les trois attributs
    public Etudiant(int m, String n, String s) {
        matricule = m;
        nom = n;
        spécialité = s;
    }
}
