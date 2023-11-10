public class produit {
    String nom;
    int prix;
    public produit(String nom,int prix){
        this.nom=nom;
        this.prix=prix;
    }

    public int getPrix() {
        return prix;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }
    public void Afficher(){
        System.out.println("Nom: " + nom + " Prix: " + prix);
    }
}
