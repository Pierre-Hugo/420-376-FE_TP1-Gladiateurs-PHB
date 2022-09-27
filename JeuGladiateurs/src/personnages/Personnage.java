package personnages;

import java.util.Random;

public class Personnage {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    public String nom;
    public int  pointsDeVie;
    public int valeurMaxAttaque;
    public int valeurDefense;
    public int initiative;
    public int valeurDeFrappe;
    public int Dommages;
    

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Constructeurs et initialisation">
    public Personnage(String nom, int attaqueMax, int defense, int pvs, int ini) {
        this.nom = nom;
        this.pointsDeVie = pvs;
        this.valeurMaxAttaque = attaqueMax;
        this.valeurDefense = defense;
        this.initiative = ini;
        
    }

    public Personnage() {
        this.nom = "";
        this.pointsDeVie = 0;
        this.valeurMaxAttaque = 0;
        this.valeurDefense = 0;
        this.initiative = 0;
        this.valeurDeFrappe = 0;
        this.Dommages = 0;
    }
    // </editor-fold>
    public String getNom() {
        return nom;
        // TODO : Afficher les infos du personnage, tel que montré dans l'énoncé
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public int getValeurMaxAttaque() {
        return valeurMaxAttaque;
    }

    public int getValeurDefense() {
        return valeurDefense;
    }

    public int getValeurDeFrappe() {
        return valeurDeFrappe;
    }

    
    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Getters et setters">
    public int getInitiative() {    
        return initiative;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    public void setValeurMaxAttaque(int valeurMaxAttaque) {
        this.valeurMaxAttaque = valeurMaxAttaque;
    }

    public void setValeurDefense(int valeurDefense) {
        this.valeurDefense = valeurDefense;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    public void setValeurDeFrappe(int valeurDeFrappe) {
        this.valeurDeFrappe = valeurDeFrappe;
    }

    
    // </editor-fold>
    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Mécanique de jeu">
    public void afficherInfosPersonnage() {
        System.out.println("");
        System.out.println("Nom : " + nom);
        System.out.println("Attaque : " + valeurMaxAttaque);
        System.out.println("Defense : " + valeurDefense);
        System.out.println("Point de vie : " + pointsDeVie);
        System.out.println("Initiative : " + initiative);
        System.out.print("Statut : ");
        if (pointsDeVie>0) System.out.println("Vivant");
        else System.out.println("Mort");
    }

    private int attaqueCalcul() {
        Random rand = new Random();
        int minValue = 0;
        int maxValue = valeurMaxAttaque;   
        int nombreAleatoire = rand.nextInt(maxValue - minValue) + minValue;
        return nombreAleatoire;
    }

    public void frapperPersonnage(Personnage personnageCible) {
        valeurDeFrappe = attaqueCalcul();
        Dommages = valeurDeFrappe - personnageCible.getValeurDefense();
        Dommages = Dommages >= 0 ? Dommages : 0;
        personnageCible.setPointsDeVie(personnageCible.getPointsDeVie()- Dommages);
        if (personnageCible.getPointsDeVie() <= 0) {
            personnageCible.setPointsDeVie(0);
        }
        System.out.println("");
        System.out.println(nom + " attaque avec avec une puissance de " + valeurDeFrappe);
        System.out.println(personnageCible.getNom() + " a une defense de " + personnageCible.getValeurDefense());
        System.out.println("Les dommages sont donc de " + Dommages);
    }

    public void setNewInitiativeRandom() {
        Random rand = new Random();
        int minValue = 0;
        int maxValue = 100;   
        int nombreAleatoire = rand.nextInt(maxValue - minValue) + minValue;
        setInitiative(nombreAleatoire);
    }
    // </editor-fold>
}
