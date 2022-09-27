package combat;

public class CompteurDeTour {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Attributs">
    public int cptrTour;
    // </editor-fold>
    
    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Constructeurs et initialisation">
    public CompteurDeTour() {
        this.cptrTour = 1;
    }
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Getters et setters">
    public int getCptrTour() {    
        return cptrTour;
    }

    public void setCptrTour(int cptrTour) {
        this.cptrTour = cptrTour;
    }

    
    // </editor-fold>
    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Mécanique de jeu">
    public void augmenteTour() {
        cptrTour++;
    }

    public void afficheTour() {
        System.out.println("");
        System.out.println("---------------");
        System.out.println("TOUR ACTUEL : " + cptrTour);
        System.out.println("---------------");

    }
    // </editor-fold>
}
