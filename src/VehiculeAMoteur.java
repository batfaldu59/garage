public class VehiculeAMoteur {
    Moteur moteur;
    int vitesse;



    VehiculeAMoteur(Moteur moteur) {
        this.moteur = moteur;

    }

    int accelerer(int vitesse) {
        System.out.println("J'accelere");
        this.vitesse += vitesse;
        return this.vitesse;
    }

    Ville transporter(Passager passager, Ville villdeDepart) {
        System.out.println("Le véhicule transporte un passager qui s'appelle"+passager.prenom+" "+passager.nom);
        Ville villeDestination = new Ville();
        villeDestination.nom = "Tourcoing";
        return villeDestination;
    }
}
