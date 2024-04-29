/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.finale;

/**
 *
 * @author yybou
 */
public class Clavier extends Peripherique {
    int NbTouches;
    double puissance;

    public Clavier(int id, String modele, int NbTouches, double puissance) {
        super(id, modele);
        this.NbTouches = NbTouches;
        this.puissance = puissance;
    }

    @Override
    public double calculerPuissance() {
        return puissance;
    }
}