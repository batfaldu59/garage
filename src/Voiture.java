import java.sql.SQLOutput;

public class Voiture extends VehiculeAMoteur implements Vidangable{
    static int nbRoues = 4;
    int nbPortes = 5;
    boolean automatique;
    String couleur;
    int rapportCourant;

    Voiture() {
        super(new Moteur());
    }

    Voiture(String couleur) {
        this();
        this.couleur = couleur;
        System.out.println("Une voiture est construite avec une couleur");
    }

    Voiture(int nbPortes) {
        this();
        this.nbPortes = nbPortes;
        System.out.println("Une voiture est construite avec un nombre de portes");
    }

    Voiture(Moteur moteur) {
        super(moteur);
    }

    Voiture(String carburation, int nbCylindre) {
        this();
        Moteur moteur = new Moteur();
        moteur.carburation = carburation;
        moteur.nbCylindres = nbCylindre;
        this.moteur = moteur;
    }

    static void klaxoner() {
        System.out.println("Tutut!!!");
    }

    int passerRapport(boolean augmenter) {
        if(augmenter) {
            this.rapportCourant++;
        } else {
            this.rapportCourant--;
        }
        return this.rapportCourant;
    }

    Ville transporter(Passager passager, Ville villdeDepart) {
        System.out.println("La voiture transporte un passager qui s'appelle "+passager.prenom+" "+passager.nom);
        Ville villeDestination = new Ville();
        villeDestination.nom = "Tourcoing";
        return villeDestination;
    }

    static void tourner(boolean droite, int angle) {
        String droiteOuGauche = null;
        if(droite) {
            droiteOuGauche = "droite";
        } else {
            droiteOuGauche = "gauche";
        }
        System.out.println("Les "+nbRoues+" de la voiture tourne à "+droiteOuGauche+" à un angle de "+angle);
    }


    @Override
    public void vidanger() {
        System.out.println("Déboucher le bouchon sous la place du passager et attendre que ca coule");
    }
}
