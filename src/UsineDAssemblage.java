public class UsineDAssemblage {
    VehiculeAMoteur assembler() {
        Moteur moteur = new Moteur();
        moteur.carburation = "Gazoile";
        moteur.nbCylindres = 7;
        VehiculeAMoteur vam = new VehiculeAMoteur(moteur);
        return vam;
    }
}
