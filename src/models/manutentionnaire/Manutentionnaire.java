package models.manutentionnaire;

import models.Employe;

public class Manutentionnaire extends Employe {

    protected int heures;

    public Manutentionnaire(String prenom, int age, String date, int heures) {
        super(prenom, age, date);
        this.heures = heures;
    }

    @Override
    public double calculerSalaire() {
        return heures * 10;
    }

}
