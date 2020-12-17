package models.commercial;

import models.commercial.Commercial;

public class Representant extends Commercial {

    public Representant(String prenom, int age, String date, double chiffreAffaire) {
        super(prenom, age, date, chiffreAffaire);
    }

    @Override
    public double calculerSalaire() {
        return chiffreAffaire * 0.30;
    }

}
