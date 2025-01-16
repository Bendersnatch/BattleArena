package battlearena;


public class Main {
    public static void main(String[] args) {
        Zombie zombie = new Zombie( 10, 1);
        Ogre ogre = new Ogre(20, 3);

        System.out.println("Nemico ha " + zombie.getHealthPoints() + " punti di vita e ha " + zombie.getAttackDamage() + " punti d'attacco.");

        zombie.talk();
        zombie.spreadDisease();

        ogre.talk();
    }
}
