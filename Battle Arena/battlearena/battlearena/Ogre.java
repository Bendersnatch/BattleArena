package battlearena;

public class Ogre extends Enemy implements IOgre{
    public Ogre(int healthPoints, int attackDamage){
        super(healthPoints, attackDamage);
    }

    @Override
    public void talk(){
        System.out.println("WAAAAAGHH!, urla l'ogro sputtando la saliva...");
    }

    @Override
    public void specialAttack(){
        boolean didSpecialAttackWork = Math.random() < .20;
        if(didSpecialAttackWork){
            setAttackDamage(getAttackDamage() + 4);
            System.out.println("Ogre va in ira e va in carica!");
        }
    }

    @Override
    public void stareDown(){
        System.out.println("l'Ogre ti guarda con il disprezzo");
    }
}
