package battlearena;


public class Main {
    public static void main(String[] args) {
        Zombie zombie = new Zombie( 10, 1);
        Ogre ogre = new Ogre(20, 3);

        zombie.battleStance();
        ogre.stareDown();
        
        battle(zombie, ogre);
    }

    public static void battle(Enemy e1, Enemy e2){
      e1.talk();
      e2.talk();

      while(e1.getHealthPointsRemaining() > 0 && e2.getHealthPointsRemaining() > 0 ){
          System.out.println("---------");
          e1.specialAttack();
          e2.specialAttack();
          System.out.println("Nemico 1:" + e1.getHealthPointsRemaining() + " punti vita rimasti.");
          System.out.println("Nemico 2:" + e2.getHealthPointsRemaining() + " punti vita rimasti.");
          e2.attack();
          e1.setHealthPointsRemaining(e1.getHealthPointsRemaining() - e2.getAttackDamage());
          e1.attack();
          e2.setHealthPointsRemaining(e2.getHealthPointsRemaining() - e1.getAttackDamage());
      }
      System.out.println("-----K.O.-----");

      if (e1.getHealthPointsRemaining() > 0) {
          System.out.println("Nemico 1 ha vinto!");
      } else {
          System.out.println("Nemico 2 ha vinto");
      }
    }
}
