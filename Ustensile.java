public abstract class  Ustensile {
    private   int annfab;
    public Ustensile(){}
    public Ustensile(int annfab){
        this.annfab=annfab;
    }

    public void setAnnfab(int annfab) {
        this.annfab = annfab;
    }

    public int getAnnfab() {
        return annfab;
    }

    void afficher(){
        System.out.println("annfab: "+annfab);
    }


    public double calulervaleur(int annee_actuel) {
        double age = (annee_actuel - annfab);
        double valf = 0;
        if (age > 50)
            valf = (age - 50);

        return valf;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
