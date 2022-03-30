package Lab2.ch1;

public class Fighter
{
    private int health;
    private int damagePerAttack;
    private String name;
    public Fighter(int health, int damagePerAttack,String name)
    {
        this.health = health;
        this.damagePerAttack = damagePerAttack;
        this.name=name;
    }
    public void attack(Fighter fighter)
    {
        fighter.health = fighter.health - this.damagePerAttack;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }
}

