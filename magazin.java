public class magazin {
    int identifiant;
    String adresse;
    int capacite;


    public magazin(int identifiant, String adresse, int capacite ){
        this.identifiant=identifiant;
        this.adresse=adresse;
        this.capacite=capacite;

    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getCapacite() {
        return capacite;
    }


    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }
    public void Afficher(){
        System.out.println("identifiant: " + identifiant + " Adresse: " + adresse + " Capacité: "+ capacite);
    }


}
