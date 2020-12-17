package models.technicien;

import models.Employe;

public class Technicien extends Employe {

    protected int unites;

    public Technicien(String prenom, int age, String date, int unites) {
        super(prenom, age, date);
        this.unites = unites;
    }

    @Override
    public double calculerSalaire() {
        return unites * 3;
    }

}
