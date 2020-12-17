import models.Personnel;
import models.commercial.Vendeur;
import models.manutentionnaire.ManutARisque;
import models.manutentionnaire.Manutentionnaire;
import models.technicien.Technicien;

public class Main {

    public static void main(String[] args) {

        Personnel personnel = new Personnel();
        personnel.ajouterEmploye(new Vendeur("toto", 42, "ddd", 30000));
        personnel.ajouterEmploye(new Manutentionnaire("titi", 42, "ddd", 30));
        personnel.ajouterEmploye(new ManutARisque("tata", 42, "ddd", 30));
        personnel.ajouterEmploye(new Technicien("tutu", 42, "ddd", 250));
        System.out.println(personnel.salaireMoyen());
        personnel.afficherSalaires();


    }

}
