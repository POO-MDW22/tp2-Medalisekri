import java.util.Scanner;
public class EssaiException {
    public static void main(String[] args) {
        int a, b, res;
        Scanner clavier = new Scanner(System.in);
        a = clavier.nextInt(); b = clavier.nextInt();
        try {
            res = a / b;
            System.out.println("le résultat de " + a + " divisé par " + b + " est " + res);
        }
        catch (ArithmeticException e){
            System.out.println("oop! un problème dans la division");
           System.out.println("le message officiel est "+e.getMessage());
        }
       finally {


            System.out.println("le bloc finally sera toujours exécuté");
            System.out.println("et c'est lå que lion fermera par exemple les fichiers");
        }
        System.out.println ("Fin du programme");}}
