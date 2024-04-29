/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.finale;

/**
 *
 * @author yybou
 */
public class Moniteur extends Peripherique {
    int classeConsommation;
    int dimension;
    int resolutionMax;

    public Moniteur(int id, String modele, int classeConsommation, int dimension, int resolutionMax) {
        super(id, modele);
        this.classeConsommation = classeConsommation;
        this.dimension = dimension;
        this.resolutionMax = resolutionMax;
    }

    @Override
    public double calculerPuissance() {
        return classeConsommation * dimension + resolutionMax * 0.015;
    }
}
