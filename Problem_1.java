
class Enemy_At{
    int health,attack_power;
}
class Enemy1 extends Enemy_At{
    void fly(int health)
    {
        this.health=health;
    }
    void display()
    {
        System.out.println("Fly with the health value of: "+health);
    }
}
class Enemy2 extends Enemy_At{
    void shoot(int attack_power)
    {

        this.attack_power=attack_power;
    }
    void display()
    {

        System.out.println("Shoot with the attack power of: "+attack_power);
    }
}
public class Problem_1 {
    public static void main(String[] args)
    {
        Enemy1 e1=new Enemy1();
        Enemy2 e2=new Enemy2();
        e1.fly(100);
        e2.shoot(50);
        e1.display();
        e2.display();
    }
}
