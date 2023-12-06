public class Main {


public static void main(String[] args) {
    Ustensile[] us = new Ustensile[5];
    us[0] = new AssietteRonde(1926, 8.4);
    us[1] = new Cuillere(1881, 7.3);
    us[2] = new AssietteCarree(1935, 5.6);
    us[3] = new Cuillere(1917, 8.8);
    us[4] = new AssietteRonde(1837, 5.4);


    Cuillere c1 = new Cuillere(1943, 9.0);
    AssietteCarree a1 = new AssietteCarree(1943, 10.0);
    AssietteRonde a2 = new AssietteRonde(1943, 15.0);
    System.out.println(c1);
    System.out.println(a1);
    System.out.println(a2);
    System.out.println(c1.calulervaleur(2023));
    System.out.println(a2.calulervaleur(2023));
    System.out.println(a1.calulervaleur(2023));
    afficherCuillere(us);
    afficherSurafaceAssiette(us);
    afficherValeurTotale(us);

}


        static void afficherCuillere(Ustensile[] us){
            int nbCuillere=0;
            for(int i =0;i<us.length;i++){
                if(us[i] instanceof Cuillere){
                    nbCuillere++;
                }
            }
        System.out.println("Il y a "+ nbCuillere+" cuillères");
    }
static void afficherSurafaceAssiette(Ustensile[] us){
            double somme=0;
            for(int i=0;i< us.length;i++){
                if(us[i] instanceof Assiette){
                    somme=somme+((Assiette)us[i]).calculerSurface();
                }
                System.out.println("Surface totale des assietes: "+somme);
            }
    }


static void afficherValeurTotale(Ustensile[] us){
    double somme=0;
    for(int i=0;i< us.length;i++){
        somme=somme+us[i].calulervaleur(2023);
    }
    System.out.println("valeur totale de la collection: "+somme);
}
}