public class Main {
    public static void main(String[] args){
        produit p1=new produit("Clavier sans fil",60);
        produit p2=new produit("Ordinateur Portable",1400);
        produit p3=new produit("Souris sans fil",40);
        magazin m1=new magazin(1,"19 rue de tunis",500);
       p1.Afficher();
       p2.Afficher();
       p3.Afficher();
       m1.Afficher();
    }
}