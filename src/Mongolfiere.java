public class Mongolfiere implements Amarable{

    int surface;

    @Override
    public int combienDeCorde(int vitesseDuVent) {
        int nbCordes = surface/50;
        nbCordes = nbCordes+vitesseDuVent/50;
        return nbCordes;
    }
}
