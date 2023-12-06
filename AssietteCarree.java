public class AssietteCarree extends Assiette{
    private double cote;
    public AssietteCarree(int annfab,double cote){
        super(annfab);
       this.cote=cote;
    }

    public double getCote() {
        return cote;
    }

    public void setCote(double cote) {
        this.cote = cote;
    }

    @Override
    public String toString() {
        return "AssietteCarree{" +
                "cote=" + cote +
                '}'+"l'année de fabrication est : "+this.getAnnfab();

    }

    @Override
    public double calulervaleur(int annee_actuel) {
        return super.calulervaleur(annee_actuel)*5;
    }

    @Override
    public double calculerSurface(){
           double r1=this.getCote()*this.getCote();

        return r1;
    }
}
