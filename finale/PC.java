/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.finale;

/**
 *
 * @author yybou
 */
public class PC {
    UC UC;
    Peripherique[] peripheriques;

    public PC(UC UC, Peripherique... peripheriques) {
        this.UC = UC;
        this.peripheriques = peripheriques;
    }

    public double calculerPuissanceTotale() {
        double puissanceTotale = UC.puissance;
        for (Peripherique p : peripheriques) {
            puissanceTotale += p.calculerPuissance();
        }
        return puissanceTotale;
    }

    public double calConsoElec(double duree) throws  CException {
        double consommation = calculerPuissanceTotale() * duree;
        if (consommation > 1000) {
            throw new  CException("La consommation électrique dépasse 1000");
        }
        return consommation;
    }
}