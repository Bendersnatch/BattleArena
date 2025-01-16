package battlearena;


public class Main {
    public static void main(String[] args) {
        Enemy zombie = new Zombie( 10, 1);


       System.out.println("Nemico ha " + zombie.getHealthPoints() + " punti di vita e ha " + zombie.getAttackDamage() + " punti d'attacco.");


    }
}