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
public class Retiaire extends Personnage {
    public String classe;
    public Boolean FiletLance;
    
    public Retiaire (String nom, int attaqueMax, int defense, int pvs, int ini){
        this.nom = nom;
        this.pointsDeVie = pvs;
        this.valeurMaxAttaque = attaqueMax;
        this.valeurDefense = defense;
        this.initiative = ini;
        this.classe = "Retiaire";
        this.FiletLance = false;
    }
    
    @Override
    public void afficherInfosPersonnage(){
        super.afficherInfosPersonnage();
        System.out.println("Classe : " + classe);
    }
    
    @Override
    public void frapperPersonnage(Personnage personnageCible){
        if (FiletLance) {
            FiletLance = false;
            System.out.println(this.getNom() + " recupere sont filet et en profite pour attaquer");
            super.frapperPersonnage(personnageCible);
        }
        else {
            FiletLance = true;
            System.out.println(this.getNom() + " lance sont filet");
            Random rand = new Random();
            int minValue = 0;
            int maxValue = 100;   
            int nombreAleatoire = rand.nextInt(maxValue - minValue) + minValue;
            if (nombreAleatoire <= 10) {
                personnageCible.setPointsDeVie(0);
                System.out.println("Sont filet attrape " + personnageCible.getNom() + " et il l'empale sauvagement");
            }
            else {
                System.out.println("Le filet n'atteint pas sa cible");
            }
        }
    }
}
