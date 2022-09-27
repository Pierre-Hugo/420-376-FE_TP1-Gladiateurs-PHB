/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personnages;

import java.util.Random;

/**
 *
 * @author ETI
 */
public class Mirmillon extends Personnage {
    public String classe;
    
    public Mirmillon (String nom, int attaqueMax, int defense, int pvs, int ini){
        this.nom = nom;
        this.pointsDeVie = pvs;
        this.valeurMaxAttaque = attaqueMax;
        this.valeurDefense = defense;
        this.initiative = ini;
        this.classe = "Mirmillon";
    }
    
    @Override
    public void afficherInfosPersonnage(){
        super.afficherInfosPersonnage();
        System.out.println("Classe : " + classe);
    }
    
    @Override
    public void setNewInitiativeRandom() {
        Random rand = new Random();
        int minValue = 0;
        int maxValue = 30;   
        int nombreAleatoire = rand.nextInt(maxValue - minValue) + minValue;
        setInitiative(nombreAleatoire);
    }
    
    @Override
    public void frapperPersonnage(Personnage personnageCible){
        super.frapperPersonnage(personnageCible);
        if (personnageCible.getPointsDeVie() <= 0) {
            System.out.println(this.getNom() + " decapite " + personnageCible.getNom());
        }
        else {
            System.out.println(this.getNom() + " attaque a nouveau " + personnageCible.getNom());
            super.frapperPersonnage(personnageCible);
        }
    }
}