package fr.dampierre;

import java.util.Random;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int emplacement = 0;
        int resteCase = 20;
        int nbPartie = 1;
        int i = 0;
        System.out.println("Partie 1");
        while (emplacement != 20) {
        scanner.nextLine();
        Random generateur = new Random();
        int lancer = generateur.nextInt(6) + 1;
        emplacement = lancer+emplacement;
        i++;
        if (resteCase - emplacement >0) {
            System.out.println("Lancer "+(i)+" : vous avez faits "+lancer+". Vous êtes sur la case "+emplacement+" (encore "+(20-emplacement)+")");
        }
        else if (resteCase-emplacement==0) {
            System.out.println("Lancer "+(i)+" : vous avez faits "+lancer+". Vous êtes sur la case "+emplacement+" !");
        }
        else{
            System.out.println("Lancer "+(i)+" : vous avez faits "+lancer+". Vous êtes sur la case "+emplacement+" (vous avez dépassé de "+(Math.abs(20-emplacement))+" case donc vous retourner sur la case "+(20-(Math.abs(20-emplacement)))+")");
            emplacement = 20-(Math.abs(20-emplacement));
        }
        }
         
        System.out.println("Vous avez gangner, vous avez jouer "+nbPartie+" partie");
    }
    
}
