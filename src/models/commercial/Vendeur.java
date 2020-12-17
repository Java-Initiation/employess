package models.commercial;

import models.commercial.Commercial;

public class Vendeur extends Commercial {

    public Vendeur(String prenom, int age, String date, double chiffreAffaire) {
        super(prenom, age, date, chiffreAffaire);
    }

    @Override
    public double calculerSalaire() {
        return chiffreAffaire * 0.10;
    }

}
