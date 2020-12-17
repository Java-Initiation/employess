package models;

public abstract class Employe {

    protected String prenom;
    protected int age;
    protected String date;

    public Employe(String prenom, int age, String date) {
        this.prenom = prenom;
        this.age = age;
        this.date = date;
    }

    public abstract double calculerSalaire();

}
