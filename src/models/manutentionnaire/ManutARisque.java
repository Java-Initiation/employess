package models.manutentionnaire;

import interfaces.ARisque;

public class ManutARisque extends Manutentionnaire implements ARisque {

    public ManutARisque(String prenom, int age, String date, int heures) {
        super(prenom, age, date, heures);
    }

    @Override
    public double calculerSalaire() {
        return super.calculerSalaire() + PRIME;
    }

}
