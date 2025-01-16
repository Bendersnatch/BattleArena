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

    public void spreadDisease(){
        System.out.println("Zombie cerca di contaggiarti con il coviddi!");
    }
}
