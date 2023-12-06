public class Cuillere extends Ustensile {
   public double longueur;
   public Cuillere(){super();}
    public Cuillere(int annfab, double longueur) {
        super(annfab);
        this.longueur=longueur;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }
    public String toString(){

        return "le longuenr est : "+this.longueur+"l'année de fabrication est : "+super.getAnnfab();
    }

    @Override
    public double calulervaleur(int annee_actuel) {
        return super.calulervaleur(annee_actuel);
    }
}