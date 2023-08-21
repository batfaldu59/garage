public class Port {
    public void accueillirEngin(Amarable amarable) {

        if(amarable instanceof Bateau) {
            System.out.println("Il s'agit bien d'un bateau");
        }

        int nbCordes = amarable.combienDeCorde(50);
        System.out.println("Le nombre de cordes nécessaire est de "+nbCordes);
    }
}
