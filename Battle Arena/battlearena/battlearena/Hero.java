package battlearena;

public class Hero implements IHero{
    private int healthPoints;
    private int healthPointsRemaining;
    private int attackDamage;
    private boolean isWeaponEquipped = false;

    //composition
    private Weapon weapon;

    public Hero(int healthPoints, int attackDamage){
        this.healthPoints = healthPoints;
        this.healthPointsRemaining = healthPoints;
        this.attackDamage = attackDamage;

    }

    @Override
    public int getHealthPoints(){
        return healthPoints;
    }
    @Override
    public int getHealthPointsRemaining(){
        return healthPointsRemaining;
    }
    @Override
    public void setHealthPointsRemaining(int healthPointsRemaining){
        this.healthPointsRemaining = healthPointsRemaining;
    }

}
