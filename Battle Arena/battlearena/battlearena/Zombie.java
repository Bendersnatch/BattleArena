package battlearena;

public class Zombie extends Enemy{
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

    public void spreadDisease(){
        System.out.println("Zombie cerca di contaggiarti con il coviddi!");
    }
}
