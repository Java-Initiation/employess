package models.technicien;

import interfaces.ARisque;

public class TechnARisque extends Technicien implements ARisque {

    public TechnARisque(String prenom, int age, String date, int unites) {
        super(prenom, age, date, unites);
    }

    @Override
    public double calculerSalaire() {
        return super.calculerSalaire() + PRIME;
    }

}
