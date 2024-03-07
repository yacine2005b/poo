
package exo2;
public class Exo2 {

  
   public class TestEtudiant {
    public static void main(String[] arg) {
        Etudiant etud1 = new Etudiant("Ahmed");//error there is no matricule
        Etudiant etud1 = new Etudiant(); //no parameterless constructor defined
        Etudiant etud1 = new Etudiant(0299,"Ahmed"); // the number must not start with 0
        etud1.specialité="Informatique";
        Etudiant etud2 = new Etudiant(0288,"Ali","Math"); // the number must not start with 0
        etud2.specialité=etud1.specialité;
        System.out.println(etud1.nom+" "+etud1.specialité); //  displays "Ahmed Informatique"
        System.out.println(etud2.nom+" "+etud2.specialité); // displays "Ali Informatique"
        etud1=etud2;
        etud2.nom="Amel";
        System.out.println(etud1.nom+" "+etud1.spécialité); // displays "Amel Informatique"
    }
}

    
}
