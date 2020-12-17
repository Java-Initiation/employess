package models;

import models.commercial.Vendeur;
import models.technicien.Technicien;

import java.util.ArrayList;

public class Personnel {

    private Employe[] staff;
    private int nbreEmployes;
    private final int MAX_EMPLOYE = 5;

    public Personnel() {
        staff = new Employe[MAX_EMPLOYE];
    }

    public void ajouterEmploye(Employe employe){
        if (nbreEmployes < MAX_EMPLOYE){
            staff[nbreEmployes] = employe;
            nbreEmployes++;
        }
        else {
            System.out.println("Il n'y a plus de place pour un nouvel employé");
        }
    }

    public double salaireMoyen(){
        double salaireTotal = 0;
        if (nbreEmployes != 0){
            for (int i = 0; i < nbreEmployes; i++) {
                salaireTotal += staff[i].calculerSalaire();
            }
            return salaireTotal / nbreEmployes;
        }
        else
            return 0;
    }

    public void afficherSalaires(){
        for (int i = 0; i < nbreEmployes; i++) {
            Employe employe = staff[i];
            System.out.println("Salaire de " + employe.prenom + " : " + employe.calculerSalaire());
        }
    }

}
