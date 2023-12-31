public class DecoyDuck extends Duck implements Quackable,Flyable
{
    private Flyable fb;
    private Quackable qb;
    public DecoyDuck(Flyable fb,Quackable qb)
    {
        this.fb=fb;
        this.qb=qb;
    }
    public void fly()
    {
        fb.fly();
    }
    public void quack()
    {
        qb.quack();
    }
    public void display()
    {
        System.out.println("DecoyDucks are awesome");
    }

}