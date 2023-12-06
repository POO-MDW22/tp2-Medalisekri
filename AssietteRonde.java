public class AssietteRonde extends Assiette {
    private double rayon;
    public AssietteRonde(int annfab,double rayon){
        super(annfab);
        this.rayon=rayon;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }
    @Override
    public String toString() {
        return "AssietteCarree{" +
                "rayon=" + rayon+
                '}'+"l'année de fabrication est : "+this.getAnnfab();

    }


    /*public double calulervaleur(int annee_actuel) {
        return super.calulervaleur(annee_actuel);
    }*/

    @Override
    public double calculerSurface() {
        double r2=3.14*this.getRayon()*this.getRayon();
        return r2;
    }
}
