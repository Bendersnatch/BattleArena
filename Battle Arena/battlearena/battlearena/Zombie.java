package battlearena;

public class Zombie extends Enemy implements IZombie{
    public Zombie( int healthPoints, int attackDamage)
    {
        super(healthPoints, attackDamage);
    }

    @Override
    public void talk() {
        System.out.println("Grrrrmlll...");
    }

    @Override
    public void specialAttack(){
        boolean didSpecialAttackWork = Math.random() < .50;
        if(didSpecialAttackWork){
            setHealthPointsRemaining(getHealthPointsRemaining() + 2);
            System.out.println("Zombie si sta curando per 2 punti vita!");
        }
    }

    @Override
    public void battleStance() {
        System.out.println("Zombie si scrocchia il collo e allunga le mani");
    }
}
