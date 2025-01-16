package battlearena;

public class Enemy {
    private int healthPoints;
    private int attackDamage;

    public Enemy( int healthPoints, int attackDamage) {
        this.healthPoints = healthPoints;
        this.attackDamage = attackDamage;
    }

    public int getHealthPoints() {
        return healthPoints;
    }
    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }
    public int getAttackDamage() {
        return attackDamage;
    }
    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public void talk() {
        System.out.println("Sono tuo nemico, preparati!");
    }
    public void walkForward() {
        System.out.println(" viene contro di te!");
    }
    public void attack(){
        System.out.println( " ti infligge " + attackDamage + "di danni!");
    }

    public class Zombie extends Enemy {
        public Zombie(int healthPoints, int attackDamage){
            super(healthPoints, attackDamage);
        }
        public void talk() {
            System.out.println("Cervelloooo?! urla lo " + ". Ti sta attaccando!");
        }
        public void spreadVenom() {
            System.out.println("Zombie cerca ad atacarti il coviddi!");
        }
    }

    public class Ogre extends Enemy {
        public Ogre(int healthPoints, int attackDamage) {
            super(healthPoints, attackDamage);
        }
        public void talk(){
            System.out.println("WAAAAAGHH!, urla l'ogro sputtando la saliva...");
        }
    }

}

