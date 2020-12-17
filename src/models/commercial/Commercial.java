package models.commercial;

import models.Employe;

public abstract class Commercial extends Employe {

    protected double chiffreAffaire;

    public Commercial(String prenom, int age, String date, double chiffreAffaire) {
        super(prenom, age, date);
        this.chiffreAffaire = chiffreAffaire;
    }

}
