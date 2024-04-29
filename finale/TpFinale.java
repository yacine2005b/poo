/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp.finale;

/**
 *
 * @author yybou
 */
public class TpFinale {

    public static void main(String[] args) {
       UC uc = new UC(3.2, 8, 100);
        Clavier clavier = new Clavier(1, "Clavier1", 102, 5); 
        Moniteur moniteur = new Moniteur(2, "Moniteur1", 2, 18, 1700); 

        PC pc0 = new PC(uc, clavier, moniteur);
        try {
            double consommation = pc0.calConsoElec(5);
            System.out.println("La consommation electrique pour Pc0 est de : " + consommation + " W.");
        } catch ( CException e) {
            System.out.println("Erreur: " + e.getMessage());
        }
    }
    
}
