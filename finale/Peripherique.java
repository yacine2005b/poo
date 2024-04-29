/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.finale;

/**
 *
 * @author yybou
 */
class Peripherique {
    int id;
    String modele;

    public Peripherique(int id, String modele) {
        this.id = id;
        this.modele = modele;
    }

    public double calculerPuissance() {
        return 0; // Méthode à redéfinir dans les sous-classes
    }
}
